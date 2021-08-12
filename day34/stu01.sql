-- 한줄주석
-- 테이블생성
create table stu01(
	num number,
	name varchar2(9),
	kor number(3),
	eng number(3),
	math number(3)
);
-- dummy data
insert into stu01 values(1,'강길동',91,92,93);
insert into stu01 values(2,'김길동',83,84,85);
insert into stu01 values(3,'박길동',76,77,43);
commit;