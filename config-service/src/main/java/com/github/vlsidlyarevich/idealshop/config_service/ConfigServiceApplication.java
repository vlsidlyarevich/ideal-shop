package com.github.vlsidlyarevich.idealshop.config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigServiceApplication {

    public static void main(String[] args) {
        var test = """
                test
                """;
        SpringApplication.run(ConfigServiceApplication.class, args);
    }

}
