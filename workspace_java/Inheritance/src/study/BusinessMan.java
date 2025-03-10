package study;

//클래스 선언문에서 클래스명 다음에
// 'extends  상속할 클래스명' 문법을 적용하면 상속을 사용할 수 있다.
//상속을 사용하면 상속하는 클래스의 멤버변수, 매서드를 물려받는다.
//물려받는다 : 멤버면수와 메서드를 내 것처럼 사용 가능
public class BusinessMan extends Man{
  String company;

  //자식 클래스는 부모클래스의 멤버변수, 메서드를 사용하기 위해
  //내부적으로 부모클래스의 생성자를 호출해서 객체를 하나 생성
  //부모클래스의 생성자를 호출하는 코드는
  //자식클래스의 생성자 첫 줄에 숨겨져있다.
  //부모클래스의 생성자는 매개변수 정보가 없는 생성자를 호출
  public BusinessMan(String company){
    //부모클래스의 매개변수 정보가 없는 () 생성자를 호출하는 생성자가 숨겨져있다.
    //super(); //부모클래스의 매개변수 정보가 없는 생성자 호출->적지않아도 생략되어 있는 것 (숨어있다)
    super("kim");
    //부모클래스의 매개변수 정보가 없는 생성자가 없을때 자식클래스에서 수퍼를 생성하면 오류가 사라진다.
    this.company = company;
  }

  public void tellcompany(){
    System.out.println("my company is " + company);
  }

  //public > defalt > protected > private
  //protected : private + 해당 클래스의 자식 클래스는 접근 허용

  class D{
    protected int num;
  }
  class E extends D{
    public void aaa(){
      num = 10;
    }
  }


}

