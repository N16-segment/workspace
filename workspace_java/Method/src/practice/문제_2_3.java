package practice;

//문제 3.
//두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
public class 문제_2_3 {
  public static void main(String[] args) {
//    aaa();
//    System.out.println("두 정수 중 큰 숫자 : " + aaa());

    aaa(10, 20);

  }
//  public static int aaa(){
//    int a = 7;
//    int b = 6;
//    if (a > b) {
//      return a;
//    }
//    else{
//      return b;
//    }
  public static int aaa(int a, int b){
    return a > b ? a : b;
  }

}
