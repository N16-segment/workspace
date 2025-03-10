package study;

//클래스를 멤버변수로 활용하기 -> 클래스도 하나의 자료형이다.
public class Worker {
  String company;//회사명 -> 자료형(앞에 대문자->클래스) 변수명
  String dept;//부서명 -> 자료형 변수명
//  private String name;//사원 이름
//  private int age;//사원의 나이
  PersonInfo personInfo = new PersonInfo(); // -> 자료형(클래스 자료형) 변수명
  //선언 후 생성까지 진행해야 인지한다.
}
