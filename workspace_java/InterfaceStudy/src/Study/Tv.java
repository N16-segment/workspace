package Study;

//국제 tv연합기구에서 공통으로 사용할 수 있는 기능의 인터페이스를 만듦
//인터페이스의 접근제한자는 무조건 public만 사용한다.
//접근제한자를 작성하지 않으면 디폴트 값이 나오므로 '생략 가능'해서 색상이 연하게 나온다.

public interface Tv {
  //TV 전원 올림
  void turnOn();

  //TV 전원 내림
  public void turnOff();

  //TV 소리 올림
  public void volumeUp();

  //TV 소리 내림
  public void volumeDown();
}
