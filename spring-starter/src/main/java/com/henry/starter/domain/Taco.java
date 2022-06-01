package com.henry.starter.domain;

import java.util.List;
import lombok.Getter;

public class Taco {

    @Getter
    private final String name;

    @Getter
    private final List<Ingredient> ingredients;

    public Taco(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }


}
