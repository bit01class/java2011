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
values (bbs39_seq.nextval,'�׽�Ʈ1','�׽�Ʈ','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'�׽�Ʈ2','�׽�Ʈ','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'�׽�Ʈ3','�׽�Ʈ','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'�׽�Ʈ4','�׽�Ʈ','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'�׽�Ʈ5','�׽�Ʈ','tester');
insert into bbs39 (num,sub,content,id) 
values (bbs39_seq.nextval,'�׽�Ʈ6','�׽�Ʈ','tester');
commit;