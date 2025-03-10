public class While_4 {
  public static void main(String[] args) {

    //2 4 6 8 10 을 while을 사용해서 출력

//    int a = 2;
//    while (a < 11) {
//      System.out.println(a);
//      a = a + 2;
//    }

    int a = 2;//웬만하면 "0"부터 하는 게 좋다.
    while (a < 11) {
      //실행 내용
      if (a % 2 == 0) {
        System.out.println(a);
      }
      a++;//통상적으로 1씩 증가한다
    }
  }
}
