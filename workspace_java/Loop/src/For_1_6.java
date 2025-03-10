public class For_1_6 {
  public static void main(String[] args) {
    //1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
    int cnt = 0;
    for(int i = 1; i <101; i++){
      if (i % 3 == 0) {
        cnt = cnt + 1;
        //cnt++;
      }
    }
    //실행값은 한번만 출력하면 되므로 for문 중괄호 밖으로 빼준다.
    System.out.println(cnt);
  }
}
