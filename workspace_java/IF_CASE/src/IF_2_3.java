import java.util.Scanner;

public class IF_2_3 {
  public static void main(String[] args) {

//360게임을 간단히 작성해보자.
//1~99까지의 정수를 키보드로부터 입력받고 정수에 3,6,9중 하나가 있는 경우는
// "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
//예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을,
//36인 경우 "박수짝짝"을 출력하면 된다.

    Scanner sc = new Scanner(System.in);
    int num;
    int clapCnt = 0;//박수의 갯수

    System.out.println("1~99 사이의 정수를 입력하시오>>");
    num = sc.nextInt();

    //입력받은 정수를 1의 자리와 10의 자리 수로 분리
    //십의 자리
    int tens = num / 10;
    //일의 자리
    int ones = num % 10;

    //만약 십의 자리 수가 3, 6, 9면 박수 수를 1증가
    //만약 일의 자리 수가 3, 6, 9면 박수 수를 1증가

    if (tens == 3 || tens == 6 || tens == 9) {
//    if (tens % 3 == 0 && tens != 0) {
      clapCnt = clapCnt + 1;
//      clapCnt += 1;
//      ++clapCnt;
//      clapCnt++;
    }
    if (ones == 3 || ones == 6 || ones == 9) {
      ++clapCnt;
    }

    //clapCnt = 0, 1, 2
    //0이면 박수없음
    //1이면 박수짝
    //2이면 박수짝짝
    //범위가 아닌 지정값이므로 스위치를 사용한다.

    switch (clapCnt) {
      case 0:
        System.out.println("박수없음");
        break;
      case 1:
        System.out.println("박수 짝");
        break;
      case 2:
        System.out.println("박수 짝짝");
    }

  }
}

