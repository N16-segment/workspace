package study;

public class MonitorTest {
  public static void main(String[] args) {
    Monitor m1 = new Monitor();
    Monitor m2 = new Monitor("java");

    m1.printInfo();
    System.out.println();
    m2.printInfo();
    System.out.println();

    Monitor m3 = new Monitor("LG", "BLACK");
    m3.printInfo();

    //생성자 문법
    //->public 클래스명(){}
    //->목적 : 멤버변수의 초기값 설정을 위해 생성자 사용
    //클래스 생성자 1도 없으면 기본 생성자 자동으로 생성
    //생성자는 메서드 오버로딩 문법으로 여러개 생성 가능
    //생성자를 하나라도 만들면,
    //기본생성자가 자동으로 만들어지지 않기 때문에 주의!

  }
}
