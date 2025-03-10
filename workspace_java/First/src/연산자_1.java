public class 연산자_1 {
  public static void main(String[] args) {
    //산술 연산자(+, -, *, /, %)
    //'%' : mod(모드) 연산자 : 나눗셈의 나머지
    System.out.println(6 % 2);
    System.out.println(8 % 3);
    System.out.println();

    //정수끼리의 연산은 무조건 정수로 결과가 나옴
    // 하나라도 실수가 있으면 실수값이 나옴
    System.out.println(8 / 3);
    System.out.println(8.0 / 3);

    int a = 8;
    //a가 8.0으로 바뀐다. 강제로 실수로 바꿈
    System.out.println((double) a / 3);
    System.out.println();

    //비교 연산자(>, <, >= 크거나 같다, <= 작거나 같다, == 같다, != 다르다)
    //'==' : 같다. "!=! : 다르다
    System.out.println(5>1); //true 참으로 나옴
    System.out.println(3 == 3);
    // true 참으로 나옴, 항상 참인데 쓰려고 하는 코드가 맞는지 확인하게 하기위해 경고를 줌

    //자바 오류 : 빨간색으로 표기
    //자바 경고 : 노란색으로 표기

    //복합 대입 연산자 :
    int num = 3;

    //num이 가진 값을 1증가 시키는 코드
    // num + 1;  아래처럼 저장해줘야 값이 출력된다.
    //num 값을 1 증가 시키는 코드
    num = num + 1;
    num += 1; // 위의 연산을 줄여서 만드는 방법
    System.out.println(num);

    num *= 3; // num = num * 3;
    num -= 4; // num = num - 4;
    num /= 2; // num = num / 2;
    num %= 2; // num = num % 2;

    //논리 연산자
    //그리고(and) &&
    //3 > 1 그리고 2 < 4 ?
    //둘다 참이면 -> 참
    //3 > 1 && 2 < 4 ?
    //이거나(or) : || -> 버티컬바 2개
    //둘 중 하나가 참이면 -> 참(짬뽕 또는 짜장)
    //이거나(or) : | -> 버티컬바 1개
    //앞에 나온 부분이 참이면 뒤에 나오는 건 해석하지 않고 -> 참
    System.out.println(3>1 && 2<4); //true 둘다 참일 경우 사용, 조건문에 엄청 나옴(물어보고 실행시킴)
    //and 와 or 연산이 동시에 있으면 and 연산이 우선순위가 높다.
    System.out.println(1 == 1 && 2 > 1 || 3 > 5 && 1 < 4);
    System.out.println((1 == 1 && 2 > 1) || (3 > 5 && 1 < 4));//우선순위 구분하기 쉬운 방법으로 ()를 넣어준다.

  }
}
