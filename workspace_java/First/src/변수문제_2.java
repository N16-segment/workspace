public class 변수문제_2 {
  public static void main(String[] args) {

    int a = 10;
    int b = 20;

    System.out.println("a = " + a);//10
    System.out.println("b = " + b);//20
    //여기까지 하면 출력결과는 a = 10
    //                     b = 20

    //여기서 값을 바꾸기 위해 임의적으로 숫자를 넣으면 안됩니다.
    //잘못된 예시
    //a = 20;
    //b = 10;

    //a와 b변수의 값을 스위칭
    //1. 변수 c를 만들고, a의 값을 c에 넣는다.
    int c = a;
    //2. b의 값을 a에 넣는다.
    a = b;
    //3. b의 값을 c에 넣는다.
    b = c;

    System.out.println("a = " + a);//20
    System.out.println("b = " + b);//10


  }
}
