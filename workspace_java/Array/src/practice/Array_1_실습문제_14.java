package practice;

public class Array_1_실습문제_14 {
  public static void main(String[] args) {
    //문제 14.
    // 초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
    // 그리고 길이가 5인 새로운 정수형 배열 newArr을 만든 후
    // arr이 가진 값을 newArr로 복사하여 보자.
    //복사 결과는 출력을 통해 확인한다

    int[] arr = {5,4,3,2,1};
    int[] newArr = new int[arr.length];

    for(int i = 0; i < arr.length; i++){
      newArr[i] = arr[i];
    }

    for(int i = 0; i < newArr.length; i++){
      System.out.print(newArr[i] + " ");
    }


//    newArr[0] = arr[0];
//    newArr[1] = arr[1];
//    newArr[2] = arr[2];
//    newArr[3] = arr[3];
//    newArr[4] = arr[4];

  }

}

//for문 출력 상관관계 공부하기