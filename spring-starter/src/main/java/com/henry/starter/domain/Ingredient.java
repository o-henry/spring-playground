package com.henry.starter.domain;

import lombok.Getter;

public class Ingredient {

    @Getter
    private final String id;
    @Getter
    private final String name;
    @Getter
    private final Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    // TODO: implements equals() and hashCode()
}