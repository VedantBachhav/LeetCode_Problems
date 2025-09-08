# Write your MySQL query statement below
select u.name, sum(t.amount) as balance 
from Users as u
Left Join Transactions as t
on u.account = t.account
group by u.name
having balance  >10000;
