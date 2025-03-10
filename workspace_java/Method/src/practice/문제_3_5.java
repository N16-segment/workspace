package practice;

//문제 5.
//정수형 배열을 매개변수로 받아
//배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
//출력은 리턴이 없으므로 리턴타입!! 주지않는다.
public class 문제_3_5 {
  public static void main(String[] args) {
    int[] a = {5, 6, 8, 3};//먼저 배열을 만들고
    test5(a);//배열을 인자에 삽입하면
  }
  //참고~! -> 정수형 배열을 리턴하는... -> 리턴타입 int[]
  public static void test5(int[] arr){//int[] arr = a;
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");//배열의 0번째 요소부터 배열의 크기까지 출력
    }
  }


}
