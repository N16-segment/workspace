package practice;

import java.util.Arrays;

public class Array_1_실습문제_19 {
    public static void main(String[] args) {
        //문제 19.
        // 정수 10개를 담을 수 있는 배열을 생성하고,
        // Math.random()함수를 사용하여 1 ~ 100의 정수를 배열 각 요소에 저장하자.
        // 배열에 저장된 모든 정수 및 최소값, 최대값을 출력해보라.
        // (Math.random() 메소드는 0 <= x < 1 사이의 실수를 리턴한다.)

        int[] arr = new int[10];

        // 배열에 1 ~ 100 사이의 정수를 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1; // 1 ~ 100의 정수 생성
        }

        //배열 데이터 확인을 위한 출력 - > 반복문 대신 사용하는 명령어
        System.out.println(Arrays.toString(arr));//자동완성으로 엔터해야 위에 같이 활성화된다.
        System.out.println();

        // 배열 값 출력
        System.out.print("배열의 값 : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // 최소값과 최대값 초기화
        int min = arr[0];
        int max = arr[0];

        // 배열을 순회하며 최소값과 최대값 찾기
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // 최소값과 최대값 출력
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);


    }
}
