CREATE TABLE users
    (
      id bigint NOT NULL,
      user_name varchar(255) NOT NULL,
      email varchar(255) NOT NULL,
      name varchar(255) NOT NULL,
      contact_number varchar(255) NOT NULL,
      CONSTRAINT pk_users PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );


ALTER TABLE users ADD CONSTRAINT uk_user_usern_name UNIQUE (user_name);

ALTER TABLE users ADD CONSTRAINT uk_user_email UNIQUE (email);

ALTER TABLE users ADD CONSTRAINT uk_user_contact_number UNIQUE (contact_number);

CREATE SEQUENCE user_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;
