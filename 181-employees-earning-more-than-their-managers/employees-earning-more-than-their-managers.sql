# Write your MySQL query statement below
select b.name as Employee from Employee as a
join Employee as b
on a.id = b.managerId
where a.salary < b.salary;

