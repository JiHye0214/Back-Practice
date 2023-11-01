
SELECT count(*) FROM t_professor;
SELECT count(name), count(hpage), count(bonus) FROM t_professor;  -- 그룹함수에서 집계할때 null 값은 (기본적으로) 계산에서 제외

SELECT sum(pay), avg(pay), avg(bonus), max(hiredate), min(hiredate) FROM t_professor;

-- 교수님들의 보너스 평균값 출력 ( AVG() 사용)
-- 그룹함수는 null 값은 계산안하기 때문에
-- null 허용 필드에 대해 계산할때는 반드시 ifnull 등을 사용하여 처리해야 함

SELECT avg(bonus), avg(ifnull(bonus, 0)) FROM t_professor;

-- t_professor 테이블에서 '학과별'로 교수들의 평균 급여를 출력하세요
SELECT deptno, avg(pay) FROM t_professor;
-- SELECT 절에 그룹함수 아닌 것과 그룹함수는 같이 올수는 없다.  이 경우 그룹함수가 아닌 것들은 GROUP BY 로 묶여야 할 것이다.

SELECT deptno, avg(pay) FROM t_professor GROUP BY deptno;

-- #5101)연습
-- t_professor 테이블 : 학과별(deptno) 그리고 직급별(position)로 교수들의 평균 급여를 계산하여 출력하세요
SELECT deptno, POSITION, avg(pay) 평균급여 FROM t_professor
GROUP BY deptno, POSITION
ORDER BY deptno ASC, POSITION ASC
;

-- 학과별 평균급여를 출력하되, 평균급여가 400 보다 많은 학과만 출력
SELECT deptno, avg(pay) FROM t_professor
-- WHERE avg(pay) > 400   -- 그룹함수는 where 절에서 사용 불가
GROUP BY deptno
HAVING avg(pay) > 400
;

-- <SELECT 쿼리문 순서>  -   처리순서
--  SELECT             - (5)
--  FROM               - (1)
--  WHERE              - (2)
--  GROUP BY           - (3)
--  HAVING             - (4)
--  ORDER BY           - (6)

-- #5104)연습
-- t_student 테이블 : 학과별(deptno1) 로,  
-- 학과번호, 최대몸무게 - 최소몸무게 차이 값을 출력해보세요

SELECT
	deptno1 "학과", max(weight) - min(weight) "최대최소몸무게차" 
FROM t_student
GROUP BY deptno1
;

-- #5105) 그 차이가 30 이상인것만 출력하려면?
SELECT
	deptno1 "학과", max(weight) - min(weight) "최대최소몸무게차" 
FROM t_student
GROUP BY deptno1
HAVING (max(weight) - min(weight)) >= 30
;

-- 요즘 MySQL 은 아래와 같이 가능
SELECT
	deptno1 "학과", max(weight) - min(weight) "최대최소몸무게차" 
FROM t_student
GROUP BY deptno1
HAVING 최대최소몸무게차 >= 30  -- SELECT 이전임에도 SELECT 의 alias 를 사용가능? <-- 요즘 dB 엔진에선 다시 흝는다.
;












