package practice;

public class Array_1_실습문제_18 {
    public static void main(String[] args) {
        //문제 18.
        // 1, 5, 3, 8, 2를 초기값으로 갖는 배열을 생성하고
        // 해당 배열에서 최대값을 출력하여라.


        int[] arr = {1,5,3,8,2 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최대값: " + max);


    }
}
