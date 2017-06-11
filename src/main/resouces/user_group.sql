CREATE TABLE user_group
    (
      user_id bigint NOT NULL,
      group_id bigint NOT NULL
    )
    WITH (
      OIDS=FALSE
    );