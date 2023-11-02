-- DCL : Data Control Language
-- commit : 작업결과를 물리적 디스크에 저장.  manipulation 작업이 정상적으로 완료
-- rollback : 원래의 데이터 상태로 복구

-- 테이블과 데이터 준비

DESC phonebook;
SELECT * FROM phonebook ;

DROP TABLE IF EXISTS phonebook; 
# 여기 대고 Ctrl + Enter 누르면 바로 phonebook 사라진다 조심해라

-- 기본적으로 MySQL 은 auto-commit 이다
-- DML 은 실행 즉시 물리적인 데이터에 반영된다.

-- MySQL 은 기본적으로 auto commit 이다.
-- commit 을 사용하려면 auto commit 부터 비활성화 해야 한다.

# 이것도 주석이다

SELECT @@autocommit; -- 현재 auto COMMIT 활성화 여부 1: 활성화  0:비활성화

SET @@autocommit = 0; -- auto COMMIT 비활성화

SELECT * FROM phonebook;

DELETE FROM phonebook WHERE id = 13; -- UPDATE ROWS : 1
									 -- 저장 안 됨 
ROLLBACK; -- 마지막으로 COMMIT 지점까지 복구 가능

INSERT INTO phonebook (name, phonenum, email)
VALUES('조대현', '010-2024-0000', 'babytiger@tigers.com'); -- UPDATE ROWS : 1

SELECT * FROM phonebook; -- 저장 된 거 아니다 

INSERT INTO phonebook (name, phonenum, email)
VALUES('김동헌', '010-2023-2020', 'dong_honey@heroes.com'); -- UPDATE ROWS : 1

COMMIT; -- DML 명령을 수행한 모든 변경내역 저장

