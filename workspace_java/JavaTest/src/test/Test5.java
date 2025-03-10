// 숫자 야구 게임을 아래의 요구사항을 만족할 수 있도록 만드시오. (클래스명 : Test5.java)
// 먼저 크기가 3인 정수형 배열을 생성하고 배열의 각 요소에 1 ~ 9사이의 랜덤한 정수를 저장한다.
// 중복 불허.
// 3스트라이크가 될 때까지 프로그램을 지속되어야 하며
// 실행 결과 3스트라이크를 맞춘 도전 횟수를 출력 Scanner를 통해 입력한 세 수와 요구사항
// 1)에서 생성한 랜덤한 세 수를 비교하여 스트라이크와 볼을 결정한다.
// 키보드로 입력한 수가 1)에서 만든 배열의 수와 일치하며 위치도 같다면 스트라이크,
// 수는 일치하지만 위치가 다르면 볼이다.

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    //문제 해결을 위한 변수
    Scanner sc = new Scanner(System.in);
    int[] baseball = new int[3];
    int[] answer = new int[3];
    int tryCnt = 0;//도전횟수
    int strike = 0, ball = 0;

    //중복되지 않는 1~9까지의 정수가 담긴 배열 생성
    //1 ~ 9사이의 랜덤한 정수
    for (int i = 0; i < baseball.length; i++){
      //1 <= x < 10 1~9까지의 랜덤 정수를 저장
      baseball[i] = (int)(Math.random() * 9 + 1);
      //중복 검사
      for(int j = 0; j < i ; j++){
        if(baseball[i] == baseball[j]){
          i--;
          break;
        }
      }
    }
    System.out.println("만들어진 숫자 : " + Arrays.toString(baseball));
    System.out.println("숫자를 정했습니다. 게임을 시작합니다.");
    //무한루프 while문
    while(true){
//      System.out.println(tryCnt + " >> ");
//      tryCnt++;
      System.out.print(++tryCnt + " >> ");
      //키보드로 입력받은 세 수를 담는 배열 생성
      answer[0] = sc.nextInt();
      answer[1] = sc.nextInt();
      answer[2] = sc.nextInt();

      for(int i = 0; i < baseball.length; i++){
        for(int j = 0; j < answer.length; j++){
//          System.out.println("i = " + i + ", j = " + j);
          if(baseball[i] == answer[j]){
            if(i == j){
              strike++;
            }
            else{
              ball++;
            }
          }
        }
      }
      System.out.println(strike + "S, " + ball + "B");
      //while문 안에서 결과 출력
      if(strike == 3){
        System.out.println(tryCnt + "회만에 정답을 맞췄습니다.");
        break;//가장 가까운 반복문을 벗어난다. 감싸고 있는 반복문이 while문
      }
      else {
        strike = 0;
        ball = 0;
      }
    }



  }
}
