package practice;
 //문제14.
// 모든 필드를 초기화하는 메소드와 노래의 모든 정보를 출력하는 메소드를 만드세요.
// 그리고 프로그램이 잘 돌아가는지 확인해 보세요.
public class ComposeTest {
  public static void main(String[] args) {
    //com1.setAllInfo("자바", "김자바", "1집", 2025, new String[]{"김자바","박자바","이자바"});
    Compose com1 = new Compose();
    String[] composer = {"김자바","박자바","이자바"};//배열을 아래에 넣기 위해 변수를 만든다.
    com1.setAllInfo("자바", "김자바", "1집", 2025, composer);
    com1.printInfo();
  }

}
