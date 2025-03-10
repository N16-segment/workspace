import java.util.Scanner;

public class IF_1_1 {
  public static void main(String[] args) {
    //정수를 담을 수 있는 변수 두개를 선언하고,
    //각각의 변수에 임의의 정수를 초기화 하여라.
    //그리고 두 수의 합이 50보다 클 경우에는 '두 수의 합이 50보다 큽니다.'를 출력,
    //두 수의 합이 50 이하일 경우에는 '두 수의 합이 50이하 입니다.'를 출력

    int num1 = 20;
    int num2 = 31;

    System.out.println(num1);
    System.out.println(num2);

    if (num1 + num2 > 50) {
      System.out.println("두 수의 합이 50 보다 큽니다.");
    }
    else{
      System.out.println("두 수의 합이 50 이하 입니다.");
    }



  }
}
