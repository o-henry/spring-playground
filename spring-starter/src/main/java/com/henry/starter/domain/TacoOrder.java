package com.henry.starter.domain;

import java.util.ArrayList;
import java.util.List;

public class TacoOrder {

    private final DeliveryInfoVO deliveryInfoVO;
    private final List<Taco> tacos = new ArrayList<>();

    public TacoOrder(DeliveryInfoVO deliveryInfoVO) {
        this.deliveryInfoVO = deliveryInfoVO;
    }

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
