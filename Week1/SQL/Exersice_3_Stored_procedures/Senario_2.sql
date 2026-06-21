Drop procedure if exists UpdateEmployeeBonus;
Delimiter // 
Create Procedure UpdateEmployeeBonus (in bDepartment varchar(50) ,in bonusPercent int)
Begin 
 declare exit handler for SQLException 
  begin 
	ROLLBACK;
end;

Start Transaction ;

update employees set Salary = Salary +(Salary * bonusPercent/100  ) where Department = bDepartment;
		
Commit;
end //
delimiter ;

call UpdateEmployeeBonus('HR',2);

select * from employees;

