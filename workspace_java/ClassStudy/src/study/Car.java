package study;

/*
* 자동차를 객체로 만들기 위해 자동차 설계도를 작성!!
* 클래스-설계도-명 무조건 대문자로 시작 Car
* 클래스(설계도)의 구성 요소 : 데이터(변수), 기능(메서드의 정의), 생성자
* -->설계도만 만들 뿐 객체를 만들어야 실행이된다!
* 클래스 안에서 선언한 변수 : 멤버 변수, 필드
* 메서드 안에서 선언한 변수 : 지역 변수(local variable)
*                 *참고 - public void aaa(int a)int a 라는 매개변수는 지역변수의 종류 중 하나
* 멤버변수 vs 지역변수
* -지역변수는 반드시 초기화가 필요!
* -멤버변수는 초기화 하지 않으면 기본 값으로 초기화가 자동 진행 됨! -> 그래서 사용이 가능
* */
public class Car {
  //데이터(자동차가 가져야 하는 정보)
  String carName;//자동차명
  int price;//자동차 가격

  //시동거는 기능
  public void powerOn(){
    System.out.println("시동을 겁니다~");
  }
  //브레이크를 밟는 기능
  public void takeBreak(){
    System.out.println("브레이크를 밟습니다");
  }

}
