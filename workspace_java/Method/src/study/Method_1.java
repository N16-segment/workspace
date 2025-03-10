package study;

/*
* 메서드(method) : 반복 사용되는 기능을 하나의 기능상자로 표현 한 것
* 대부분의 언어에서는 함수(f:x)라고 표현 하는 것을 자바에서는 메서드라고 함
*
* 메서드 사용 방법
* 1. 메서드를 정의(하고 싶은 기능을 정의)
*  - 메서드의 정의는 클래스 안 그리고 또다른 메서드 밖에서 작성
*  - 메서드의 정의 문법
*     접근제한자 [static] 리턴타입 메서드명(매개변수들){
*       메서드의 내용... -> 여러줄 가능
*     }
*
*     접근제한자는 무조건 public으로 사용!
*     접근제한자 뒤에는 static키워드를 사용!
*     메서드명은 소문자로 작성
*     메서드는 필요한 만큼 다수 정의 가능
*     메서드명은 중복 불가!
*     한 번 정의한 메서드를 여러번 호출(사용) 가능!
*
* 2. 정의된 메서드를 호출(사용)
*     정의된 메서드를 사용하기 위해서는 메서드 호출을 해야하는데,
*     호출을 하려면 정의한 메서드명과 동일해야 하고,
*     추가적으로 동시에 매개변수 정보(매개변수의 자료형, 매개변수의 개수)가 동일해야 함.
* */
public class Method_1 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");

    //printHello() 메서드를 호출
    printHello();
    printHello();

    System.out.println("프로그램 종료");
  }

  //'안녕하세요'를 출력하는 메서드의 정의
  public static void printHello(){
    System.out.println("안녕하세요");
  }


}
