package study;

public class PhoneTest {
  public static void main(String[] args) {
    //p 변수로 객체(실제 데이터) 생성 = new 생성자 문법
    MobilePhone p1 = new MobilePhone();
    SmartPhone p2 = new SmartPhone();

    //다형성
    //부모 클래스는 자식 클래스의 객체를 받아들임
    MobilePhone p3 = new SmartPhone();
    //자식 클래스는 부모 클래스의 객체를 수용하지 않음
//    SmartPhone p4 = new MobilePhone();상속자인 자식이 부모객체를 받아들일 수 없다. 오류발생


  }
}
