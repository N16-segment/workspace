import java.util.Scanner;

public class IF_1_10 {
  public static void main(String[] args) {

    //세 정수를 선언하고 scanner로 값을 입력받는다. 그리고 세 수를 큰 순서대로 출력하여
    //보라.(난이도 높음)

    Scanner sc = new Scanner(System.in);
    int a, b, c; //키보드를 입력받은 정수 저장을 위한 변수
    int min;
    int mid;
    int max;

    System.out.print("첫번째 정수입력 : ");
    a = sc.nextInt();
    System.out.print("두번째 정수입력 : ");
    b = sc.nextInt();
    System.out.print("세번째 정수입력 : ");
    c = sc.nextInt();

    //    숫자 크기 비교
    //    a가 가장 클 경우
    if (a > b && a > c) {
      max = a;
      //b가 c보다 클 경우
      if (b > c) {
        mid = b;
        min = c;
      }
      //그렇지 않은 경우
      else{
        mid = c;
        min = b;
      }
    }

    //그렇지 않고 b가 가장 클 경우
    else if (b > a && b > c){
        max = b;
      if (a > c) {
        mid = a;
        min = c;
      }
      else{
        mid = c;
        min = a;
      }
    }

    //c가 가장 클 경우

    else {
      max = c;
      if (a > b) {
        mid = a;
        min = b;
      }
      else{
        mid = b;
        min = a;
      }
    }

    System.out.print(max + " > " + mid + " > " + min);

  }
}
