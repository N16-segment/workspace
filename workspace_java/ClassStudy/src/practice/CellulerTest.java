package practice;
//문제 6~8.
//8.휴대폰의 모든 데이터를 출력하는 메소드를 만들고, 새로운 클래스를 만들어 7,8번에서 만든 메소
//드가 잘 동작되는지 확인하세요
public class CellulerTest {
  public static void main(String[] args) {
    //Celluler 클래스의 객체 cell 생성
    Celluler cell1 = new Celluler();

    //휴대폰 cell1의 객체의 데이터(모든 정보) 변경
    cell1.setCompany("Samsung");
    cell1.setModel("Gallaxy Ultra23");
    cell1.setClolr("beige");
    cell1.setPrice(100);
    cell1.setNumber("010-1234-5678");

    //객체의 모든 내용 출력
    cell1.printInfo();

  }
}
