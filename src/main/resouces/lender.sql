CREATE TABLE lender
    (
      id bigint NOT NULL,
      expense_id bigint NOT NULL CONSTRAINT fk_lender_expense_expense_id REFERENCES expense ,
      amount NUMERIC NOT NULL,
      create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      CONSTRAINT pk_lender PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );

    CREATE SEQUENCE lender_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;

 insert into lender (id, expense_id, amount, create_date,update_date)
 values (nextval('lender_id_seq'), 13, 400, now(), now())
