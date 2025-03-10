package practice;
// 17. 계산기 클래스를 사용하는 클래스를 만들어 계산기 프로그램을 실행하여 보세요.
// main 메소드에서는 두 정수와 연산자를 scanner로 입력받습니다.
// 입력받은 연산자에 따라 더하기, 뺴기, 곱셈, 나눗셈 중 하나를 실행합니다.
// 실행 후 결과를 출력해보세요.
// 실행 결과는 아래와 같아야 합니다.(굵은 기울임체는 입력받는 수입니다.)
// -결과-
//첫 번째 수 : 10
//두 번째 수 : 20
//연산자 : +
//10 + 20 = 30
public class Calculator {//기본생성자 자동생성, 내용없음
  private int a;
  private int b;

  //생성자
  public Calculator(int a, int b){
    this.a = a;
    this.b = b;
  }

  public void setA(int a){
    this.a = a;
  }public void setB(int b){
    this.b = b;
  }

  //더한 결과를 리턴하는 기능 - getter
  public int getSum(){//리턴타입 정수
    return a + b;
  }
  //빼기 기능
  public int getSub(){
    return a - b;
  }
  //곱하기 기능
  public int getMulty(){
    return a * b;
  }
  //나누기 기능
  public double getDiv(){
    return a / (double)b;
  }


}
