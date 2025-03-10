import java.util.Scanner;

public class While_1_11 {
  public static void main(String[] args) {

    //키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.

    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.print("첫번째 정수입력 : ");
    num1 = sc.nextInt();
    System.out.print("두번재 정수 입력 : ");
    num2 = sc.nextInt();

    System.out.println();

    //두 수 중 큰 수와 작은 수를 구분
    int min = num1 > num2 ? num2 : num1; //Math.min(10,20);
    int max = num1 > num2 ? num1 : num2; //Math.max(10,20);
    //num1 : 1, num2 : 10 -> 임시로 가정함
    int i = min +1;//반복 시작
    int sum = 0;

    while(i < max){
      sum = sum + i;
      i++;

    }
    System.out.println("두 정수의 사이의 모든 정수의 합 = " + sum);

  }
}
