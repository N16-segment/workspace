public class 변수_2 {
  public static void main(String[] args) {
    //변수는 필요하면 여러개 사용할 수 있음
    int num1;
    num1 = 10;

    int num2;
    num2 = 20;
    //int num2; 변수명은 중복불가, 변수는 소문자로 만든다.
    //대문자를 엄격하게 구분하므로 별도의 변수명으로 본다.
    int Num2;

    //num1 변수와 num2 변수에 저장된 정수의 합을 출력
    System.out.println(num1 + num2);
    //문자와 숫자는 나열된다.
    System.out.println("num1 + num2 = " + num1 + num2);//num1 + num2 = 1020 으로 출력된다.
    System.out.println("num1 + num2 = " + (num1 + num2));//num1 + num2 = 30 으로 출력된다.

  }
}
