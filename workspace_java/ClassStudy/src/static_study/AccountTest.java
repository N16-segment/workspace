package static_study;

public class AccountTest {
  public static void main(String[] args) {
    //--> static을 넣으면 객체생성하지 않고 메인메서드를 실행시켜주겠다는 의미
    Account a1 = new Account("김자바");
    Account a2 = new Account("박자바");
    Account a3 = new Account("최자바");
    Account.iyul = 10.0;//클래스명으로 접근
//    a1.iyul = 10.0; 내용이 변경때마다 계속 일일이 변경하기가 어렵다.
//    a2.iyul = 10.0; 그래서 클래스 이율에 static을 붙여준다. -> 일괄적용
    /// ////////////////////////////////////
    System.out.println("java");//클래스.static변수.메서드(메개변수);
    //->여기서 .out은 어딘가에 println이 만들어진 클래스의 참조변수명이다.
  }
}
