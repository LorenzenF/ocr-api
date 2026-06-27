package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "org.example",
        "org.api.v1.ocrapi"
})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}