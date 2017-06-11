CREATE TABLE expense
    (
      id bigint NOT NULL,
      description varchar(255) NOT NULL,
      created_by varchar(255) NOT NULL,
      group_id bigint NOT NULL,
      create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      CONSTRAINT pk_expense PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );

    CREATE SEQUENCE expense_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;

<!-- Add foreign key constains -->
    ALTER TABLE expense ADD CONSTRAINT fk_expense_group_id FOREIGN KEY (group_id) REFERENCES groups


 insert into expense (id, description, created_by, group_id, create_date,update_date)
 values (nextval('expense_id_seq'), 'lrathod test1','8884084173', 11, now(), now())
