package com.prison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.prison.data.repositories")
@EntityScan("com.prison.data.models")
public class PrisonSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrisonSystemApplication.class, args);
    }
}