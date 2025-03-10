package practice;

//문제 9.
// 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중
// 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.
public class 문제_2_9 {
  public static void main(String[] args) {

    int a = aaa(3);
    System.out.println(a);

  }
  public static int aaa(int num){
    int sum = 0;
    for(int i = 1 ; i <= num; i++ ){
      if(i % 2 != 0){
        sum = sum + i;
      }

    }
    return sum;

  }
}
