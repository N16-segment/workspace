import java.util.Scanner;

public class IF_1_2 {
  public static void main(String[] args) {
//키보드로 정수를 하나 입력받아, 입력받은 값이 짝수이면 ‘짝수입니다.’,
// 홀수이면 ‘홀수입니다.’를 출력해보자

    Scanner sc = new Scanner(System.in);

    int x;

    System.out.println("정수입력 :");
    x = sc.nextInt();

    if (x % 2 ==0) {
      System.out.println("짝수입니다.");
    }
    else{
      System.out.println("홀수입니다.");
    }
  }
}
