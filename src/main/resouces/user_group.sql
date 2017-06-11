CREATE TABLE user_group
    (
      user_id bigint NOT NULL,
      group_id bigint NOT NULL
    )
    WITH (
      OIDS=FALSE
    );

    ALTER TABLE user_group ADD CONSTRAINT un_ug UNIQUE(user_id,group_id);

    INSERT INTO public.user_group(
                user_id, group_id)
        VALUES (1, 11);

    INSERT INTO public.user_group(
                        user_id, group_id)
                VALUES (11, 11);
    INSERT INTO public.user_group(
                        user_id, group_id)
                VALUES (14, 11);