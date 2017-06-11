CREATE TABLE users
    (
      id bigint NOT NULL,
      user_name varchar(255) NOT NULL,
      email varchar(255) NOT NULL,
      name varchar(255) NOT NULL,
      contact_number varchar(255) NOT NULL,
      create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
      CONSTRAINT pk_users PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );


ALTER TABLE users ADD CONSTRAINT uk_user_usern_name UNIQUE (user_name);

ALTER TABLE users ADD CONSTRAINT uk_user_email UNIQUE (email);

ALTER TABLE users ADD CONSTRAINT uk_user_contact_number UNIQUE (contact_number);

CREATE SEQUENCE users_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 11  CACHE 1;

ALTER TABLE users ADD COLUMN create_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW();

ALTER TABLE users ADD COLUMN update_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW();

insert into users (id, user_name, email,name,contact_number,create_date,update_date)
values (nextval('users_id_seq'), 'lrathod', 'lrathod@gmail.com', 'likhesh', '8884084173', now(), now())
