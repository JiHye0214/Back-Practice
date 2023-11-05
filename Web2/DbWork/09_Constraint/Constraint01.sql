-- 제약조건 (Constraint)
-- 테이블 생성시 동시에 설정하기 

-- MySQL 에서 Table 의 제약조건 확인 
-- SELECT * FROM Information_schema.table_constraints WHERE table_schema="db이름";
-- SELECT * FROM Information_schema.table_constraints WHERE table_schema="db이름" AND table_name="table이름";

SELECT * FROM Information_schema.table_constraints
WHERE table_schema='mydb2309'AND table_name = "t_emp4";
-- not null은 제약조건에서 다루지 않는다!

-- DROP TABLE IF EXISTS ~ CASCADE 옵션을 주면 
-- 이를 참조하는 다른 관계된 테이블의 데이터도 연쇄 삭제딤

DROP TABLE IF EXISTS t_emp4 CASCADE;
CREATE TABLE t_emp4 (
	NO int PRIMARY KEY,
	name varchar(10) NOT NULL,
	jumin varchar(13) NOT NULL UNIQUE,
	area int(1) check(area < 5),
	deptno varchar(6) REFERENCES t_dep2(dcode) -- 참조하겠다 
);

-- 별도의 항목으로 정의 가능
DROP TABLE IF EXISTS t_emp4 CASCADE;
CREATE TABLE t_emp4 (
	NO int,
	name varchar(10) NOT NULL,
	jumin varchar(13) NOT NULL,
	area int,
	deptno varchar(6), -- 참조하겠다 
	-- 오려내기
	-- nn(not null)은 뗄 수 없음
	PRIMARY KEY(no),
	UNIQUE(jumin),
	check(area < 5),
	FOREIGN KEY (deptno) REFERENCES t_dept2(dcode)
);

SELECT * FROM Information_schema.table_constraints
WHERE table_schema='mydb2309'AND table_name = "t_emp3";

DROP TABLE IF EXISTS t_emp3 CASCADE;
CREATE TABLE t_emp3 (
	NO int,
	name varchar(10) NOT NULL,
	jumin varchar(13) NOT NULL,
	area int,
	deptno varchar(6),
	CONSTRAINT emp3_no_pk PRIMARY KEY(no),
	CONSTRAINT emp3_jumin_uk UNIQUE(jumin),
	CONSTRAINT emp3_area_ck check(area < 5),
	CONSTRAINT emp3_deptno_fk FOREIGN KEY (deptno) REFERENCES t_dept2(dcode)
);

SELECT * FROM t_dept2 ;

INSERT INTO t_emp3 VALUES(1, 'MySQL', '1234561234567', 4, 1000); -- 두번째 실행 error : PRIMARY KEY 

INSERT INTO t_emp3 VALUES(2, 'Oracle', '1234561234567', 4, 1000); -- jumin error : unique

INSERT INTO t_emp3 VALUES(2, 'Oracle', '12345612345678486444', 4, 1000); -- jumin error : varchar(13)

INSERT INTO t_emp3 VALUES(2, 'Oracle', '1234561234563', 10, 1000); -- area error : check(<5)

INSERT INTO t_emp3 VALUES(2, 'Oracle', '1234561234563', 3, 2000); -- area error : FOREIGN KEY

INSERT INTO t_emp3 (NO, jumin, area, deptno) VALUES (2,'3333333333333', 4, 1001); -- name 필드 NULL 가질 수 없음 (Field 'name' doesn't have a default value)

-- UPDATE / delete 에서도 제약조건 오류 발생
SELECT * FROM t_emp3;
UPDATE t_emp3 SET area = 10 WHERE NO = 1; -- area error : CHECK 

DELETE FROM t_dept2  WHERE decode = 1000; -- 참조중인 자식이 있으면 삭제 불가 

-- #9005)   ALTER 명령 사용하여 테이블 에 제약조건 추가가능
-- 위에서 생성한 t_emp4 테이블의 name 컬럼에 UNIQUE 제약조건 추가하기

ALTER TABLE t_emp4 ADD CONSTRAINT emp4_name_uk UNIQUE(name);

SELECT * FROM Information_schema.table_constraints
WHERE table_schema='mydb2309'AND table_name = "t_emp4";

-- #9008)    t_emp3 테이블을 DROP 하고, 이전과 같은 조건으로 다시 만들되
-- t_dept2(dcode)를 참조하는 detpno 컬럼은 
-- 부모테이블의 해당 데이터가 삭제되면 함께 삭제되도록 설정

-- 참조하는 부모테이블의 데이터에
-- ON DELETE [reference_option]
-- 
-- 1. RESTRICT : (디폴트) 개체를 변경/삭제할 때 다른 개체가 변경/삭제할 개체를 참조하고 있을 경우 변경/삭제가 취소됩니다.(제한)
-- 2. CASCADE : 개체를 변경/삭제할 때 다른 개체가 변경/삭제할 개체를 참조하고 있을 경우 함께 변경/삭제됩니다.
-- 3. NO ACTION : MYSQL에서는 RESTRICT와 동일합니다.
-- 4. SET NULL : 개체를 변경/삭제할 때 다른 개체가 변경/삭제할 개체를 참조하고 있을 경우 참조하고 있는 값은 NULL로 세팅됩니다.

-- https://dev.mysql.com/doc/refman/8.0/en/create-table-foreign-keys.html

DROP TABLE IF EXISTS t_emp3 CASCADE;
CREATE TABLE t_emp3 (
    no INT(4),
    name VARCHAR(10) NOT NULL,
    jumin VARCHAR(13) NOT NULL,
    area INT(1),
    deptno VARCHAR(6),
    CONSTRAINT emp3_no_pk PRIMARY KEY(NO),
    CONSTRAINT emp3_jumin_uk UNIQUE(jumin),
    CONSTRAINT emp3_area_ck CHECK(area < 5),
    CONSTRAINT emp3_deptno_fk FOREIGN KEY(deptno)
    	REFERENCES t_dept2(dcode)
    	ON DELETE CASCADE   -- 부모테이블의 참조가 삭제되면 함께 자동 연쇄 삭제
    	-- ON UPDATE
);





