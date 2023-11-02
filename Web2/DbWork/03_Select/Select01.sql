SELECT 'abcde';
SELECT '안녕하세요', '목요일입니다', 100+10; -- 그냥 넣기 가능

SELECT * FROM phonebook ; -- * : 모든 컬럼 의미(전체선택자 느낌)

SELECT * FROM t_emp ;

SELECT * FROM t_student ;
SELECT studno, name FROM t_student ; -- 명시한 그대로 나옴

SELECT studno 학번, name 이름 FROM t_student ; -- 별명 짓기 가능 
SELECT studno "학생 학번", name AS 이름 -- 띄어쓰기 하고 싶으면 따옴표 씌우기 / AS 이용 가능 
FROM t_student 

SELECT DISTINCT  deptno1 FROM t_student; -- DISTINCT : 중복 불허

SELECT 'a' + 'b'; -- 0 /ab 아님
SELECT concat('a', 'b'); -- concat()

-- null 값에 민감해지자
SELECT * FROM t_professor;

-- content를 바꾸면 필드명도 바뀌기 때문에 별명을 지어주면 보기 좋다.
SELECT concat(name, '-', POSITION) "교수님목록" FROM t_professor; 

