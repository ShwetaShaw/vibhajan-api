package com.lms.mobile.vibhajan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Properties;

/**
 * Created by shwetashaw on 10/06/17.
 */

@SpringBootApplication (scanBasePackages = {"com.lms.mobile.vibhajan"})
@EnableJpaRepositories("com.lms.mobile.vibhajan.dao")
@EntityScan("com.lms.mobile.vibhajan.entity")
public class VibhajanApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VibhajanApplication.class).properties(getProperties());
    }

    private static Properties getProperties() {
        Properties props = new Properties();
        System.out.println("Likhesh1"  + System.getenv("VIBHAJAN"));
        props.put("spring.config.location", "file:" + "/Users/shwetashaw/Documents/config/VIBHAJAN/");
        System.out.println("Likhesh2"  + props.get("spring.config.location"));
        return props;
    }

    public static void main(String[] args) {
        SpringApplication.run(VibhajanApplication.class, args);
    }
}
