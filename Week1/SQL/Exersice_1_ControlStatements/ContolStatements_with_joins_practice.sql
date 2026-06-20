select * from Customers;

select * from Accounts;
select * from  Transactions;
select * from Loans;

UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate * 0.99
WHERE TIMESTAMPDIFF(YEAR, c.DOB, CURDATE()) > 60;

SELECT c.CustomerID,
       c.Name,
       TIMESTAMPDIFF(YEAR, c.DOB, CURDATE()) AS Age,
       l.InterestRate
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID;


UPDATE Customers
SET IsVIP = TRUE
WHERE Balance > 10000;

select * from Customers;

SELECT c.CustomerID,c.Name,l.LoanID,l.EndDate,
       CONCAT('Reminder: Loan ', l.LoanID, ' is due on ', l.EndDate) AS Message
FROM Customers c JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.EndDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);