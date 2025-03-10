package practice;

//문제 9~12.
//9~11번의 내용을 실행할 클래스를 만들고 작성한 메서드를 테스트해 보세요.
public class MemberTest {
  public static void main(String[] args) {
    //Member 클래스의 객체 mem1 생성
    Member mem1 = new Member();
    mem1.setAllInfo("Kim", "green", "12345aa", 30);
    mem1.printInfo();
  }
}
