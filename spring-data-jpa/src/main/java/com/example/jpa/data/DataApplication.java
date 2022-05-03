package com.example.jpa.data;

import com.example.jpa.data.user.adapter.out.persistence.UserRepository;
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
  public CommandLineRunner demo(UserRepository repository) {
    return (args) -> {
//      repository.save(new Customer("Jack", "Bauer", "jack@gmail.com"));
//      repository.save(new Customer("Chloe", "o'Brian", "chole@gmail.com"));
//      repository.save(new Customer("Kim", "Bauer", "Kim@gmail.com"));
//      repository.save(new Customer("David", "Palmer", "David@gmail.com"));
//      repository.save(new Customer("Michelle", "Dessler", "Michlle@gmail.com"));
//      log.info("Customers found with findAll():");
//      log.info("-------------------------------");
//      repository.findAll().forEach((customer) -> {
//        log.info(customer.toString());
//      });
//
//      log.info("");
//
//      log.info("Customer found with findByLastName('Bauer'):");
//      log.info("--------------------------------------------");
//      repository.findByLastName("Bauer").forEach(bauer -> {
//        log.info(bauer.toString());
//      });
//      log.info("");
    };
  }
}
