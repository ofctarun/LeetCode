select e.name as department,d.name as employee , salary from 
(select name,departmentId,salary,dense_rank() over (partition by departmentId order by salary desc) as rk from employee) e
left join department d on e.departmentId = d.id
where rk <= 3