package study;

/*
* 매개변수가 있는 메서드
* 매개변수 : 메서드의 정의 부분에 () 영역에 작성한 변수를 매개변수라고 한다.
* 매개변수가 하는 역할 : 메서드 내에서 기능을 구현 할 때
*                     특정 데이터가 필요하다면,
*                     그 데이터를 매개변수로 작성!
* */
public class Method_3 {
  public static void main(String[] args) {
    //호출을 하려면 정의한 메서드명과 동일해야 하고,
    //추가적으로 동시에 매개변수 정보(매개변수의 자료형(정수면 정수, 실수면 실수...), 매개변수의 개수)가 동일해야 함.
    printNum(7);
    printNum(5);
    printNum(3);

    //매서드 선언 시 매개변수의 자료형과 매서드 호출시 사용한
    //매개변수 자료형이 다르면 오류!!!
    //printNum("java"); 오류!!!

    //매개변수의 개수가 달라도 오류!!
    //printNum(20, 30); 오류!!!

  }
  //원하는 숫자를 출력하는 메서드 정의 -> 메서드명(매개변수)
  public static void printNum(int num){//int num = 7 이라고 가정하고 문제를 풀어본다.
    System.out.println(num);
  }


}
