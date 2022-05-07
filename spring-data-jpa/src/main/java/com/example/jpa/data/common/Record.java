package com.example.jpa.data.common;

public record Record(String name, int age) {

  public Record {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }
}
