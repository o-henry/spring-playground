package com.henry.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(StarterApplication.class);
    application.setWebApplicationType(WebApplicationType.NONE); // 톰캣 구동 X
    application.run(args);
  }


}
