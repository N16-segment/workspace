import java.awt.*;
import java.util.Scanner;

public class IF_2_1 {
  public static void main(String[] args) {

    //Scanner를 이용하여 정수를 3개 입력받고 이 세 개의 수로 삼각형을 만들 수 있는지를
    //판별하라. 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 한다.
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    System.out.print("첫번째 변 : ");
    a = sc.nextInt();

    System.out.print("두번째 변 : ");
    b = sc.nextInt();

    System.out.print("세번재 변 : ");
    c = sc.nextInt();

    if (a + b > c && b + c > a && a + c > b) {
      System.out.print("입력한 세 변으로 삼각형 가능");

    }
  }
}
