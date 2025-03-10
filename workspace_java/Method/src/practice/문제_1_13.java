package practice;

public class 문제_1_13 {
  public static void main(String[] args) {
    //13. 두 정수를 매개변수로 받아,  1,5 -> 2 3 4
    // 두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해보세요
    //매개변수에 변수를 인자로 넣어줌
    int a = 5;
    int b = 15;
    test13(a, b);

//  test13(9, 5); -> 매개변수에 상수를 인자로 넣어줌

  }
  //int first = a;
  public static void test13(int first, int second){
    //두 수 중 큰 수, 작은 수를 구분 -> 삼항 연산자
    int max = first > second ? first : second;
    int min = first < second ? first : second;
    //두 정수 사이의 숫자를 출력
    //min = 5, max = 9
    for (int i = min + 1 ; i < max; i++){
      System.out.println(i + " ");

    }
  }
}
