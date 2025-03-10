package practice;


import java.util.Scanner;

public class 문제_1_10 {
  public static void main(String[] args) {
    //10. 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’, 홀수이면 ‘홀수입니다’를
    // 출력하는 메소드를 선언하고 호출해보세요.

//    Scanner sc = new Scanner(System.in);
//    System.out.print("정수 입력 : ");
//    int num = sc.nextInt();
//    test10(num);

    //test10() 메서드의 인자로 5가 전달되었다.
    test10(5);

  }
  //조건 ? 참일때 실행 내용 : 거짓일 때 실행 내용; -> 삼항 연산자
  public static void test10(int num){
    System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다.");
//    if(num % 2 == 0){
//      System.out.println("짝수입니다.");
//    }
//    else {
//      System.out.println("홀수입니다.");
//    }

  }
}
