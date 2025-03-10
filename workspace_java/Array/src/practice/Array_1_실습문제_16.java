package practice;

public class Array_1_실습문제_16 {
  public static void main(String[] args) {
    //문제 16. 기본 개념
    //자바에서 랜덤 숫자를 발생시키고 싶을 때는
    //Math.random():명령어를 사용!
    //Math.random():0 <= x < 1.0 사이의 랜덤한 실수값 생성

    double r = Math.random();//랜덤은 무조건 처음부터 실수로 시작한다.
    System.out.println(r);

    //0부터 10까지의 랜덤한 정수를 생성
    //0 <= x < 11.0
    int d = (int)(Math.random() * 11);  //실수의 값을 정수로 강제로 변경시켜주는 작업을 실행해야 함
    // 11이라는 수치의 개념은 시작값과 끝값에 공통적으로 주는 값
    // ex) 0 <= x < 0 기본에서 랜덤에 + 11을 적용시키면 11 <= x < 12의 범위가 설정된다.
    System.out.println(d);

    //문제 16. Math.random(); 이라는 메소드가 있다. 이 메소드는 0 ~ 1까지 사이의 실수 중 랜덤한 수
    //를 전달해준다. 예를 들어 double d = Math.random();을 하면  0.0 <= d < 1 중 임의
    //의 실수 값이 d에 할당된다. 이를 활용하여 정수형 변수 I에 50 <= I < 100 의 임의의 정수
    //를 저장해보라.(배열문제아님)

  }
}
