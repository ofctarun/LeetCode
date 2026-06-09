WITH cte AS (
    SELECT
        name,
        salary,
        departmentId,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS rk
    FROM Employee
)
SELECT
    d.name AS Department,
    c.name AS Employee,
    c.salary AS Salary
FROM cte c
JOIN Department d
    ON c.departmentId = d.id
WHERE c.rk <= 3;