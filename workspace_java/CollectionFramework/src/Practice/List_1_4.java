package Practice;

import java.util.ArrayList;
import java.util.List;

//문제 4.
//리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
// 그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
// (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)
public class List_1_4 {
  public static void main(String[] args) {
    //정수를 다수 저장할 수 있는 리스트 객체 생성
    List<Integer> list = new ArrayList<>();
    System.out.println();

    //10번 반복
    for (int i = 0; i < 10; i++) {
      //1~100까지의 랜덤한 정수 생성
      //1.0 <= x <101.0 실수 리턴
      list.add((int) (Math.random() * 100 + 1));
    }
    for(int e : list){
      System.out.print(e + " ");
    }
    System.out.println();
    //저장된 데이터 중 짝수의 개수와 모든 짝수 출력
    //리스트에 저장된 데이터 수만큼 반복하면서 짝수인지 확인
    int cnt = 0;//짝수의 개수를 저장할 변수
    int sum = 0;//짝수의 합을 저장할 변수
    for (int i = 0; i < list.size(); i++) {
      //리스트에 저장된 하나하나의 데이터가 짝수인지 확인
      if (list.get(i) % 2 == 0) {
        System.out.print(list.get(i) + " ");
        //cnt 값을 1증가시킨다.
        cnt++;
        sum = sum + list.get(i);

      }
    }
    System.out.println();
    System.out.println("짝수의 개수 : " + cnt);
    System.out.println("짝수의 합 : " + sum);


  }
}
