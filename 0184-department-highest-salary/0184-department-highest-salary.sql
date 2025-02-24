SELECT  
    d.name as Department,  
    e.name as Employee,  
    e.salary as Salary  
FROM  
    Employee e  
JOIN  
    Department d  
ON  
    e.departmentId = d.id  
WHERE  
    e.salary = (SELECT max(salary) FROM Employee WHERE departmentId = d.id);