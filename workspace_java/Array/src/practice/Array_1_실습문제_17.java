package practice;

public class Array_1_실습문제_17 {
  public static void main(String[] args) {

    //문제 17번.
    // 간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고,
    // 배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자.
    // 그리고 배열의 모든 요소를 출력해보자.(1과 45를 포함하고, 중복값은 허용한다.)


    int[] lotto = new int[6];
    //1~45까지의 랜덤한 정수
    //1.0 <= x < 46.0 실수!!
    //(int)(Math.random() * 45 + 1)


    //배열의 모든 요소에 1 ~ 45까지의 랜덤한 정수 저장
    for(int i = 0 ; i < lotto.length ; i++){
      lotto[i] = (int)(Math.random() * 45 + 1);
    //System.out.print(lotto[i] + " ");
    // -> 바로 for문에서 요소마다 하나씩 값을 넣고 계산하고 출력하고 -> 이것을 반복하는 것
    }

    //배열의 모든 요소 출력
    for(int i = 0 ; i <lotto.length ; i++){
      System.out.print(lotto[i] + " "); // 요소의 크기만큼 모두 계산한 뒤 한번에 출력하는 것 -> 위의 것과 개념 정리
    }

  }

  }

//출력값 중 반복되는 숫자가 없도록 응용해보기