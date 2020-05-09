--liquibase formatted sql
--changeset tyler:1.0

CREATE TABLE t_think_user (
    id bigint not null AUTO_INCREMENT,
    user_name varchar(20) not null,
    real_name varchar(20) null,
    del_flag int(4) default null,
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;