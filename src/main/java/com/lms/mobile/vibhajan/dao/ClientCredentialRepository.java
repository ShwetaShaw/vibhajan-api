package com.lms.mobile.vibhajan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.mobile.vibhajan.entity.UserCredential;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by shwetashaw on 10/06/17.
 */
public interface ClientCredentialRepository extends JpaRepository<UserCredential, Long> {

    @Query("SELECT UC FROM UserCredential UC where userId = :userId")
    UserCredential findByUserId(@Param("userId") Long userId);

}
