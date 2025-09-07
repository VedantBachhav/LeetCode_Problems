# Write your MySQL query statement below

select e.name, es.unique_id
From Employees as e
Left Join EmployeeUNI as es
on e.id = es.id;
