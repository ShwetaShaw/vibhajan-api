CREATE TABLE users
    (
      user_id bigint NOT NULL,
      password varchar(255) NOT NULL,
      FOREIGN KEY (user_id) pk_users PRIMARY KEY (id)
    )
    WITH (
      OIDS=FALSE
    );
