public class 삼항연산자 {
  public static void main(String[] args) {
    //int a = 3;
    //int b;
    //if(a > 5){
    //b = 1;
    //}
    //else{
    //b = 2;
  //}->삼항연산자를 쓰면 위의 예시에서 if문을 한줄로 표현할 수 있다.
    //위와 동일한 해석의 삼항연산자
    //삼항연산자
    //참 또는 거짓을 판별한느 조건 ? 참일 때 실행내용 : 거짓일 때 실행내용;
    //b = a > 5 ? 1 : 2;
    //b = 2;
    //? 앞의 내용이 맞는지 물어보는 조건문으로 ? 다음 참을 실행하고 : 뒤에 거짓을 실행
    //"="은 항상 마지막에 해석한다. 우측값을 왼쪽으로 넣는다.

    //num이 5이면 "참" 출력, 그렇지 않으면 "거짓" 출력
//    int num = 5;
//    if (num == 5) {
//      System.out.println("참");
//    }
//    else{
//      System.out.println("거짓");
//    }

    int num = 6;
    System.out.println(num ==5 ? "참" : "거짓");

    //키보드로 정수 두 개를 입력받아,
    //입력받은 수 중에서 큰 수는 max라는 변수에 저장하고,
    //작은 수는 min이라는 변수에 저장.
    int num1 = 3;
    int num2 = 7;
    int min = num1 > num2 ? num2 : num1;
    int max = num1 > num2 ? num1 : num2;

//    if(num1 > num2) {
//      max = num1;
//      min = num2;
//    }
//    else{
//      max = num2;
//      min = num1;
//    }



  }
}
