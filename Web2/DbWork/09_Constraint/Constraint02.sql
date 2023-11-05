-- 복합키 제약조건 만들기

CREATE TABLE test_member (
    mb_uid INT NOT NULL,
    mb_nick VARCHAR(10) NOT NULL,
    mb_name VARCHAR(10) NOT NULL,
    PRIMARY KEY(mb_uid, mb_nick) -- 두 컬럼의 조합이 중복되면 안 됨 
);

INSERT INTO test_member VALUES(1, 'aaa', 'John'); -- 두 번째 실행 pk 에러 (-- 1-aaa)
INSERT INTO test_member VALUES(1, 'bbb', 'John'); -- 둘의 조합이 다르면 됨 
