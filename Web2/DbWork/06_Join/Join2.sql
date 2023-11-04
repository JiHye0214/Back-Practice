-- 비등기 조인 (Non-Equi Join)

-- #6201) 
-- t_customer 테이블, t_gift 테이블을 join 하여  
-- 고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여 
-- 고객의 '이름(c_name)'과 포인트(c_point) 상품명(g_name)을 출력하세요
-- BETWEEN ~ AND ~ 사용

-- MySQL
SELECT c.c_name "이름", c.c_point "포인트", g.g_name "상품명"
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end 
ORDER BY g.g_name DESC ;

-- ANSI
SELECT c.c_name "이름", c.c_point "포인트", g.g_name "상품명"
FROM t_customer c join t_gift g
on c.c_point BETWEEN g.g_start AND g.g_end 
ORDER BY g.g_name DESC ;

--  #6204) 연습
-- t_customer 와 t_gift 테이블 join : 
-- 자기 포인트(c_point) 보다 낮은 포인트의 상품 중 
-- 한가지를 선택할수 있다고 할때 
-- '산악용자전거'를 선택할 수 있는 
-- 고객명(c_name)과 포인트(c_point), 
-- 상품명(g_name)을 출력하세요

-- 선택할 수 있는 모든 경우의수 중에서 산악자전거에 해당하는 값

-- MySQL
SELECT c.c_name "이름", c.c_point "포인트", g.g_name "상품명"
FROM t_customer c, t_gift g
WHERE g.g_start <= c.c_point -- JOIN 조건
AND g.g_start = 400001; -- 일반 검색 조건 -- 카티션곱의 값을 최소화하기 위해서 일반검색조건을 먼저 실행된다(내부적으로)
-- g.g_name = '산악용자전거'

-- ANSI
SELECT c.c_name "이름", c.c_point "포인트", g.g_name "상품명"
FROM t_customer c JOIN t_gift g
on g.g_start <= c.c_point AND g.g_start = 400001;

SELECT c.c_name "이름", c.c_point "포인트", g.g_name "상품명"
FROM t_customer c JOIN t_gift g on g.g_start <= c.c_point
WHERE g.g_start = 400001;

-- -------------------------------------------------------
-- 지금까지의 JOIN 은 모두 INNER JOIN 이다.

SELECT s.name, p.name
FROM t_student s, t_professor p
WHERE s.profno  = p.PROFNO;

SELECT s.name, p.name
FROM t_student s INNER JOIN t_professor p  -- 사실은 이게 INNER JOIN . (INNER 는 보통 생략함)
ON s.profno  = p.PROFNO;

-- ---------------------------------
-- OUTER JOIN

-- #6206)
-- t_student 테이블과 t_professor 테이블 Join : 
-- 학생이름과 지도교수 이름을 출력하세요. 
-- 단! 지도교수가 결정되지 않은 학생의 명단도 함께 출력하세요

-- ** 기존의 INNER Join 방식으로 먼저 만들어 보고 OUTER Join 을 해보고 비교해보자
-- 그럼 이런 문제에서는 ANSI 구문만 사용할 수 있겠구만

SELECT s.name "학생이름", p.NAME "지도교수이름"
FROM t_student s LEFT OUTER JOIN t_professor p
ON s.profno = p.PROFNO ;

-- #6207)
-- t_student, t_professor 테이블 join :  
-- 학생이름과 지도교수 이름을 출력, 
-- 단! 지도 학생이 결정되지 않은 교수 명단도 출력

SELECT s.name "학생이름", p.NAME "지도교수이름"
FROM t_student s RIGHT JOIN t_professor p -- OUTER 생략 가능 (mySQL 한정)
ON s.profno = p.PROFNO ;

-- #6208)
-- t_student, t_professor 테이블 join :  
-- 학생이름과 지도교수 이름을 출력, 
-- 단! 지도 학생이 결정되지 않은 교수 명단, 
-- 지도교수가 결정되지 않은 학생명단 모두 출력

SELECT s.name "학생이름", p.NAME "지도교수이름"
FROM t_student s FULL JOIN t_professor p -- FULL OUTER JOIN <- error : mySQL은 지원하지 않는다
ON s.profno = p.PROFNO ;

-- 대신 union 사용
SELECT s.name "학생이름", p.NAME "지도교수이름"
FROM t_student s LEFT OUTER JOIN t_professor p
ON s.profno = p.PROFNO
UNION 
SELECT s.name "학생이름", p.NAME "지도교수이름"
FROM t_student s RIGHT JOIN t_professor p 
ON s.profno = p.PROFNO ;


SELECT * FROM t_dept2 ;

-- ----------------------------------------------
-- self join

-- #6209) 
-- t_dept2 테이블에서 
-- 부서명 과 그 부서의 상위부서명을 출력하세요

SELECT d.DNAME "부서명", p.DNAME "상위부서명"
FROM t_dept2 d, t_dept2 p -- SELF JOIN은 별명 필수임 
WHERE d.PDEPT = p.DCODE ;

-- #6210)
-- t_professor 테이블 : 교수번호, 교수이름, 입사일, 
-- 그리고 자신보다 입사일 빠른 사람의 인원수를 출력하세요, 
-- 단 자신보다 입사일이 빠른 사람수를 오름차순으로 출력하세요
-- hint: left outer 사용 
--         / 그룹함수 사용

-- 자신보다 빠른 사람들의 입사일을 select

SELECT a.profno "교수번호", a.name "교수명", a.hiredate "입사일", b.name "빠른교수", b.hiredate "빠른입사일"
FROM t_professor a LEFT JOIN t_professor b ON a.hiredate > b.hiredate
ORDER BY 3 -- 인덱싱 가능 

-- count() + group by
-- ※ count() 쓰면 해당하는 필드에서 값이 바뀐다
-- ★★★ select에 그룹함수인 것과 아닌 것이 함께 있을 때는 group by에 그룹함수 아닌 애들을 한 번 더 써줘야 한다.
SELECT a.profno "교수번호", a.name "교수명", a.hiredate "입사일", count(b.hiredate) "빠른사람"
FROM t_professor a LEFT JOIN t_professor b ON a.hiredate > b.hiredate
GROUP BY a.profno, a.name, a.hiredate
ORDER BY 3
;
