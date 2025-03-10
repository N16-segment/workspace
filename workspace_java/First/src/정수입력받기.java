import java.util.Scanner;

public class 정수입력받기 {
  public static void main(String[] args) {
    //키보드 입력을 받기 위한 변수(복사해서 사용! 실무에서 사용 안함)
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 : ");
    int a = sc.nextInt();

    System.out.println("입력받은 정수 : " + a);


    // 문자열 : sc.next();
    // 정수입력 : sc.nextInt();


  }
}
