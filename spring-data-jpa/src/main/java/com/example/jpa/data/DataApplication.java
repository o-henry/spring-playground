package com.example.jpa.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataApplication {

  private static final Logger log = LoggerFactory.getLogger(DataApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(DataApplication.class, args);
  }

  // The demo() method returns a CommandLineRunner bean that automatically runs the code when the application launches
  @Bean
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
      repository.save(new Customer("Jack", "Bauer"));
      repository.save(new Customer("Chloe", "o'Brian"));
      repository.save(new Customer("Kim", "Bauer"));
      repository.save(new Customer("David", "Palmer"));
      repository.save(new Customer("Michelle", "Dessler"));

      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      repository.findAll().forEach((customer) -> {
        log.info(customer.toString());
      });

      log.info("");

      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      repository.findByLastName("Bauer").forEach(bauer -> {
        log.info(bauer.toString());
      });
      log.info("");
    };
  }
}
