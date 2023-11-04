-- INSERT 의 subquery
-- CREATE TABLE 
-- UPDATE 의 set 절 

CREATE TABLE test_emp_a (
   emp_id    INT,
   emp_name  VARCHAR(100)
);

CREATE TABLE test_emp_b (
   emp_id    INT,
   emp_name  VARCHAR(100)
);

DELETE FROM test_emp_a;
DELETE FROM test_emp_b;

-- 한 row 씩 INSERT
INSERT INTO test_emp_a VALUES(101, '아이언맨');

INSERT INTO test_emp_b VALUES(201, '캡틴아메리카');

SELECT * FROM test_emp_a;

-- 여러개의 row를 한번에 insert 
INSERT INTO test_emp_a
VALUES (102, '김도영'), (103, '이의리'), (103, '윤영철')

-- sub query 로 insert 가능
INSERT INTO test_emp_a (SELECT 105, '최지민')

-- x2 배
INSERT INTO test_emp_a (SELECT * FROM test_emp_a)

SELECT * FROM test_emp_a;
SELECT * FROM test_emp_b;

INSERT INTO test_emp_b(emp_id) (SELECT emp_id FROM test_emp_a);

-- a table 복붙
CREATE TABLE test_emp_c
AS
SELECT * FROM test_emp_a;

SELECT * FROM test_emp_c;

















