DELIMITER //
create procedure SafeTransferFund (in sender int ,in receiver int , in amount Decimal(10,2))  
begin 

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
    ROLLBACK;
    INSERT INTO ErrorLog
    VALUES(
        'Some Error Occurred',
        NOW()
    );
END;
start transaction;
if not exists(
	select * from accounts where AccountID = sender) 
    then signal SQLState '45000'
    set message_text='Sender Not found';
    end if;
    
if not exists(
	select * from accounts where AccountId = receiver) 
    then signal SQLState '45000'
    set message_text='Receiver Not found';
    end if;
    
if (select Balance from accounts where AccountID = sender ) < amount
	then signal SQLState '45000'
    set message_text='Insufficient Balance Can not Transerfer Money';
    end if;
    
update accounts set Balance = Balance - amount where AccountID = sender;

update accounts set Balance = Balance + amount where AccountId = receiver;

commit;
end //
DELIMITER ;

call SafeTransferFund(1,2,500);

select * from accounts;
select * from ErrorLog;

