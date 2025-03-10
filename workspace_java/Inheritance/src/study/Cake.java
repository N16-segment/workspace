package study;

public class Cake {
  public void eat(){//eatcCake를 eat로 바꾼다.
    System.out.println("케익을 먹는다");
  }
}

class CheeseCake extends Cake{
//  public void eatCheeseCake(){ 모두 eat으로 바꿔버린다 -> 오버라이딩
  public void eat(){
    System.out.println("치즈케익을 먹는다");
  }

}
//치즈케익을 상속하면 케이크도 상속한다.
class StrawberryCheeseCake extends CheeseCake{
  public void eat(){//eat로 바꿈 -> 오버라이딩
    System.out.println("딸기치즈케익을 먹는다");
  }

}
