package study;

public class ChefTest {
  public static void main(String[] args) {
    //클래스명 변수명 = new 클래스명();
    //c1은 chef 클래스의 객체를 저장할 변수, 인스턴스를 참조하는 변수
    //new는 메모리에서 새로운 객체를 생성할 떄 사용
    //Chef();는 Chef클래스의 생성자를 호출하는 코드
    //따라서 아래는 Chef클래스의 새 객체를 생성하고, 그 객체의 참조를 변수 c1에 할당하는 코드
    //아래의 코드를 통해 c1은  Chef 객체를 가리키게 되며,
    //Chef 클래스에 정의된 속성이나 메서드를 사용할 수 있게 된다.
    Chef c1 = new Chef();
    //makeCook()는 Chef 클래스에 정의된 메서드
    //
    //c1은 Chef 클래스에 속한 속성과 메서드에 접근할 수 있다.
    //
    c1.makeCook();//변수명.메서드(); -> 메서드 호촐

    MasterChef c2 = new MasterChef();
    c2.makeCook();

    System.out.println();

    c2.giveOrder();


  }
}
