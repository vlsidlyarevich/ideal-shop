package com.github.vlsidlyarevich.idealshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdealShopApplication {

    public static void main(String[] args) {
        var test = """
                test
                """;
        SpringApplication.run(IdealShopApplication.class, args);
    }

}
