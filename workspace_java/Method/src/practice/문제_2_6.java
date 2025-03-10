package practice;

//문제 6.
// 매개변수로 정수를 입력받아,
// 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
public class 문제_2_6 {
  public static void main(String[] args) {

    String b = aaa(10);
    System.out.println(b);
  }
  public static String aaa(int num){
    //String a = "";
    //return a;

    // 숫자 -> 문자열
    String a = String.valueOf(10);//숫자 10이 문자열 10으로 나온다.

    // 문자열 -> 숫자
    int b = Integer.parseInt("10");//문자화 되어있는 숫자 문자열 10이 정수 10으로 나온다.

    return String.valueOf(num);
    //return num + "";
  }

}
