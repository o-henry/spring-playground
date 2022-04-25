package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
