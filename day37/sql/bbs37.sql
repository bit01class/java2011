drop table bbs37;
drop table bbs37_seq;
create table bbs37(
	num number primary key,
	name varchar2(9) not null,
	nalja date,
	subject varchar2(30) default '제목없음',
	content varchar2(2000)
);
create sequence bbs37_seq;
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test1','');
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test2','');
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test3','');
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test4','');
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test5','');
insert into bbs37 values (bbs37_seq.nextval,'tester',sysdate,'test6','');
commit;