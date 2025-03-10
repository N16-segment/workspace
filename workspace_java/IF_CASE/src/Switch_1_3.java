import java.util.Scanner;

public class Switch_1_3 {
  public static void main(String[] args) {

    //간단한 계산기 프로그램 IF문을 활용하여 만들어 보자. 계산을 위해 두 정수가 필요하고,
    //연산자(+, -, *, /)를 입력받을 문자열 변수도 필요해 보인다. 만약 두 수를 각각 1, 2로 입력
    //받고 연산자로 +를 입력받았다면 출력결과는 ‘1 + 2 = 3’처럼 되어야한다. 그리고 연산자를
    //잘못 입력하였다면 ‘연산자를 잘못 입력하였습니다.’라고 출력되어야한다. 아래 결과예시처럼
    //프로그램이 될 수 있도록 코드를 작성하세요.(굵은 기울임체는 입력받는 부분이다.)-결과예시 (1)
    //첫 번째 수 : 3
    //두 번째 수 : 5
    //연산자 : *
    // 3 * 5 = 15

    int a, b;//두 정수를 저장할 변수
    String oper;// = "연산자"; 연산자를 저장할 변수
    Scanner sc = new Scanner(System.in);

    //정보 입력
    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b = sc.nextInt();
    System.out.print("연산자 : ");
    oper = sc.next();

    if (oper.equals("+")){
      //a : 3, b = 5, oper = +
      //==> 3 + 5 = 8
      System.out.println(a + "+" + b + " = " + (a + b));
    }
    else if (oper.equals("-")) {
      System.out.println(a + " " + oper + " " + b + " = " + (a - b) );
    }
    else if (oper.equals("*")) {
      System.out.println(a + " " + oper + " " + b + " = " + (a * b) );
    }
    else if (oper.equals("/")) {
      System.out.println(a + " " + oper + " " + b + " = " + ((double)a / b) );
    }
    else{
      System.out.println("연산자를 잘못 입력했습니다.");
    }


  }

}
