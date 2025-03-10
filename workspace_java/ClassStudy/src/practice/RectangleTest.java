package practice;

import javax.xml.transform.Source;

public class RectangleTest {
  public static void main(String[] args) {

    Rectangle r = new Rectangle();//클래스명 객체명 = 생성자 호출 -> defalt
    Rectangle s = new Rectangle(1, 1, 2, 3);

    r.show();//좌표 0,0,0,0
    s.show();//좌표 1,1,2,3
    System.out.println(s.square());
    r.set(-2,2,-1,4);//set매서드가 호출되면서 좌표가 -2,2,-1,4
    r.show();
    System.out.println(r.square());
    if(r.equals(s));//한 줄이면 중괄호 생략 가능
    System.out.println("두 사각형은 같습니다.");
  }
}
