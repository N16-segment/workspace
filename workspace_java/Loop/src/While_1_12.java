public class While_1_12 {
  public static void main(String[] args) {
    //1부터 누적해서 합을 구하다 300이 최초로 넘었을 때
    // for문을 멈추고 그때까지의 합과
    //마지막으로 더해진 값을 각각 출력하여라.
    //1~99
//    int sum = 0;
//    int i = 1;
//    for(i = 1; 1 < 100; i++){
//      sum = sum + i;//계속 연속해서 더한 누적의 합
//      if (sum > 300) {
//        break;
//      }
//    }
//      System.out.println("합 = " + sum);
//      System.out.println("마지막으로 더해진 값 = " + i);
    int i = 1;
    int sum = 0;

    while (1 < 100) {
      sum = sum + i;//계속 연속해서 더한 누적의 합

      if (sum > 300) {
        System.out.println("마지막으로 더해진 값 = " + i);
        System.out.println("합 = " + sum);
        break;
      }
      i++;
    }


  }
}
