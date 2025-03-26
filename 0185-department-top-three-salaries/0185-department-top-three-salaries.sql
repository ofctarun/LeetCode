
WITH cte AS
(
SELECT 
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary,
    DENSE_RANK() OVER(PARTITION BY d.id ORDER BY e.salary DESC) AS rank
FROM 
    Employee e
JOIN
    Department d on e.departmentId = d.id 
)

SELECT
    Department,
    Employee,
    Salary
FROM 
    cte 
WHERE
    rank <4;