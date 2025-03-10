package practice;

import java.util.Scanner;
//문제 2.
// scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 곱을 리턴하는 메소드를 선언하고
// 호출하여 결과를 호학인해보세요.
public class 문제_2_2 {
  public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    System.out.print("첫번째 정수 입력 : ");
    int a = sc.nextInt();
    System.out.print("두번째 정수 입력 : ");
    int b = sc.nextInt();

    int result = aaa(a, b);
    System.out.println(result);

  }

  public static int aaa(int a, int b){
    return a * b;
  }
}
