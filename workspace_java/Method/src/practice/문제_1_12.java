package practice;

public class 문제_1_12 {
  public static void main(String[] args) {
    //12. 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언 및 호출해보세요.

//    int number = 6;
//    test12(number);
      test12(5);
  }
    public static void test12(int num) {
      for (int i = 0; i <= num; i++) {
          System.out.print(i + " ");
        }
      System.out.println();
    }


}




