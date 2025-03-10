package practice;

//6. 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해
//보세요
public class 문제_1_6 {


    public static void test6(int num1, int num2) {
      if (num2 == 0) {
        System.out.println("0으로 나눌 수 없습니다.");
        return;
      }

      int a = num1 / num2;
      int b = num1 % num2;

      System.out.println("나눗셈 몫: " + a);
      System.out.println("나머지: " + b);
    }

    public static void main(String[] args) {
      int num1 = 10;
      int num2 = 3;

      test6(num1, num2);
    }
  }


