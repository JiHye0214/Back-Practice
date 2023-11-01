SELECT 'abcde';
SELECT '안녕하세요', '화요일', 100 + 10;

-- 이클립스 단축키 사용
-- Lower case: CTRL+SHIFT+Y
-- Upper case: CTRL+SHIFT+X
-- 
-- 
-- SELECT - 데이터 조회/질의
-- SELECT [컬럼명 또는 표현식] FROM [테이블명, 뷰명]

-- '모든 컬럼' 조회 : * 사용

SELECT * FROM phonebook; 

-- 원하는 컬럼만 조회
SELECT * FROM t_emp;

SELECT empno, ename FROM t_emp;
SELECT ename, empno, empno, empno, 100, '하하' FROM t_emp;

SELECT * FROM t_student ;
-- 컬럼 별칭(alias) 사용하여 출력
SELECT studno 학번, name 이름 FROM t_student ;

SELECT studno "학생 학번", name AS 이름
FROM t_student 
;


SELECT DISTINCT deptno1 FROM t_student;


SELECT 'a' + 'b';  -- 0 ??

-- 문자열 연결 concat()
SELECT concat('a', 'b');

SELECT * FROM t_professor;
SELECT concat(name, '-', POSITION) "교수님목록" FROM t_professor;







