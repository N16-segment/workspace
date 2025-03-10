package 접근제한자1;

/*
* 접근제한자
* -멤버변수, 메서드, 클래스의 사용 범위를 지정
* -> 지역변수 즉 메서드 안에서의 변수에서는 접근제한자를 둘 수 없다.
* 종류 : public > default > protected > private
* public 선언된 변수와 메서드 : 같은 프로젝트라면 다른 패키지라도 접근 가능
* default 선언된 변수와 메서드 : 같은 패키지 내에서만 접근 가능
*                            (변수 앞에 아무것도 없음 -> 디폴트는 별도 선언문이 없다.)
* private 선언된 변수와 메서드 : 변수, 메서드를 선언한 클래스 안에서만 접근 가능
*
* 결론
* -멤버변수에는 무조건 private - setter, getter 만들어준다.
* -메서드에는 무조건 public
*
* */

public class Orange {
  private int a;
  int b;
  public int c;

  private int price;

  //setter
  public void setPrice(int price){
    if(price < 0){
      price = 0;
    }
    else {
      this.price = price;
    }
    this.price = price;
  }
  //getter

  private void aaa(){
    a = 10;//변수가 선언된 클래스 안에서는 사용 가능
  }
  void bbb(){
    aaa();
  }
  public void ccc(){}

}
