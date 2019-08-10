drop table dbs.queue;
drop table dbs.message; 
create table dbs.queue (
			id integer(10) not null AUTO_INCREMENT, 
			queue_name varchar(255),
			size integer,primary key (id));
create table dbs.message (
			id integer(10) not null AUTO_INCREMENT,
			msg_body varchar(255),
			queue_id integer,primary key (id),foreign key(queue_id) references queue.id);
