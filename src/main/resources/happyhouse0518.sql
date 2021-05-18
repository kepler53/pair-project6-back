
create table member_tb(
	user_id varchar(20) primary key,
    user_pwd varchar(20) not null,
    user_email_front varchar(30) not null,
    user_email_end varchar(30) not null,
    user_address varchar(20) not null
);

create table board_tb(
	user_id varchar(20) not null,
    board_no int primary key auto_increment,
    board_title varchar(100) not null,
    board_content varchar(1000) not null,
    board_regdate timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    board_count int default 0,
    board_check tinyint(1) default 0,
    foreign key(user_id) references member_tb(user_id) on delete restrict
);

insert into board_tb(board_title,board_content,board_count) values ("없어","좋아",157);
insert into board_tb(board_title,board_content,board_count) values ("없어","좋아",158);

select * from board_tb;

create table comment_tb(
	user_id varchar(20) not null,
    board_no int not null,
    comment_no int primary key auto_increment,
    comment_regdate timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    comment_content varchar(1000) not null,
    foreign key(board_no) references board_tb(board_no) on delete restrict,
    foreign key(user_id) references member_tb(user_id) on delete restrict
);