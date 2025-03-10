package practice;

public class 문제_1_1_5 {
  public static void main(String[] args) {
//1번 ~5번 문제 호출
    test1();
    test2(10);
    test3("java");
    test4(10, 30);
    test5(1, 3, 5);


  }
  //5. 정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test5(int a, int b, int c){
    System.out.println(a * b * c);
  }

  //4. 정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test4(int num1, int num2){
    System.out.println(num1 + num2);
  }

  //3. 문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
  public static void test3(String text){
    System.out.println(text);

  }

  //2. 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
  public static void test2(int num){
    System.out.println(num);
  }
  //1. '안녕하세요'라는 문자열을 출력하는 기능을 가진 메소드를 선언
  public static void test1(){
    System.out.println("안녕하세요");
  }
}
