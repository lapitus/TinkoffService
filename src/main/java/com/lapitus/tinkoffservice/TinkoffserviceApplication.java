package com.lapitus.tinkoffservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@EnableAsync
public class TinkoffserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinkoffserviceApplication.class, args);
    }

}
