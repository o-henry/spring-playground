package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot p = context.getBean(Parrot.class);
		System.out.println(p);
		System.out.println(p.getName());
		p.setName("henry");

		SpringApplication.run(DemoApplication.class, args);
	}

}
