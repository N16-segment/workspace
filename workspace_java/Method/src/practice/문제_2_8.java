package practice;

//문제 8.
//세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
public class 문제_2_8 {
  public static void main(String[] args) {

    double result = aaa(8,8,7);
    System.out.println(result);

  }
  public static double aaa(int a, int b, int c){
    return (a + b + c)/3.0;//주의!! 실수 값으로 출력해야하므로 3.0으로 나눠준다.
  }
}
