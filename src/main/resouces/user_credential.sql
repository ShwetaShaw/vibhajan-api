CREATE TABLE user_credential
    (
      id bigint NOT NULL,
      user_id bigint NOT NULL,
      password varchar(255) NOT NULL
    )
    WITH (
      OIDS=FALSE
    );

ALTER TABLE user_credential ADD COLUMN create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW();

ALTER TABLE user_credential ADD COLUMN update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW();

CREATE SEQUENCE password_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;

