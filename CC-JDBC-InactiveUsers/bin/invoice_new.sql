drop table if exists user;

create table user(
id int not null ,
username varchar(255) not null,
password varchar(255) not null,
address varchar(255) not null,
mobile_number varchar(255) not null,
deleted int not null,
failed_attempts int ,
primary key(id));


insert into user values(1,'John','john123','California','8203145712',0,6);
insert into user values(2,'Bravo','brav34123','California','983145712',0,2);
insert into user values(3,'Madhu','madhus','Florida','820313712',0,3);
insert into user values(4,'Maxwell','maxwe23','Texas','8299945712',0,6);
insert into user values(5,'Greta','john123','Alaska','8203145712',0,4);
insert into user values(6,'Faye','faye%^f','California','9873145712',0,6);
insert into user values(7,'Lucy','john123','Texas','8299995712',0,6);
insert into user values(8,'Bailey','Bail$#5','California','7896412006',0,4);
insert into user values(9,'Ida','john123','Chennai','90000000150',0,6);
insert into user values(10,'Kasia','john123','California','9785413216',0,4);
insert into user values(11,'Jacklyn','jake123','California','9871321470',0,5);
insert into user values(12,'Harlow','john123','Canada','9852048441',0,2);
insert into user values(13,'Corrine','cawer123','Erode','8203145713',0,4);
insert into user values(14,'Donna','john123','Coimbatore','8203145712',0,3);
insert into user values(15,'Queeny','34123','Alaska','8205555712',0,6);
insert into user values(16,'Nellie','657fgh123','Canada','8205555745',0,7);
insert into user values(17,'Dianne','df#!123','Alaska','8209531712',0,7);
insert into user values(18,'Deanne','@#$EF123','Canada','9505555712',0,8);
insert into user values(19,'Natie','#fg123','Alaska','9605555712',0,8);
insert into user values(20,'Penelope','sdbf876123','Erode','7405555712',0,9);

