-- 3. 다중칼럼 Sub Query
-- Sub Query 결과가 여러 칼럼인 경우.  
-- 주로 Primary Key 를 여러 칼럼을 합쳐서 만들었을 경우 한꺼번에
-- 비교하기 위해서 자주 사용.


--#7201) 예제
-- t_student 테이블을 조회하여
-- 각 학년별로 최대 키를 가진 학생들의
-- 학년과 이름과 키를 출력하세요
-- 학년 오름차순으로 출력

SELECT s.grade, max(s.height)  
FROM t_student s 
GROUP BY grade; -- 그룹함수 어쩌고 규칙 기억하기

SELECT grade "학년" , name "이름", height "키"
FROM t_student 
WHERE (grade, height) IN (SELECT grade, max(height) FROM t_student GROUP BY grade)
-- order by 학년 asc
-- order by grade asc
ORDER BY 1 ASC ;

-- --------------------------------------------

-- 4. 상호연관 Sub Query
-- Main Query 값을 Sub Query 에 주고 
-- Sub Query를 수행한 후 그 결과를 다시 
-- Main Query 로 반환해서 수행하는 쿼리.
				
-- #7205) 연습
-- t_emp2 테이블 :  
-- 직원들 중에서 자신의 직급의 평균연봉과 
-- 같거나 많이 받는 사람들의 
-- 이름과 직급, 현재 연봉을 출력하세요.

-- outer(select, from) -> sub -> outer(where)
SELECT a.NAME "사원이름", ifnull(a.POST, '') "직급", a.PAY "급여"
FROM t_emp2 a
WHERE a.PAY >= (SELECT avg(b.pay) FROM t_emp2 b WHERE ifnull(a.post, '') = ifnull(b.post, '')) -- ifnull 안 하면 안 보여줌

-- --------------------------------------------

-- 스칼라 서브쿼리
SELECT (SELECT 10), (SELECT 20)

-- #7206) 예제
-- t_emp2, t_dept2 테이블: 
-- 조회하여 사원들의 이름과 부서 이름을 출력

SELECT e.NAME "사원이름", (SELECT d.DNAME FROM t_dept2 d WHERE e.DEPTNO = d.DCODE) "부서이름"
FROM t_emp2 e;

-- JOIN 과 같은 결과 나옴.  
-- 그러나 데이터 양이 적은 경우 : 스칼라서브쿼리 > Join

