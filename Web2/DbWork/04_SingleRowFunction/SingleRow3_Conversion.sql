-- MySQL 은 필요시 string -> number, 혹은 number -> string 으로 묵시적 형변환 수행
SELECT 1 + '1';
SELECT concat(1, '1');

SELECT 1 + CAST('1' AS SIGNED);  -- 내부적으론 이와 같이 동작

-- 묵시적 형변환은 편한것 같지만, 
-- 튜닝에서 뜻하지 않은 성능저하를 가져올수 있다.

-- 명시적 형변환 
-- CAST(expr AS type) 
-- CONVERT(expr, type)

SELECT 38.8, CAST(38.8 AS CHAR), CONVERT(38.8, CHAR);

-- BINARY[(N)]
-- CHAR[(N)] [charset_info]
-- DATE
-- DATETIME
-- DECIMAL[(M[,D])]
-- JSON
-- NCHAR[(N)]
-- SIGNED [INTEGER]
-- TIME
-- UNSIGNED [INTEGER]

-- -----------------------------------
-- 날짜 -> 숫자
SELECT now(), YEAR(now()), MONTH(now()), DAY(now()), weekday(now()), HOUR(now()), MINUTE (now()), SECOND(now());

-- ################################################
-- 날짜 --> 원하는 포맷의 문자로 리턴
-- DATE_FORMAT() 함수
-- https://dev.mysql.com/doc/refman/8.0/en/date-and-time-functions.html

SELECT now(), DATE_FORMAT(now(), '%Y%m%d');
SELECT now(), DATE_FORMAT(now(), '%Y-%m-%d %H:%i:%s');
SELECT now(), DATE_FORMAT(now(), '%Y년%m월%d일 %H시%i분%s초');

-- ################################################
-- format() 함수
-- 숫자 를 포맷팅하여 문자로 리턴
-- FORMAT(number, decimal_places)

-- 참조: https://www.w3schools.com/sql/func_mysql_format.asp

-- 숫자 세자리마다 콤마 찍기
SELECT 1234567, format(1234567, 0);
SELECT format(250250.5634, 0);
SELECT format(250250.5634, 2); -- 250,500.56



