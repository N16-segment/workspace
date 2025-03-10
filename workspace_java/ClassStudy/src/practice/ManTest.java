package practice;
//문제 15.
//아래의 문제를 풀면서 사람을 표현하는 Man 클래스를 만들어보자.
//1) Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버변수를 선언하세요.
//2) 맴버변수의 모든 값을 초기화 할 수 있는 메소드를 만드세요,
//3) 맴버변수 각각의 값을 변경하는 메소드를 3개를 만드세요.
//4) 각 맴버변수의 값을 리턴하는 메소드를 3개 만드세요.
//5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
//6) Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.
public class ManTest {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.setName("홍길동");
    m1.setAge(20);
    m1.setAddress("울산");
    m1.printInfo();

    //이름 데이터 출력
    System.out.println(m1.name);
    System.out.println(m1.getName());

  }
}
