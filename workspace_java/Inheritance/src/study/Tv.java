package study;
//다형성 : 부모 클래스로 자식 클래스의 객체 생성가능!

//클래스가 명시적으로 상속을 받고 있지 않으면
//자동으로 Object 클래스를 상속 받습니다.
//문법적으로 하나의 클래스만 상속받지만(여러개의 클래스를 상속받을 수 없지만)
//하나의 상속자 이전에 아무상속자도 없는 클래스가 이미
//기본적으로 Object 클래스를 받고 있으므로
//결론, 모든 클래스는 Object 클래스(최상위 클래스)를 상속받고 있다.
//다형성때문에 모든 클래스의 객체는 최상위 부모인 Object로 다 받을 수 있다.
public class Tv {
  int num;
  String name;

  public void turnOn(){
    System.out.println("Tv전원 켬");

    //다형성때문에 모든 클래스의 객체는 최상위 부모인 Object로 다 받을 수 있다.
//    Object o1 = new StrawberryCheeseCake();
//    Object o2 = new CheeseCake();
  }
  //Object 클래스의 toString() 메서드를 오버라이딩
  //매개변수와 리턴타입을 외울필요없이 alt+insert 로 toString()자동설정
  //내가만든 toString() 메서드를 리턴타입 "문자열"로 만들어주는 것
  //@Override : 메서드가 오버라이딩 문법에 맞는지 확인!
  //오버라이딩에서 리턴, 매개변수 모두 같아야한다.
  //현재 객체가 가진 모든 멤버변수의 값을 문자열로 만들어준다.
//  @Override
//  public String toString() {
////    return super.toString();
//    return "이것은 Tv입니다.";
//  }
//자동으로 toString 출력
  @Override
  public String toString() {
    return "Tv{" +
            "num=" + num +
            ", name='" + name + '\'' +
            '}';
  }

}
