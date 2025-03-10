package 접근제한자1;

public class OrangeTest1 {
  public static void main(String[] args) {
    Orange orange = new Orange();
    //orange.a; a변수는 private라서 다른 클래스에서는 접근 불가!
    //orange.aaa(); aaa()메서드는 private라서 다른 클래스에서는 접근 불가!
    orange.b = 10;//같은 패키지 안에서는 접근 가능!
    orange.c = 5;//같은 프로젝트 안에서 접근 가능!

    orange.setPrice(5000);


  }
}
