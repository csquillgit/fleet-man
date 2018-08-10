package com.facade1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.core", "com.facade1"})
public class Facade1Application {

  public static void main(String[] args) {
    SpringApplication.run(Facade1Application.class, args);
  }
}
