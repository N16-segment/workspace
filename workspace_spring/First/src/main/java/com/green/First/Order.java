package com.green.First;

public class Order {
  private int productNum;
  private String productName;
  private int price;
  private int quantity;
  private String customerId;

  public Order(int productNum, String productName, int price, int quantity, String customerId) {
    this.productNum = productNum;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.customerId = customerId;
  }

  public int getProductNum() {
    return productNum;
  }

  public String getProductName() {
    return productName;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setProductNum(int productNum) {
    this.productNum = productNum;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
}
