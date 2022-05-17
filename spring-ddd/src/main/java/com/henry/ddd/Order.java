package com.henry.ddd;

public class Order {

  private OrderState state;
  private ShippingInfo shippingInfo;

  public void changeShippingInfo(ShippingInfo newShippingInfo) {
    if (!state.isShippingChangeble()) {
      throw new IllegalStateException("can't change shipping in " + state);
    }
    this.shippingInfo = newShippingInfo;
  }

  private boolean isShippingChangeble() {
    return state == OrderState.PAYMENT_WAITING || state == OrderState.PREPARING;
  }


  public enum OrderState {
    PAYMENT_WAITING, PREPARING, SHIPPED, DELIVERING, DELIVERY_COMPLETED;
  }


}
