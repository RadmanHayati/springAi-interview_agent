package com.assistant.interviewer;

import org.springframework.boot.SpringApplication;

public class TestStoreApplication {

    public static void main(String[] args) {
        SpringApplication.from(OrchestratorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
