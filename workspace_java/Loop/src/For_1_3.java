public class For_1_3 {
  public static void main(String[] args) {
    //출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력해 보세요.

    //첫번째 방법
    for(int i = 2 ; i < 11; i = i +2) {
      System.out.println(i);
    }
    System.out.println();
    //두번째 방법
    for(int i = 1; i < 11; i++){
      if (i % 2 == 0) {
        System.out.println(i);

      }
    }
  }
}
