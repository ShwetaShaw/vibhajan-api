package com.lms.mobile.vibhajan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.mobile.vibhajan.entity.UserCredential;

/**
 * Created by shwetashaw on 10/06/17.
 */
public interface ClientCredentialRepository extends JpaRepository<UserCredential, Long> {

}
