package practice;

//문제 6.
// 정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을
// 리턴하는 메서드를 만들고 호출해보세요.
public class 문제_3_6 {
  public static void main(String[] args) {
    int[] arr = {2, 6, 8, 3, 5};
    int maxData = test6(arr);
    System.out.println(maxData);

    test6(arr);
    System.out.println(test6(arr));
  }

  public static int test6(int[] arr){//[2,6,8,3,5]라고 가정
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;//for문 끝나고 나서 리턴~~!
  }

}





