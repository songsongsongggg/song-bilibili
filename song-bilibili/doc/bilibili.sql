drop table if exists `demo`;
create table `demo`
(
    `id`           bigint not null comment 'id',
    `name`         varchar(50) comment '名称',
    `age`          bigint  comment '年龄',
    primary key (`id`)
) engine = InnoDB
  default charset = utf8mb4 comment ='demo';