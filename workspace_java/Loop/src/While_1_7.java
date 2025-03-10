import jdk.swing.interop.SwingInterOpUtils;

public class While_1_7 {
  public static void main(String[] args) {
//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해
//보세요.

    int a = 1;
    int cnt = 0;
    while (a < 101) {
      if (a % 5 == 0) {
        System.out.print(a + " ");
        cnt++;
      }
      a++;
    }
    System.out.println();//한줄 개행해야 다음줄에 아래값이 출력됨
    System.out.println("5의 배수의 개수 = " + cnt);
  }
}
