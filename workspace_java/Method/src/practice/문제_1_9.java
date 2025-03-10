package practice;

import java.util.Scanner;

public class 문제_1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 정수 입력 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 정수 입력 : ");
    int num2 = sc.nextInt();

    test9(num1, num2);

  }

  // 9. scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하
//는 메소드를 선언하고, 호출해보세요.
  public static void test9(int num1, int num2) {
    System.out.println(num1 + num2);
  }



  }



