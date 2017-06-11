CREATE TABLE expense_borrower
(
      expense_id bigint NOT NULL,
      borrower_id bigint NOT NULL,
      FOREIGN KEY (borrower_id) REFERENCES borrower,
      FOREIGN KEY (expense_id) REFERENCES expense
    )
    WITH (
      OIDS=FALSE
    );

insert into expense_borrower (expense_id, borrower_id)
 values (12, 11)
