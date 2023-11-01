-- null 값과의 산술 연산 결과는 null 이다
SELECT name, pay, bonus, pay + bonus FROM t_professor;

-- IFNULL : NULL값을 만나면 다른 값으로 치환해서 출력하는 함수
-- ISNULL : NULL 인지 체크하는 함수  (null 이면 1, 아니면 0 리턴)
-- IF : 첫번째 인자는 '참/거짓' 판정하여 '참' 이면 두번째 값을, '거짓' 이면 세번째 값을 리턴
--      숫자타입의 경우 0 이면 '거짓', 0 이외의 수는 '참' 판정
--      null 이면 '거짓' 판정

SELECT bonus, ifnull(bonus, 0), isnull(bonus), if(bonus, bonus, 0) FROM t_professor;  -- NULL 값은 거짓 판정

SELECT name, pay, bonus, pay + ifnull(bonus, 0) FROM t_professor;





