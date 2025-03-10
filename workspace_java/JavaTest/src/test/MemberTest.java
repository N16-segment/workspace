//Member 클래스의 객체를 하나 생성하고,
//회원의 아이디는 “java”, 패스워드는 “1234”, 이름은 “kim”, 나이는 20으로 변경
//isLogin(“java“, “1234“) 메서드 호출 시 결과로 ‘로그인 가능’이 출력되어야 함.
//isLogin(“java“, “1111“) 메서드 호출 시 결과로 ‘로그인 불가능’이 출력되어야 함.

public class MemberTest {
  public static void main(String[] args) {
    //회원 객체 하나 생성
    Member member = new Member();
    member.setInfo("java", "1234", "kim", 20);

    //생성한 모든 객체의 정보 출력
    System.out.println("회원 정보:");
    member.showInfo();

    System.out.println();

    //isLogin("java", "1234")로그인 가능 확인 출력
    System.out.print("로그인 시도 결과 : ");
    if (member.isLogin("java", "1234")) {
      System.out.println("로그인 가능");
    } else {
      System.out.println("로그인 불가능");
    }

    System.out.println();

    //isLogin("java", "1111")로그인 불가능 확인 출력
    System.out.print("로그인 시도 결과 : ");
    if(member.isLogin("java", "1111")){
      System.out.println("로그인 불가능");
    } else {
      System.out.println("로그인 가능");
    }

  }
}
