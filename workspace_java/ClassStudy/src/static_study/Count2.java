package static_study;

public class Count2 {
  static int cnt;
  int number;

  public static void bbb(){
//    System.out.println(number);//static때문에 먼저 해석하므로 오류!
//    aaa();//역시 static을 먼저 해석하므로 aaa() 호출 불가!
  }

  public void aaa(){
    System.out.println(cnt);
    bbb();//static 먼저 실행하므로 호출가능
  }

  public static void main(String[] args) {
//    aaa();//aaa메서드에서 static이 붙은 bbb()를 먼저 호출했으므로 실행되지 않는다.
  }

}
