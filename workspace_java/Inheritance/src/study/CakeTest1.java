package study;

public class CakeTest1 {
  public static void main(String[] args) {
//    StrawberryCheeseCake c1 = new StrawberryCheeseCake();
//    c1.eatStrawberryCheeseCake();
//    c1.eatCake();
//    c1.eatCheeseCake();
//
//    System.out.println();

    //다형성
    //클래스명을 다르게 새로운 객체를 생성하는 문법이기때문에
    //다형성의 문법에서는 우측의 새로운 객체의 값을 좌측의 클래스에 담는 것이 아니라
    //좌측 부모 클래스의 내용으로만 인식한다.
    //다형성을 통해 생성된 객체는 부모 클래스의 변수와 메서드만 사용 가능!
    //StrawberryCheeseCake c2 = new Cake(); 자식이 부모객체를 수용하지 않는다.
    //하나의 스트로베리치즈케익을 만드는 방법이 다양하다.
    //new로 생성된 객체 생성자가 실제 데이터이다.
//    CheeseCake c3 = new StrawberryCheeseCake();
//    System.out.println("c3의 실제 데이터 : ");
//    c3.eatCheeseCake();
//    c3.eatCake();

//    System.out.println();
    //딸기 케익을 케익에 담았지만 본인을 케익으로 생각하기 때문에 케익에 있는 내용만 적용된다.
//    Cake c4 = new StrawberryCheeseCake();
//    System.out.print("c4의 실제 데이터 : ");
//    c4.eatCake();

    //c4객체를 딸기치즈케익으로 변환
//    StrawberryCheeseCake c5 = (StrawberryCheeseCake)c4;
    //형 변환(ex 실수를 정수로 강제 변환)
//    int a = (int)10.5;
//    c5.eatStrawberryCheeseCake();
//    c5.eatCheeseCake();
//    c5.eatCake();

//    Cake c6 = new Cake();
//    StrawberryCheeseCake c7 = (StrawberryCheeseCake)c6;
  }
}
