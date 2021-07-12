drop table if exists tasklist;

create table Task(
id int auto_increment primary key,
name varchar(30) not null,
worker varchar(40) not null
);

insert into Task (name, worker) values ('test', 'test'), ('create db', 'Mike');