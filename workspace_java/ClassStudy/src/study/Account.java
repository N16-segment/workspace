package study;

//멤버변수는 초기값을 갖는 것이 좋은 코드다!
// -> 선언과 동시에 초기값을 주지는 않는다.

//계좌 정보
public class Account {
  String accNumber; //"11111-22222"
  int money; //예금액
  String owner; //계좌주

  //통상적으로 멤버변수를 만든 다음 생성자를 만든다.

  //생성자(constructor) - 멤버변수의 값의 초기값을 할당할 목적!

  //생성자는 메서드의 한 종류라고 생각할 것!
  //메서드와 비슷하나 리턴타입 없이!, 클래스명과 동일하게 선언!
  //만약 클래스에 생성자가 하나도 없다면,
  // -->자동으로 기본 생성자를 생성함
  // 기본생성자(default 생성자) - 아래와 같다.
  //  public Account(){
  //   }

  public Account(){//-> 이름은 클래스명과 동일!
    accNumber = "지정되지 않음";
    money = 10000;
    owner = "지정되지 않음";
  }

  //멤버변수의 값을 초기화하는 기능 -> 초기값을 주는 것
  public void initAcc(String accNumber, int money, String owner){
    this.accNumber = accNumber;
    this.money = money;
    this.owner = owner;
  }

  //매개변수로 전달된 금액을 예금액에 더하는 메서드
  public void deposit(int money){
    this.money = this.money + money;//money 값을 줄 때마다 돈이 누적된다.
  }
  public void printAccInfo(){
    System.out.println("계좌번호 : " + accNumber);
    System.out.println("예금액 : " + money);
    System.out.println("계좌주 : " + owner);
  }

}
