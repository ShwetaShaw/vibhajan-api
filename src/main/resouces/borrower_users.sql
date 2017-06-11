CREATE TABLE borrower_users
(
      borrower_id bigint NOT NULL CONSTRAINT fk_borrower_users_borrower_lender_id REFERENCES borrower,
      users_id bigint NOT NULL CONSTRAINT fk_lender_users_users_users_id REFERENCES users
    )
    WITH (
      OIDS=FALSE
    );

insert into borrower_users (borrower_id, users_id)
 values (12, 11)
