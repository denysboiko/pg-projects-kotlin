create table if not exists projects
(
    id integer not null primary key auto_increment,
    code       varchar(40),
    title      text    not null
);
