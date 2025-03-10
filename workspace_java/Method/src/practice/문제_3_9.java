package practice;

import java.util.Arrays;

//문제 9.
// 정수형 배열 하나를 매개변수로 받아 배열의 요소 중
// 홀수를 제거한 새로운 배열을 리턴하는 메서드를 만들어보세요.
public class 문제_3_9 {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6};
    int[] result = test9(arr1);
    System.out.println(Arrays.toString(result));
    //Arrays.toString -> 배열 내용 출력하기 ; 자동변환 사용하면 된다.

  }
  //배열은 배열 생성 시 크기가 정해지면 크기 변경이 불가함!
  public static int[] test9(int[] arr){//arr.length
    //arr = {1, 2, 3, 4, 5, 6}
    //arr = {0, 2, 0, 4, 0, 6} -> x
    //arr = {2, 4, 6} -> 삭제된 내용이지만 배열의 크기를 변경하는 것은 불가함!

    //newArr {2, 4, 6} -> 홀수 제거가 아니라 새로운 배열을 생성해야한다.
    // -->매개변수로 전달된 배열에서 짝수만 갖는 새로운 배열 생성
    //0. 생성할 배열의 크기를 구하는 게 먼저
    // --> 매개변수로 전달된 배열의 요소에서 짝수의 개수를 파악
    int arrLength = 0;
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] % 2 == 0){
        arrLength++;
      }
    }
    //1. 배열 생성
    int[] newArr = new int[arrLength];
    //int[] newArr = new int[?];
    // -->이렇게 한 번 지정하고 나면 크기를 못바꾸니까 고정되지 않도록 변경해야함 -> 0번
    //2. 매개변수로 전달된 배열의 요소 중 짝수만 newArr 배열에 저장
    int index = 0;//newArr의 index를 파악하기 위한 변수
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] % 2 == 0){
        newArr[index] = arr[i];
        //newArr[?]에서 안의 요소를 뭐로 넣어야할지 모를때는 새로운 변수를 생성해서 넣어준다.
        index++;
        //newArr[index++] = arr[i];//후위 증가 연산자 위의 두 줄을 한 줄로 만듦
      }
    }
    return newArr;

  }

}
