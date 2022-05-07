package com.example.jpa.data.common;

public class Normal {

  private final String name;
  private final int age;

  public Normal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
