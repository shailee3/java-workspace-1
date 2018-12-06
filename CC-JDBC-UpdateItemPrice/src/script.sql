drop table if exists item;

create table item(id varchar(255) not null,name varchar(255) not null,

price double not null,primary key(id));


insert into item values
('001','Television',30000);


insert into item values
('002','Mobile Phone ',15000);


insert into item values
('003','Laptop',40000);


insert into item values
('004','Furniture',50000);


insert into item values
('005','Refrigerator',25000);