use test;
create table login 
(username varchar(20),
password varchar(20),
PRIMARY KEY(username));

create table course 
(course_id varchar(20),
course_name varchar(20),
student  varchar(20),
PRIMARY KEY(course_id),
FOREIGN KEY (student) REFERENCES login(username));
