
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




