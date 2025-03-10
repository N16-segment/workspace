package practice;

public class 문제_1_15 {
  public static void main(String[] args) {
    //15. 한 문자열과 정수를 매개변수로 받아, 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼
    // 반복 출력하는 메소드를 선언하고 호출해보세요.

//    String text = "Hello";
//    int Count = 3;
//    test15(text, Count);

      test15("java", 5);

  }
      //매개변수의 내용은 다른게(ex) 문자, 정수) 들어와도 가능
      public static void test15(String str, int num) {
        for (int i = 0; i < num; i++) {
          System.out.print(str + " ");
        }
        System.out.println();
      }


    }











