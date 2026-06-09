# Write your MySQL query statement below
with cte1 as (select name, salary, dense_rank()over(partition by departmentId order by salary desc)as ranking, departmentId 
from employee)
select b. name as department, a.name as employee, a.salary
from cte1 a inner join department b
on a.departmentId = b.id
where a.ranking <= 3;