// 1 ~ 999까지의 수 중 임의의 숫자를 Scanner를 통해 입력 받아,
// 입력받은 숫자의 369게임 결과를 출력하는 프로그램을 만드시오.
// 만약 박수가 없는 숫자라면 ‘박수 0번’, 박수 한 번이라면 ‘박수 1번’,
// 박수 두 번이라면 ‘박수 2번’, 박수가 3번이면 ‘박수 3번’이라는 문자열을 출력하면 된다.
// 단, 키보드로 숫자를 입력받을 때 1 ~ 999까지 숫자 이외의 데이터는
// 입력받지 않는다고 가정한다. (클래스명 : Test3.java)

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1~999사이의 정수입력 : ");
    int num = sc.nextInt();

    // 3, 6, 9의 개수를 셈
    int cnt = 0;
    int gameNum = num;  // 숫자를 변경하지 않기 위해 임시 변수 사용
    //숫자의 각 자리를 확인하고 더이상 자릿수를 가지고 있지 않을 때까지 반복
    while (gameNum > 0) {
      // 마지막 자릿수를 추출 -> (%) 나누고 남은 값 각 자리의 숫자가 3, 6, 9 중에 있는 지 확인
      int clap = gameNum % 10;
      if (clap == 3 || clap == 6 || clap == 9) {
        cnt++;  // 3, 6, 9가 있으면 카운트 증가
      }
      // 마지막 자리 숫자를 하나씩 처리
      gameNum =(int)(gameNum * 0.1);
    }

    // 박수 횟수에 따른 출력
    switch(cnt){
      case 0:
        System.out.println("박수 0번");
        break;
      case 1:
        System.out.println("박수 1번");
        break;
      case 2:
        System.out.println("박수 2번");
        break;
      case 3:
        System.out.println("박수 3번");
        break;
    }



  }
}
