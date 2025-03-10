package practice;

import java.util.Scanner;

public class 문제_1_7_8 {
  public static void main(String[] args) {
    //7번 ~ 8번 문제 호출
    test7("Hello~^^", "bye~!");

    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력 : ");
    int num = sc.nextInt();
    test8(num);
  }

  //8. 키보드로 입력받은 정수를 매수변수로 받아,
  // 해당 정수를 출력하는 메소드를 선언, 호출해보세요.
  public static void test8(int num) {
    System.out.println(num);
  }

  //7. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요
  public static void test7(String text1, String text2) {
    System.out.print(text1 + " " + text2);
    System.out.println();
  }


}








