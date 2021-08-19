create table bbs39(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	nalja date default sysdate,
	id	varchar2(15),
	cnt number default 0
);
create sequence bbs39_seq;
-- dummy
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트1','테스트','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트2','테스트','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트3','테스트','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트4','테스트','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트5','테스트','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'테스트6','테스트','tester');
commit;