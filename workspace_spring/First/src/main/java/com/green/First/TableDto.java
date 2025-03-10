package com.green.First;

public class TableDto {
  private String food;
  private int amount;
  private String extra;
  private String request;
  private String date;

  public TableDto(String food, int amount, String extra, String request, String date) {
    this.food = food;
    this.amount = amount;
    this.extra = extra;
    this.request = request;
    this.date = date;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Table{" +
            "food='" + food + '\'' +
            ", amount=" + amount +
            ", extra='" + extra + '\'' +
            ", request='" + request + '\'' +
            ", date='" + date + '\'' +
            '}';
  }
}
