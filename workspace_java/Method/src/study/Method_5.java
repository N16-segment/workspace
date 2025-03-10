package study;

/*
* 매서드의 리턴타입
* - 매서드의 실행결과 리턴되는 데이터의 자료형
* - 리턴 : 매서드를 호출하는 곳에 결과값을 되돌려준다.
* - 리턴되는 데이터의 자료형과 매서드의 리턴타입은 일치!
* - return 명령어는 실제 데이터를 리턴하는 역할을 하며
* - return 명령어 뒤에는 어떠한 코드도 올 수 없다!
* - 매서드에서 return 명령어는 한 번 만 실행할 수 있다.
* */
public class Method_5 {
  public static void main(String[] args) {
    int a = aaa();
//    aaa();
//    System.out.println(aaa());
    System.out.println(a); // 3 -> 리턴값이 aaa()로 결과값을 돌려주므로 a는 3일 출력된다.

//    double d = Math.random();//첫 글자 대문자면 class이다.

    int sum = bbb(10, 20);
    System.out.println(sum);

    System.out.println();

    ddd();
    System.out.println(ddd());

  }
  //return 명령어를 한 번만 실행할 수 있다의 의미 -> 작성이 아니라 실행!
  public static int ddd(){
    // 두 수 중 큰 수를 리턴
    int a = 5;
    int b = 10;
    //아래 if 문은 둘 중에 하나만 실행되는 것이므로 return을 두 번 작성하는 것과는 무관하게 한 번만 실행된다.
    if (a > b) {
      return a;
    }
    else{
      return b;
    }

  }

  //매개변수로 전달된 두 수의 합을 리턴하는 매세드
  public static int bbb(int a, int b){
    return a + b;
    //return 뒤에는 다른 코드 못옴!
  }

  public static int aaa(){
    System.out.println(5); // 5
    //매서드 실행 후 3을 리턴하겠습니다.
      return 3;
    //return 3; 오류!! -> return 은 매서드 안에서 한 번만 실행된다.
  }


}
