
-- view 정의
CREATE VIEW v_prof
as
SELECT PROFNO, NAME, EMAIL, HPAGE 
FROM t_professor ;

SELECT * FROM v_prof; -- 생긴 게 아니라 얘를 쓰면 위에 게 보여짐 

-- 필드명 지정하기
-- 지정 안 하면 select 된 게 보여짐 
CREATE OR REPLACE VIEW v_prof(pfno, nm, em, hp) -- CREATE OR REPLACE : 있으면 바꿔라
as
SELECT PROFNO, NAME, EMAIL, HPAGE 
FROM t_professor ;

SELECT * FROM v_prof;

-- 물리적인 table은 아니지만 당당히 이름을 올림
-- view 용도 : 자주 쓰는 쿼리문을 view로 정의해서 사용
SHOW tables;

-- 인라인뷰
-- View 는 한번 만들어 놓으면 계속 사용할수 있습니다.
-- 그러나 1회용으로만 사용할 경우는 FROM 절의 서브쿼리 형태로 만들수 있습니다. 
-- 이러한 뷰를 Inline View 라 합니다.

-- #8103) 예제
-- t_student, t_department 테이블 : 
-- 학과별로 학생들의 최대키와 최대몸무게, 학과 이름을 출력하세요

-- 우선, 학과별 최대키, 최대몸무게

SELECT deptno1, MAX(height) "max_height", MAX(weight) "max_weight"
FROM t_student
GROUP BY deptno1;

SELECT d.dname "학과명", s.max_height, s.max_weight
FROM
	(SELECT deptno1, MAX(height) "max_height", MAX(weight) "max_weight"
	FROM t_student
	GROUP BY deptno1) s, t_department d
WHERE s.deptno1 = d.deptno
;


