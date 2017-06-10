package com.lms.mobile.vibhajan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by shwetashaw on 10/06/17.
 */

@SpringBootApplication (scanBasePackages = {"com.lms.mobile.vibhajan"})
public class VibhajanApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VibhajanApplication.class, args);
    }
}
