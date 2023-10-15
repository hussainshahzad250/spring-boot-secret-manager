package com.hussain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class SpringBootSecretManagerApplication {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecretManagerApplication.class, args);
        log.info("Application started successfully...");
    }

    @PostConstruct
    private void postConstruct() {
        log.info("REDIS_HOST : {}, REDIS_PORT : {}", host, port);
    }

}
