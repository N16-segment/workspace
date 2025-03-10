import java.util.Scanner;

public class While_1_8 {
  public static void main(String[] args) {
//키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.
    Scanner sc = new Scanner(System.in);
    int endNum;
    System.out.println("정수입력 : ");
    endNum = sc.nextInt();

    //반복 시작 숫자
    int i = 1;
    //짝수의 개수를 저장할 변수
    int cnt = 0;
    //1부터 endNum까지 반복
    while (i < endNum + 1){
      //숫자가 짝수라면...
      if(i % 2 == 0){
        cnt = cnt + 1;
    }
      i++;//반복을 할 번 할때마다 i를 1증가시킨다.
//    while (i >= 1) {
//      if(i % 2 == 0){
//        endNum = endNum + 1;
//        i = (i-1)/2;
//        System.out.println(i);

      }
      System.out.println(cnt);

    }

  }

