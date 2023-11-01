-- DCL : Data Control Language
-- commit : 작업결과를 물리적 디스크에 저장.  manipulation 작업이 정상적으로 완료
-- rollback : 원래의 데이터 상태로 복구

-- 테이블과 데이터 준비
DESC phonebook;
SELECT * FROM phonebook ;

DROP TABLE IF EXISTS phonebook; 

-- 기본적으로 MySQL 은 auto-commit 이다
-- DML 은 실행 즉시 물리적인 데이터에 반영된다.

-- MySQL 은 기본적으로 auto commit 이다.
-- commit 을 사용하려면 auto commit 부터 비활성화 해야 한다.

# 이것도 주석이다

SELECT @@autocommit;  -- 현재 auto COMMIT 활성화 여부 1: 활성화  0:비활성화

SET @@autocommit = 0; -- auto COMMIT 비활성화

SELECT * FROM phonebook; 

DELETE FROM phonebook WHERE id = 18;

-- rollback 하기 전, 마지막으로 commit 한 지점까지 복구 가능하다
ROLLBACK;

INSERT INTO phonebook (name, phonenum, email)
VALUES('헐크', '4444-3333', 'hulk@incredible.com');

SELECT * FROM phonebook; 

INSERT INTO phonebook (name, phonenum, email)
VALUES('블랙위도우', '111-222-333', 'black@widow.com');

COMMIT;

