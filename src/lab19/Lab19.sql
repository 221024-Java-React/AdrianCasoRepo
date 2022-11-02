-- all employees and their department
select e.employee_name, d.department_name from employee e inner join department d on e.department = d.department_id;


-- all departments with their employee 
select d.department_name, e.employee_name from employee e right join department d on e.department = d.department_id order by department;

-- each employee and the city they work from excluding employees who work from home
select e.employee_name, l.city from employee e left join location l on e.location = l.location_id where l.location_id  is not null;


-- Use a UNION to the return the Employees who either work in department 1, or location 1
select * from employee where department = 1
union
select * from employee where location = 1;

-- Use a MINUS to return the Employees who work in department 1, but not in location 1
select * from employee where department = 1
except
select * from employee where location = 1;

-- Use an INTERSECT to return the Employees who work in department 1 AND in location 1
select * from employee where department = 1
intersect
select * from employee where location = 1;

