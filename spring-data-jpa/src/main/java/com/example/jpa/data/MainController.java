package com.example.jpa.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "demo")
public class MainController {

  @Autowired
  private CustomerRepository customerRepository;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewCustomer(@RequestParam String firstName,
      @RequestParam String lastName, @RequestParam String email) {
    Customer customer = new Customer();

    //TODO: add setter by value-object
    //TODO: need to show error log
    //SCENARIO: if a lastName is not provided, you must provide information that it is missing.

    customerRepository.save(customer);
    return "Saved";
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }
}

