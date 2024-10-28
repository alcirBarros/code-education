CREATE SCHEMA IF NOT EXISTS DUMMY;

use DUMMY;

DROP TABLE PEOPLE IF EXISTS;

create table PEOPLE (
   ID                   NUMBER(10)    not null constraint XPKTDSV_SMULA primary key,
   first_name           VARCHAR2(25),
   last_name            VARCHAR2(25)
);

