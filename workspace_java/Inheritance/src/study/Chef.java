package study;

//상속관계에 있는 두 클래스에서
 //자식 클래스에서 부모클래스의 메서드명과
 //매개변수 정보를 동일하게 작성해도 메서드 선언을 허용
//이것을 메서드 오버라이딩
//오버라이딩을 하면 부모클래스에서 정의한 메서드를 덮어써버리기 때문에
//부모클래스에서 정의한 메서드 호출 불가!!
//덮어버리면 초기 메서드는 사용불가

//Chef 클래스 생성
public class Chef {
  public void makeCook() {
    System.out.println("쉐프가 요리합니다.");
  }
}
 //Chef 클래스를  MasterChef 클래스 생성
  class MasterChef extends Chef {
  //makeCook 매서드 생성(){기능}
    public void makeCook() {
      System.out.println("마스터가 요리합니다.");
    }
  //giveOrder 메서드 생성(){기능}
    public void giveOrder() {
      //메서드 호출 - 메서드명();
      super.makeCook();//쉐프가 요리합니다.
      makeCook();//마스터가 요리합니다.
      this.makeCook();//마스터가 요리합니다.
      System.out.println("후임에게 지시합니다.");//후임에게 지시합니다.
    }
  }


