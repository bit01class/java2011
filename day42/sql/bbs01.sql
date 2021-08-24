drop table bbs01;
drop sequence bbs01_seq;
create table bbs01(
	num number primary key,
	name varchar2(30),
	sub varchar2(30),
	content varchar2(2000),
	nalja date,
	ord number,
	lvl number default 0,
	dep number default 0
);
create sequence bbs01_seq;
insert into bbs01 values (bbs01_seq.nextval,'tester','main1','test',sysdate,bbs01_seq.currval,0,0);
insert into bbs01 values (bbs01_seq.nextval,'tester','main2','test',sysdate,bbs01_seq.currval,0,0);
insert into bbs01 values (bbs01_seq.nextval,'tester','main3','test',sysdate,bbs01_seq.currval,0,0);
insert into bbs01 values (bbs01_seq.nextval,'tester','main4','test',sysdate,bbs01_seq.currval,0,0);
insert into bbs01 values (bbs01_seq.nextval,'tester','main5','test',sysdate,bbs01_seq.currval,0,0);
insert into bbs01 values (bbs01_seq.nextval,'tester','main6','test',sysdate,bbs01_seq.currval,0,0);
commit;