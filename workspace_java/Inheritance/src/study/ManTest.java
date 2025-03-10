package study;
//메인메서드를 만들기 위한 맨테스트 클래스
public class ManTest {

  public static void main(String[] args) {
    //BusinessMan 클래스에 대한 객체 생성
    BusinessMan man = new BusinessMan("삼성");
    man.company = "삼성";
    System.out.println(man.company);
    //메서드 호출 가능
    man.tellcompany();
    man.tellName();
  }
}
