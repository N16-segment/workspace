package practice;

public class Array_1_실습문제_7 {
  public static void main(String[] args) {
//문제 7. 정수를 10개 저장할 수 있는 배열을 생성하고, 각 요소에 1 ~ 10까지 차례대로 넣어보라.
// 그리고 값이 잘 들어갔는지 확인해보라.

    int[] arr1 = new int[10];
    //각 요소에 1 ~ 10가지 차례대로 넣어줌
    for(int i = 0 ; i < arr1.length ; i++){
      arr1[i] = i + 1;

      System.out.print(arr1[i] + " ");
    }



  }
}
