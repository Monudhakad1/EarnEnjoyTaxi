package org.example.uberreviewservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberReviewServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberReviewServicesApplication.class, args);

    }

}
