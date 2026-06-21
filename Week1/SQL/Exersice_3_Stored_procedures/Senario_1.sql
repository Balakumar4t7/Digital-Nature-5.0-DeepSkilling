delimiter //

create procedure ProcessMonthlyInterest()
begin 
declare exit handler for sqlexception
begin 
	rollback;
end;

start transaction ;
update accounts set Balance = Balance * 1.01 where AccountType='Savings';
commit;
end //
delimiter ;
call ProcessMonthlyInterest();

select * from accounts;


