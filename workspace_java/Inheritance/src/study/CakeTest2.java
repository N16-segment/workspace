package study;

import java.security.PublicKey;

public class CakeTest2 {
  public static void main(String[] args) {
    //클래스가 자료형이기떄문에 각각의 다른 새로운 객체를 생성
    //다른 자료형은 배열과 리스트에 적용할 수 없으므로 다형성으로 자료형을 통일시켜서 반복시킬 수 있다.
    //다형성 - 다른 자료형을 같은 자료형으로 만듦
    Cake c1 = new Cake();
    Cake c2 = new CheeseCake();
    Cake c3 = new StrawberryCheeseCake();

    //클래스의 개념만 출력한 코드
    //오버라이딩 개념 -> 메소드를 하나로 만들어서 반복시킬 수 있다.
    //다형성으로 만들어 놓은 자료형 변수를 하나의 메소드로 오버라이딩하면 원래 자기값을 호출하게된다.
    //오버라이딩이 조금 더 강함
    c1.eat();
    c2.eat();
    c3.eat();

  }
}
