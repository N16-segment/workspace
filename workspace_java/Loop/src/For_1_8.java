import java.util.Scanner;

public class For_1_8 {
  public static void main(String[] args) {
    //키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.

    Scanner sc = new Scanner(System.in);
    int endNum;
    System.out.print("정수입력 : ");
    endNum = sc.nextInt();

    int cnt = 0;
    for (int i = 1; i < endNum +1; i++) {
      if (i % 2 == 0) {
        cnt = cnt + 1;
      }
    }
    System.out.println(cnt);
  }
}
