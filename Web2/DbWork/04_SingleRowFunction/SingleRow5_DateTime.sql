SELECT
	now() "오늘"
	, now() + 1  -- date 타입이 정수 변환한뒤 +1 산술 연산 (오라클과는 다르다!)
;

-- 날짜 더하기, 빼기
-- DATE_ADD(date, INTERVAL 계산수 계산형식)
-- DATE_SUB(date, INTERVAL 계산수 계산형식)
-- 계산형식이란 월,일,시간 중 어떤걸 더할꺼냐를 선택하는 것이다.  

SELECT 
	now()
	, date_add(now(), INTERVAL 1 MONTH) "한달뒤"
	, date_add(now(), INTERVAL 1 DAY) "내일"	
	, date_add(now(), INTERVAL 2 DAY) "모레"	
	, date_add(now(), INTERVAL -1 DAY) "어제"	
	;

-- 단위
-- SECOND : 초
-- MINUTE : 분
-- HOUR : 시
-- DAY : 일
-- WEEK : 주
-- MONTH : 월
-- QUARTER : 분기
-- YEAR : 연

-- 날짜 차이 계산
-- DATEDIFF(날짜1, 날짜2); : 일 차이
-- TIMESTAMPDIFF(단위, 날짜1, 날짜2); : 연, 분기, 월, 주, 일, 시, 분, 초  .. 차이

SELECT now() "오늘", DATEDIFF(now(), '2023-09-07') "수업시작한지";

SELECT TIMESTAMPDIFF(SECOND, '2021-07-20', now());
SELECT TIMESTAMPDIFF(MINUTE, '2021-07-20', now());
SELECT TIMESTAMPDIFF(HOUR, '2021-07-20', now());

-- #4501
SELECT name "이름"
	, date_format(now(), '%Y-%m-%d') "오늘"
	, date_format(hiredate, '%Y-%m-%d') "입사일"
	, TIMESTAMPDIFF(YEAR, hiredate, now()) "근속연수"
	, TIMESTAMPDIFF(MONTH, hiredate, now()) "근속개월"
	, TIMESTAMPDIFF(DAY, hiredate, now()) "근속일수"
FROM t_professor;




