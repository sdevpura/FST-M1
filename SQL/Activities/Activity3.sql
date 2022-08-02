REM   Script: Activity3
REM   In this activity, we will be writing different SELECT statements with WHERE clause.

Write SELECT statements for the following outputs:

Show data from the salesman_id and salesman_city columns

Show data of salesman from Paris

Show salesman_id and commission of Paul Adam

SELECT salesman_id, salesman_city FROM salesman;

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

INSERT ALL  
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman where salesman_city='Paris';

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman where salesman_city='Paris';

SELECT salesman_id, commission FROM salesman where salesman_name = 'Paul Adam';

