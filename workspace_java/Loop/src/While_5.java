public class While_5 {
  public static void main(String[] args) {
    //1~5까지의 합

    //1+2+3+4+5

    int a = 1;
    int sum = 0; //1~5까지의 합 결과를 저장할 변수
    while (a < 6) {
      sum = sum + a;
      //System.out.println(sum);//결과값 -> 1 3 6 10 15 가 출력됨
      a++;
    }
    System.out.println(sum); //밖으로 빼줘야 결과값 하나만 출력된다.

  }
}
