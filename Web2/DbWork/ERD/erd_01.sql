SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS resister;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS subject;
DROP TABLE IF EXISTS professor;




/* Create Tables */

CREATE TABLE professor
(
	profno int NOT NULL AUTO_INCREMENT,
	name varchar(30) NOT NULL,
	deptno int DEFAULT 100,
	PRIMARY KEY (profno)
);


CREATE TABLE resister
(
	studno int NOT NULL,
	subjno int NOT NULL
);


CREATE TABLE student
(
	studno int NOT NULL AUTO_INCREMENT,
	name varchar(30) NOT NULL,
	deptno int NOT NULL,
	profno int NOT NULL,
	PRIMARY KEY (studno)
);


CREATE TABLE subject
(
	subjno int NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	profno int NOT NULL,
	PRIMARY KEY (subjno)
);



/* Create Foreign Keys */

ALTER TABLE student
	ADD FOREIGN KEY (profno)
	REFERENCES professor (profno)
	ON UPDATE RESTRICT
	ON DELETE SET NULL
;


ALTER TABLE subject
	ADD FOREIGN KEY (profno)
	REFERENCES professor (profno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE resister
	ADD FOREIGN KEY (studno)
	REFERENCES student (studno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE resister
	ADD FOREIGN KEY (subjno)
	REFERENCES subject (subjno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



