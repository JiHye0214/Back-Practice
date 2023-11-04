-- --------------------------------------
-- Sub Query

-- #7101
-- t_emp 테이블에서 
-- scott 보다 급여를 많이 받는 사람의 이름과 급여 출력

-- scott 의 급여는?
SELECT ename, sal
FROM t_emp
WHERE sal > (SELECT sal FROM t_emp WHERE ename = 'SCOTT') -- sub Query

-- 내가 해 본 코드
SELECT e.ENAME, e.SAL 
FROM t_emp e, t_emp t
WHERE e.sal > t.SAL AND t.ENAME = 'SCOTT';

-- --------------------------------------

-- 1. 단일행 서브쿼리
-- SubQuery 결과가 한개 1행만 나오는 것.
-- 단일행 Sub Query 의  WHERE 에서 사용되는 연산자
-- = , <> , !=, >, >= , <, <= 

-- #7103)연습
-- t_student, t_department 테이블 사용하여 
-- 이윤나 학생과 1전공(deptno1)이 동일한 학생들의 
-- 이름(name)과 1전공이름(dname)을 출력하세요

-- subquery 는 먼저 테스트 해보자 

SELECT s.name "이름", d.dname "전공명"
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno
AND s.deptno1 = (SELECT deptno1 FROM t_student WHERE name = '이윤나');

-- --------------------------------------

-- 2. 다중행 서브쿼리
-- Sub Query 결과가 2건 이상 출력되는 것을 말합니다.
-- 다중행 Sub Query 와 함께 사용하는 연산자
--		 IN 같은 값을 찾음
--		>ANY 최소값을 반환함 (서브쿼리 결과중 가장작은것보다 큰)
--		<ANY 최대값을 반환함 (서브쿼리 결과중 가장큰것보다 작은)
--		<ALL 최소값을 반환함 (서브쿼리 결과중 가장작은것보다 작은)
--		>ALL 최대값을 반환함 (서브쿼리 결과중 가장큰것보다 큰)
--		EXIST Sub Query 값이 있을 경우 반환

-- #7107) 예제
-- t_emp2, t_dept2 테이블 : 
-- 근무지역 (t_dept2.area) 이 서울 지사인 모든 사원들의 
-- 사번(empno)과 이름(name), 부서번호(deptno)를 출력하세요

SELECT * FROM t_emp2 ;
SELECT * FROM t_dept2 ;

SELECT dcode FROM t_dept2 WHERE area = '서울지사';

-- 다중행 - IN : 같은 값을 찾음 
-- in 없으면 에러 --> 괄호 안에 해당하는 게 4개라서 여러값을 반환하기 때문에 하나만을 비교하는 '=' 연산자 사용 못함
SELECT  empno, name, deptno FROM t_emp2
WHERE deptno IN (SELECT dcode FROM t_dept2 WHERE area = '서울지사');

-- 그냥 내가 해 본 거
SELECT e.EMPNO "사번", e.NAME "이름", e.DEPTNO "부서번호"
FROM t_emp2 e, t_dept2 d
WHERE e.DEPTNO = d.DCODE AND d.AREA = '서울지사';

-- --------------------------------------

-- #7108) 연습
-- t_emp2 테이블 : 
-- 전체직원중 과장 직급의 최소연봉자보다 
-- 연봉이 높은 사람의 
-- 이름(name)과 직급(post), 연봉(pay)을 출력하세요.  
-- 단, 연봉 출력 형식은 천 단위 구분 기호와 원 표시를 하세요

-- 과장의 연봉
SELECT PAY FROM  t_emp2 WHERE post = '과장';

SELECT e.NAME "이름", e.POST "직급", concat(format(e.PAY, 0), '원') "연봉" 
FROM t_emp2 e
WHERE pay > ANY(SELECT PAY FROM  t_emp2 WHERE post = '과장');



