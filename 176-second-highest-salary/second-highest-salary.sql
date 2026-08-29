# Write your MySQL query statement below
select max(salary) as SecondHighestSalary
from (select id,salary,DENSE_RANK() OVER( ORDER BY salary DESC ) AS dn from Employee) t
WHERE dn = 2;