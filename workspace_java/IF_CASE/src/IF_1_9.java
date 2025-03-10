import java.util.Scanner;

public class IF_1_9 {
  public static void main(String[] args) {
    //정수형 변수를 두 개 선언하고, scanner로 값을 입력받는다. 입력받은 수의 크기를 비교하
    //여 큰수부터 나열하여 출력하여라.(굵은 기울기체는 사용자가 입력하는 부분이다

    Scanner sc = new Scanner(System.in);
    int a, b;
//    int min; a와 b중 작은 수를 저장할 변수
//    int max; a와 b중 큰 수를 저장할 변수

    System.out.print("첫번째 정수입력 : ");
    a = sc.nextInt();
    System.out.print("두번째 정수입력 : ");
    b = sc.nextInt();

    //a의 값이 b의 값보다 크다면...
    if(a > b){
      System.out.println(a + " > " + b);
//      min = b;
//      max = a;
    }
    else{ //b > a, a == b
      System.out.println(b + " > " + a);
//      min = a;
//      max = b;
    }
//    System.out.println(min + " > " + max);
  }
}
