CREATE TABLE groups
    (
      id bigint NOT NULL,
      name varchar(255) NOT NULL,
      type varchar(255) NOT NULL,
      create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      CONSTRAINT pk_groups PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );

    CREATE SEQUENCE group_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;

    insert into groups (id, name, type, create_date,update_date)
     values (nextval('group_id_seq'), 'lrathod test1','Trips', now(), now())
