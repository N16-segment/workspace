public class 출력문_2 {
  //main + enter -> public static void main(String[] args {}
  public static void main(String[] args) {
    //sout + enter -> System.out.println()

    //소괄호 안의 내용이 연산 가능하면 연산(+,-,*,/) 결과를 출력
    System.out.println(5+5);
    //쌍따옴표에 작성된 모든 내용은 단순 문자로 인식
    System.out.println("5 + 5");

    //숫자와 문자의 합, 문자와 문자의 합은 나열한 결과로 나온다.
    System.out.println(3 + "3");
    System.out.println(3 + "안녕");
    System.out.println("hi" + "hello");
    //문자가 하나라도 나오면 무조건 문자로 인식한다.
    //문자끼리는 + 에서만 적용(-,*./->적용 안됨)
    System.out.println(3 + 5 + "a" + 5);//8a5

    //스페이스바도 문자로 인식한다.
    //출력은 자바에서 안쓰지만 결과를 보기 위해서 해봤음


  }
}