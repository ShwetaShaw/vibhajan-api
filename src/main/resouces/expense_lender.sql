CREATE TABLE expense_lender
(
      expense_id bigint NOT NULL,
      lender_id bigint NOT NULL,
      FOREIGN KEY (lender_id) REFERENCES lender,
      FOREIGN KEY (expense_id) REFERENCES expense
    )
    WITH (
      OIDS=FALSE
    );

insert into expense_lender (expense_id, lender_id)
 values (12, 11)
