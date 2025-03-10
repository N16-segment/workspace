package practice;

//문제 6~8.
//6.7.휴대폰는 제조사, 모델명, 색상, 가격, 휴대폰 번호를 데이터로 가지고 있다. 이 데이터를 가진
//Phone 클래스를 만들어 보세요
public class Celluler {
  String company;
  String model;
  String color;
  int price;
  String number;

  //setter -> 각각의 변수값을 자동으로 변경해주는 메서드 만들 때
  //제조사 변경하는 메서드
  public void setCompany(String company1){
    company = company1;
  }
  //모델명 변경하는 메서드
  public void setModel(String model1){
    model = model1;
  }
  //색상 변경하는 메서드
  public void setClolr(String color1){
    color = color1;
  }
  //가격 변경하는 메서드
  public void setPrice(int price1){
    price = price1;
  }
  //휴대폰번호 변경하는 메서드
  public void setNumber(String number1){
    number = number1;
  }
  //휴대폰의 정보를 출력하는 기능
  public void printInfo(){
    System.out.println("휴대폰 제조사 : " + company);
    System.out.println("휴대폰 모델명 : " + model);
    System.out.println("휴대폰 색깔 : " + color);
    System.out.println("휴대폰 가격 : " + price);
    System.out.println("휴대폰 번호 : " + number);
  }

}
