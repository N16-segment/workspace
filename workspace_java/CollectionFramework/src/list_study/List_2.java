package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
  public static void main(String[] args) {
    //정수를 다수 저장할 수 있는 list1 객체 생성
    //배열과 다르게 저장할 데이터의 개수 제한이 없다!
    List<Integer> list1 = new ArrayList<>();//정수를 다수 저장할 수 있는 통을 만듦

    //list1에 데이터 추가 -> 순서로 접근
    //넣는 순서대로 0부터 index가 설정
    list1.add(5);//메서드의 기능처럼 기능이 만들어져 있다.
    list1.add(10);
    list1.add(3);
    list1.add(5);//순번부여, 중복가능

    //list1에 저장된 데이터 읽기 -> 데이터 값이 아닌 순번으로! 중복값이 있을 수 있으므로.
    //get() 메서드의 안에서 index가 들어감
    System.out.println(list1.get(0));

    //list1에 저장된 데이터 삭제 -> 순서로 접근
    list1.remove(1);

    //list1에 저장된 데이터의 개수
    System.out.println(list1.size());

    //데이터 변경
    list1.set(0, 8);//0번째 데이터를 8로 변경하겠습니다.

    //list1의 모든 데이터 출력 -> for문과 동일
    for(int i =0; i < list1.size(); i++){
      System.out.println(list1.get(i));
    }

  }

}
