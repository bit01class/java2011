create user scott identified by "tiger";
alter user scott quota 10m on system;
grant connect,resource to scott;
conn scott/tiger;
create table bbs01(
	num number primary key,
	name varchar2(30),
	sub varchar2(30),
	content varchar2(2000),
	nalja date
);
create sequence bbs01_seq;
insert into bbs01 values (bbs01_seq.nextval,'tester','test1','test',sysdate);
insert into bbs01 values (bbs01_seq.nextval,'tester','test2','test',sysdate);
insert into bbs01 values (bbs01_seq.nextval,'tester','test3','test',sysdate);
insert into bbs01 values (bbs01_seq.nextval,'tester','test4','test',sysdate);
commit;