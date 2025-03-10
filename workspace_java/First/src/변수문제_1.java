public class 변수문제_1 {
  public static void main(String[] args) {
    //정수를 저장할 수 있는 변수 3개를 만들고
    //각각에 01, 20, 30의 값을 저장하고, 그 후 세 수의 합을 출력하시오.

    int a = 10;
    int b = 20;
    int c = 30;

    //1. 풀이 방법
    System.out.println(a + b + c);
    System.out.println("a + b = " + c);
    System.out.println("a + b + c = " + (a+b+c));

    //2.풀이 방법
    int result = a + b + c;
    System.out.println(a + b + c);
    System.out.println(result);

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("a + b + c = " + (a+b+c));





  }
}
