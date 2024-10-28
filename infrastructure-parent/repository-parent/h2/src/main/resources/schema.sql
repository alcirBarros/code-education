use DUMMY;

DROP TABLE PEOPLE IF EXISTS;

create table PEOPLE (
    ID                   NUMBER(10)    not null constraint XPKTDSV_SMULA primary key,
    first_name           VARCHAR2(25),
    last_name            VARCHAR2(25)
);


create table DUMMY.tdsv_contr
(
    id_contr             bigint       not null,
    cd_sttus_bloq_antec  varchar(255),
    nu_contr             bigint,
    dt_hora_incl         timestamp    not null,
    ds_usuar_incl        varchar(255) not null,
    dt_hora_alt          timestamp    not null,
    ds_usuar_alt         varchar(255) not null,
    cd_sttus_mrcao_desvd varchar(255),
    id_smula             bigint,
    nu_idtfd_unic_parcr  varchar(255),
    id_sttus_contr       bigint       not null,
    primary key (id_contr)
);

create table DUMMY.tdsv_smula
(
    id_smula             bigint       not null,
    dt_hora_aceit        timestamp,
    nu_cpf_usuar_aceit   varchar(255),
    cd_vrsao_termo_aceit varchar(255),
    nu_cnpj              varchar(255),
    vr_smula             numeric(19, 2),
    nu_ec                bigint,
    dt_vcto_prim_pcela   date,
    qt_pcela             integer,
    vr_tx_smula          numeric(19, 2),
    dt_vcto_ult_pcela    date,
    qt_min_pcela         integer,
    vr_min               numeric(19, 2),
    dt_hora_alt          timestamp    not null,
    ds_usuar_alt         varchar(255) not null,
    nu_ppsta             bigint,
    nu_smula             bigint,
    cd_tpo_smula         varchar(255),
    id_sttus_smula       bigint       not null,
    primary key (id_smula)
);

create table DUMMY.tdsv_sttus_contr
(
    id_sttus_contr bigint not null,
    ds_sttus_contr varchar(255),
    primary key (id_sttus_contr)
);

create table DUMMY.tdsv_sttus_smula
(
    id_sttus_smula bigint not null,
    ds_sttus_smula varchar(255),
    primary key (id_sttus_smula)
);

