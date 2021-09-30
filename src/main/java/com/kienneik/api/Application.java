package com.kienneik.api;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.kienneik.entity")
//Scan for entity must have
@SpringBootApplication
@ComponentScan({"com.kienneik"})
@EnableJpaRepositories("com.kienneik.repository")
public class Application {
   public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}