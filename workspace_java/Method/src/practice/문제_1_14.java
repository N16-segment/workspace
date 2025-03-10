package practice;

public class 문제_1_14 {
  public static void main(String[] args) {
  //14. 두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고
    // 호출해보세요.
//    int num1 = 10;
//    int num2 = 60;
//    test14(num1, num2);
    test14(17, 2);

  }

  public static void test14 ( int num1, int num2){
    int max = num1 > num2 ? num1 : num2;
    int min = num1 < num2 ? num1 : num2;
    int cnt = 0; // 5의 배수의 합

    for (int i = min + 1 ; i <max ; i++) {
      if (i % 5 == 0) {
        cnt++;
      }
    }

    System.out.println("두 수 사이의 5의 배수의 개수: " + cnt);
  }

}
