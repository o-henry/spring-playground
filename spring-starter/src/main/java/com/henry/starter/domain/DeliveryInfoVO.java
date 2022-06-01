package com.henry.starter.domain;

import lombok.Data;

@Data // 사용하면 안되지만, 간단한 예제를 위해 사용
public class DeliveryInfoVO {

    private final String deliveryName;
    private final String deliveryStreet;
    private final String deliveryCity;
    private final String deliveryState;
    private final String deliveryZip;
    private final String ccNumber;
    private final String ccExpiration;
    private final String ccCVV;
}
