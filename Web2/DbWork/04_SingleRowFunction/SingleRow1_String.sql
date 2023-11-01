-- lower(), upper()

SELECT 'Hello', lower('Hello'), upper('Hello');

SELECT name, id, upper(id) FROM t_student WHERE deptno1 = 201;

-- length()
SELECT 'Hello', length('Hello'), LENGTH('도레미');  -- byte 단위 개수

-- char_length()
SELECT char_length('한글'); 

-- t_student 테이블 : 
-- ID가 9글자 이상인 학생들의 
-- 이름과 ID 와 글자수 출력 / length() 사용

SELECT name 이름, id, length(id) 글자수 FROM t_student WHERE LENGTH(id) >= 9; -- 단일행함수는 WHERE 조건절에서 사용 가능

---------------------------------------------
-- SUBSTR 함수 
-- 구문: SUBSTR( '문자열' 또는 컬럼명,   시작위치,  추출할 글자수 )
-- 문자열에서 특정 길이의 문자를 추출할 때 사용하는 함수
-- 시작위치, 음수 가능.
-- ★ 시작 인덱스가 1부터 시작한다 (인덱스는 1부터 시작) 

SELECT substr('ABCDE', 2, 3);
SELECT substr('ABCDE', 2);
SELECT substr('ABCDE', 20, 3);
SELECT substr('ABCDE', -2, 2);  -- DE  음수 인덱싱 가능

-- #4108
SELECT name, substr(jumin, 1, 6) FROM t_student
WHERE 
	substr(jumin, 3, 2) = '08'
	-- jumin LIKE '__08%'
;

-- -----------------------------------------------
-- INSTR()
-- 주어진 문자열이나 컬럼에서 특정 글자의 위치를 찾아주는 함수 (인덱스 리턴)

SELECT INSTR('ABCDEFG', 'D');
SELECT INSTR('ABCDEFG', 'EF');
SELECT INSTR('ABCDEFG', 'EFX');  -- 0 못찾으면 0

-- #4110
-- t_student 테이블 : 
-- tel 칼럼을 사용하여 
-- 101번 학과(deptno1) 의 학생의 이름과 전화번호, ')' 가 나오는 위치 출력  
-- / instr() 사용

SELECT name, tel, instr(tel, ')') FROM t_student;

-- #4111 
-- 실습]
SELECT name, tel, substr(tel, 1, instr(tel, ')') - 1) 지역번호 FROM t_student WHERE deptno1 = 101;



