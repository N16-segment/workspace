import java.util.Scanner;

public class IF_1_4 {
  public static void main(String[] args) {
    // 키보드로 정수 하나를 입력받아, 그 값이 3의 배수이면 ‘3의 배수입니다’를 출력해보자.

    Scanner sc = new Scanner(System.in);

    int num1;
    System.out.print("정수 입력 : ");
    num1 = sc.nextInt();

    if(num1 % 3 == 0){
      System.out.println("3의 배수입니다.");
    }


  }
}
