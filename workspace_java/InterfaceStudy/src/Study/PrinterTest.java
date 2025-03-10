package Study;

public class PrinterTest {
  public static void main(String[] args) {
    SamsungPrinter p = new SamsungPrinter();
    p.print();
    p.colorPrint();
//SamsungPrint 클래스가 구현한 Print 인터페이스의 이름으로 생성자를 만들 수 있다.
    Print p2 = new SamsungPrinter();


  }
}
