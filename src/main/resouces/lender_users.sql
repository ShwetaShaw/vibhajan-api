CREATE TABLE lender_users
(
      lender_id bigint NOT NULL CONSTRAINT fk_lender_users_lender_lender_id REFERENCES lender,
      users_id bigint NOT NULL CONSTRAINT fk_lender_users_users_users_id REFERENCES users
    )
    WITH (
      OIDS=FALSE
    );

insert into lender_users (lender_id, users_id)
 values (13, 11)
