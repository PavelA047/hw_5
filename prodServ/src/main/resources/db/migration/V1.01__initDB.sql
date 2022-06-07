drop sequence if exists product_seq;
create sequence product_seq start 1 increment 1;

drop table if exists product;
create table product
(
    id    int8 not null,
    price numeric(19, 2),
    title varchar(255),
    primary key (id)
);