//조건문 : if문
//조건문 : 조건이 맞을 때만 코드를 실행하는 문법
/*
* if(참 또는 거짓을 판단할 수 있는 조건){
*   실행코드...
*   실행코드...
* }
*
* */

public class IF_1 {
  public static void main(String[] args) {
    System.out.println("시작");

    //만약에, ~라면 [실행코드]는 여러개를 출력하게 만들 수 있다.
    int num = 3;
    if(num == 3){
      System.out.println("aaaa");
      System.out.println("aaaabbb");
      System.out.println('a');
    }

    //조건에 따른 실행코드가 하나(한 줄)라면 중괄호 생략 가능
    if(num > 5)
      System.out.println("bbbb");
    System.out.println("cccc");//if문 안에 있는 것이 아니므로 다른 출력문이으로 출력됨

    System.out.println("끝!");

  }
}
