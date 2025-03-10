public class 출력문_1 {
    public static void main(String[] args){

      // 소괄호 안의 내용을 출력하는 명령어 + 한 줄 개별 행
      System.out.println("hello~");
      System.out.println("hello~");
      // 소괄호 안의 내용을 출력
      // ln(라인줄)을 빼면 한 줄 개행이 아니고 옆으로 나란히 붙게된다.
      System.out.print("hello~");
      System.out.print("hello~");

      //한 줄 개행만 한다.
      // 위의 명령어에 이어서 진행되면 나란히 붙고 다음부터 적용되므로 내용을 비우면 행을 바꿀 수 있다.
      System.out.println();

      //숫자를 출력할 떄에는 쌍따옴표를 넣지 않음!
      //문자는 반드시 쌍따옴표로 감싼다.
      System.out.println(5);
      //숫자를 쌍따옴표로 감싸면 연산이 되지 않는 단순 문자로 인식
      System.out.println("5"+ 1);



    }
}
