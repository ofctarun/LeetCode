WITH x AS (
    SELECT
        d.name Department,
        e.name Employee,
        e.salary Salary,
        DENSE_RANK() OVER(
            PARTITION BY d.name
            ORDER BY e.salary DESC
        ) r
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM x
WHERE r <= 3;