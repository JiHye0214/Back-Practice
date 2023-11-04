-- 테이블에 별명 주기
SELECT s.studno, s.name, s.deptno1 FROM t_student s; -- 20

SELECT d.deptno, d.dname FROM t_department d; -- 12

-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면, 
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면 
-- 모든 카티션곱이 출력된다. 

-- ▶ from 절에 여러개의 table 나열하기
-- 결과 : 엮어서 나오는 모든 경우의수 보여줌
SELECT s.studno, s.name, s.deptno1 , d.deptno , d.dname 
FROM t_student s, t_department d ; -- 240

SELECT s.studno, s.name, s.deptno1 , d.deptno , d.dname 
FROM t_student s CROSS JOIN t_department d ; -- 240

SELECT s.studno, s.name, s.deptno1 , d.deptno , d.dname 
FROM t_student s, t_department d WHERE s.deptno1 = d.deptno; -- 값이 같은 것만 걸러내기

-- ---------------------------------------------------------------------------------
-- Equi Join (등가 Join)
-- 일반적으로 많이 쓰이는 Join 이며, 양쪽 테이블 Join 한 카티션곱에서 ‘같은조건’이 존재할 경우만 값을 가져오는 것

-- 예) #6101 
-- t_student 테이블과 t_department 테이블을 사용하여 학생이름, 1전공 학과번호, 1전공 학과 이름을 출력하세요

-- MySQL 구문
SELECT s.name, s.deptno1, d.dname 
FROM t_student s, t_department d WHERE s.deptno1 = d.deptno; -- equi JOIN 조건

-- ANSI SQL 구문
SELECT s.name, s.deptno1, d.dname 
FROM t_student s join t_department d ON s.deptno1 = d.deptno; 

-- 제2전공
-- ★ null 값은 아래 JOIN조건에 참여 안함.
SELECT s.name, s.deptno2 "제2학과번호", d.dname "제2학과이름"
FROM t_student s, t_department d WHERE s.deptno2 = d.deptno;

-- 연습 #6102)
-- t_student 테이블, t_professor 테이블 을 join하여
-- ‘학생이름’, ‘지도교수번호’, ‘지도교수이름’ 을 출력하세요

-- MySQL
SELECT s.name "학생이름", p.PROFNO "지도교수번호", p.NAME "지도교수이름"
FROM t_student s, t_professor p
WHERE s.profno = p.PROFNO ;

-- ANSI SQL
SELECT s.name "학생이름", p.PROFNO "지도교수번호", p.NAME "지도교수이름"
FROM t_student s JOIN t_professor p
ON s.profno = p.PROFNO ;

-- #6103
SELECT s.name "학생이름", d.dname "학과이름", p.NAME "교수이름"
FROM t_student s, t_department d, t_professor p
WHERE s.deptno1 = d.deptno AND s.profno = p.PROFNO ;

-- ANSI SQL
SELECT s.name "학생이름", d.dname "학과이름", p.NAME "교수이름"
FROM t_student s JOIN t_department d ON s.deptno1 = d.deptno
	JOIN t_professor p ON s.profno = p.PROFNO ;
