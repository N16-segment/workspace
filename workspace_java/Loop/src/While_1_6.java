public class While_1_6 {
  public static void main(String[] args) {
    int a = 1;
    int cnt = 0;
    while (a < 101) {
      if (a % 3 == 0) {
        cnt = cnt + 1;
      }
      a++;
    }
    System.out.println(cnt);
  }
}
//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
