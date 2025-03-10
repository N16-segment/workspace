import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    //키보드로 정수 두 개를 입력받아,
    //입력 받은 구 수의 합이 10 이상이면서
    //짝수는 아닐 경우에만 "참"이라는 문자열을 출력

    //변수 선언
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    //int a, b; 앞이 같으면 쉼표로 나열할 수 있다.

    //값 입력받기
    System.out.print("첫번째 정수입력 : ");
    a = sc.nextInt();

    System.out.print("두번째 정수입력 : ");
    b = sc.nextInt();

    //결과 출력
    //이상, 초과, 이하, 미만
    if (a + b >= 10 && (a + b) % 2 != 0 ) {
        System.out.println("참");
      }


    }

  }

