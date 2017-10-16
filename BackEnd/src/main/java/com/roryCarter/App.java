package com.roryCarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
//@ComponentScan({"com.roryCarter.CarterApp"})
@EntityScan("com.roryCarter.Domain")
@EnableJpaRepositories("com.roryCarter.Repository")
@SpringBootApplication
@EnableAutoConfiguration
public class App{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
