package study;

//배열이 자료형이라는 의미
//자료형이 다르면 값 저장 못 함(밥은 밥그릇, 국은 국그릇)
public class Array_4 {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int a = 5;

    //a = arr1; -> 자료형 불일치!
    a = arr1[1]; // -> 배열에 있는 하나의 요소는 정수이므로 개별 요소는 저장 가능

    String[] arr2 = {"java", "house"};
    int[] arr3 = {1,5};
    //arr3 = arr2; -> 불일치 자료형은 저장되지 않는다.
    //String abc = arr2; -> 문자형 배열과 문자열은 자료형 불일치로 저장되지 않는다.

    int[] arr4 = {5,10};
    //arr4가 arr3와 같은 값을 가짐
    arr4 = arr3; // arr4 = {1,5};
    // -> 같은 정수형 배열 자료형이므로 저장 가능

    //arr4 = sc.nextInt();
    //arr4[2] = sc.nextInt(); -> 가능
  }
}
