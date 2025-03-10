package study;

public class AccountTest {
  public static void main(String[] args) {
    //계좌 생성
    //객체 생성 문법 : 클래스명 객체명 = new 생성자 호출;
    Account acc1 = new Account();//-> 생성자를 호출하는 것(객체생성)
    acc1.printAccInfo();

    //계좌 정보 초기값 세팅 -> 생성자로 대체
    //acc1.initAcc("1111-222", 10000, "김자바");
    //위처럼 초기값을 세팅하면 아래와 같은 문제가 발생되므로,
    //클래스에서 생성자로 초기화해서 문제를 해결한다.
    // 초기값 세팅인데 그 전에 다른 코드 올 수 있음
    // 초기 세팅을 여러번 호출할 수 있음




  }
}
