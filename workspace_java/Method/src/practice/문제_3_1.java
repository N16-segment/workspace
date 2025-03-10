package practice;

//문제 1.
//정수 하나를 매개변수로 받아
// 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.
public class 문제_3_1 {
  public static void main(String[] args) {
    test1(5);
  }

  public static void test1(int num1){
    for(int num2 = 1; num2 < 10 ; num2++){
      System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }
  }

}
