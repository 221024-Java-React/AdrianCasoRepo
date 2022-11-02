
create table department (
	department_id int primary key,
	department_name varchar(50),
	monthly_budget numeric(7, 2)
);

create table location (
	location_id int primary key,
	street varchar(25),
	city varchar(25),
	state varchar(2),
	zipcode int
);

create table employee (
	employee_id int primary key,
	employee_name varchar(64),
	birthday date,
	monthly_salary numeric(7, 2) not null,
	department int references department(department_id) not null,
	hire_date date,
	position varchar(20),
	manager int,
	location int references location(location_id)
);


-- total number of employees
select count(*) from employee;


-- average monthly by department
select department, round(avg(monthly_salary)) as average 
from employee 
group by department
order by department;


-- employee with the highest salary
select employee_name as name, monthly_salary as salary 
from employee
where monthly_salary
in (
	select max(monthly_salary)
	from employee
);

select * from employee where employee_name like 'MAL%';


