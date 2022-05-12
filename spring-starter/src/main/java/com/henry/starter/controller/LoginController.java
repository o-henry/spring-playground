package com.henry.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  public LoginController() {
    System.out.println("===> LoginController 생성");
  }

  @GetMapping("/login")
  public void loginView() {
  }
}
