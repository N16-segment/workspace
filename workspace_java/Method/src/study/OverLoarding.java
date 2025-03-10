package study;

//메서드 오버로딩
//메서드명은 중복 불가!
// 하지만, 메서드의 매개변수 정보(매개변수의 개수, 매개변수의 자료형)가 다르면,
//중복된 이름으로 메서드명 작성을 허용!

public class OverLoarding {
  public static void main(String[] args) {
    System.out.println(true);
    //println(5);?
  }
  //문자열을 출력하는 메서드
  public static void println(String str){
    System.out.println(str);
  }
  //정수를 출력하는 메서드
  public static void println(int str){
    System.out.println(str);
  }
  //정수를 출력하는 메서드
  public static void println(int str, int str1){
    System.out.println(str);
  }
  //매서드명이 같아도 매개변수 정보가 다르면 오류가 발생하지 않는다.
  //매개변수의 개수와 매개변수의 자료형이 중요하지 매개변수의 이름은 위와같이 같아도 무관하다.



}
