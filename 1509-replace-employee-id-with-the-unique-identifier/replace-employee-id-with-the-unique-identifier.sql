SELECT es.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI es
ON e.id = es.id;
