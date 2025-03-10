package practice;

public class Array_1_실습문제_2_5 {
  public static void main(String[] args) {

    //문제 2. 배열을 생성하는 방법으로 틀린 것은?

    // 1) int[] array = {1, 2, 3}; -> o
    // 2) int[] array; array = {1, 2, 3}; -> x
    // 3) int[] array = new int[3]; -> o
    // 4) int[][] array = new int[3][2]; -> 2차원 배열

    //문제 3. 다음 소스에서 잘못된 부분은?

    // int[10] arr; -> x int[] arr;
    // arr = new int[10];
    // arr[0] = 3;
    // arr[1] = arr[0] + 1;

    //문제 4. 다음 소스에서 잘못된 부분은?
    // int[] arr = {1, 2, 3, 4, 5};
    // arr[arr.length] = 0; -> arr의 5번째 공간이 없으므로 오류가 난다. (0부터 4까지 있음)

    //문제 5. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소의 값을 출력해보아라.
    int[] arr1 = new int[10];

    for(int i = 0 ; i < arr1.length ; i++){
      System.out.print(arr1[i] + " ");
    }
  }
}
