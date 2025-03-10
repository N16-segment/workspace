package practice;

//문제 4.
// 정수 하나를 매개변수로 받아, 매개변수가 짝수면 true,
// 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
public class 문제_3_4 {
  public static void main(String[] args) {
//    boolean result = isEven(4);

    boolean result = isEven(4);
    if(result){

    }
    System.out.println(result);

    isEven(3);
    System.out.println(isEven(3));
  }
  //정수 하나를 매개변수로 받아,
  //매개변수가 짝수면 true, 홀수면 false를 리턴하는 메서드
  public static boolean isEven(int num){
    return num % 2 == 0;

  }



}
