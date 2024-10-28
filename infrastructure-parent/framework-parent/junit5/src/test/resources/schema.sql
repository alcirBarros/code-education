CREATE SCHEMA IF NOT EXISTS OWADQ;

use OWADQ;

DROP TABLE TDSV_SMULA IF EXISTS;
create table TDSV_SMULA(
   ID_SMULA             NUMBER(10)    not null constraint XPKTDSV_SMULA primary key,
   NU_SMULA             NUMBER(10),
   NU_CNPJ              VARCHAR2(14)  not null,
   ID_PARCR             NUMBER(20)
);

