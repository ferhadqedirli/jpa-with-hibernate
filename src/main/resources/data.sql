create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO PERSON VALUES (10001, 'Farhad', 'Baku', CURRENT_TIMESTAMP);
INSERT INTO PERSON VALUES (10002, 'Eltac', 'Qusar', CURRENT_TIMESTAMP);
INSERT INTO PERSON VALUES (10003, 'Togrul', 'Goyce', CURRENT_TIMESTAMP);
