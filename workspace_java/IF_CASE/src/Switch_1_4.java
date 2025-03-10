import java.util.Scanner;

public class Switch_1_4 {
  public static void main(String[] args) {

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

    switch(oper){
      case "+":
       System.out.println(a + "+" + b + " = " + (a + b));
        break;
      case "-":
        System.out.println(a + " " + oper + " " + b + " = " + (a - b) );
        break;
      case "*":
        System.out.println(a + " " + oper + " " + b + " = " + (a * b) );
        break;
      case "/":
        System.out.println(a + " " + oper + " " + b + " = " + (a / b) );
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }

  }
}
