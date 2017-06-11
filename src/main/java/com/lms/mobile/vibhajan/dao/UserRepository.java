package com.lms.mobile.vibhajan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lms.mobile.vibhajan.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by shwetashaw on 10/06/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("SELECT U FROM User U  where userName = :userName OR email = :email OR contact_number = :contact_number")
    User findByUserNameEmailContactNumber(@Param("userName") String userName, @Param("email") String email, @Param("contact_number") String contact_number);

    @Query("SELECT U FROM User U  where userName = :userName")
    User findByUserName(@Param("userName") String userName);

}
