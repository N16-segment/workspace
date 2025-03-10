package Study;
//SamsungTv 클래스명에 마우스를 대로 자동으로 구현할 메서드를 작성한다. - 오류 사라짐
//인터페이스를 구현하더라도 다른 변수나 메서드를 추가하는 것이 가능하다.
public class SamsungTv implements Tv{

  @Override
  public void turnOn() {
    System.out.println("삼성티비 - 전원 켬");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성티비 - 전원 끔");
  }

  @Override
  public void volumeUp() {
    System.out.println("삼성티비 - 소리 올림");
  }

  @Override
  public void volumeDown() {
    System.out.println("삼성티비 - 소리 내림");
  }
}
