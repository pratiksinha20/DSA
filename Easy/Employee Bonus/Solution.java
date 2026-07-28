-- Write your PostgreSQL query statement below

SELECT E.name, B.bonus FROM Employee E
Left Join Bonus B
ON E.empId=B.empId
Where B.Bonus <1000 or Bonus IS null;