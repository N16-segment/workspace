import java.util.Scanner;

public class IF_ELSE_2 {
  public static void main(String[] args) {
    //키보드로 하나의 정수를 입력 받아,
    //그 수가 3의 배수이면 '3의 배수입니다.'를 출력하고
    //조건에 맞지 않으면 '3의 배수가 아닙니다.'를 출력한다.

    Scanner sc = new Scanner(System.in);
    int x;

    System.out.print("정수 입력 : ");
    x = sc.nextInt();

    //하나의 쌍~ 따라서 둘 중에 하나만 출력이 된다.
    if (x % 3 == 0) {
      System.out.print("3의 배수입니다.");
    }
    else{
      System.out.print("3의 배수가 아닙니다.");
    }
  }
}
