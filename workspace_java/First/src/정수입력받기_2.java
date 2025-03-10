import java.util.Scanner;

public class 정수입력받기_2 {
  public static void main(String[] args) {
    //키보드 입력을 받기 위한 변수 생성(복사해서 사용! 실무에서 사용 안함)
    Scanner sc = new Scanner(System.in);

    //두 정수를 키보드로 입력 받아,
    //두 정수의 합을 출력

    System.out.print("첫번째 정수 입력 : ");
    int a = sc.nextInt();
    System.out.print("두번째 정수 입력 : ");
    int b = sc.nextInt();

    System.out.print("입력받은 정수 합 : " + (a+b));

  }

}
