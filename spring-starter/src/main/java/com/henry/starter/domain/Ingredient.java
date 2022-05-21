package com.henry.starter.domain;

import lombok.Data;

@Data // Data decorater의 사용을 지양해야 한다
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}