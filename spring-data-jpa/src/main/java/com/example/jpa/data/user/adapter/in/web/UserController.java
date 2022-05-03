package com.example.jpa.data.user.adapter.in.web;

import com.example.jpa.data.user.adapter.out.persistence.UserRepository;
import com.example.jpa.data.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "demo")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewUser(
      @RequestParam String name, @RequestParam String email) {
    User user = new User();

    //TODO: add setter by value-object
    //TODO: need to show error log
    //SCENARIO: if a lastName is not provided, you must provide information that it is missing.

    userRepository.save(user);
    return "Saved";
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
}

