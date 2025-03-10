package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int productNum;
  private String productName;
  private int price;
  private int quantity;
  private String customerId;

  public OrderDTO(){

  }

  public OrderDTO(int productNum, String productName, int price, int quantity, String customerId) {
    this.productNum = productNum;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.customerId = customerId;
  }


}
