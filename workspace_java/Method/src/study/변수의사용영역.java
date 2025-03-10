package study;

//변수는 사용 가능한(인식 가능한) 범위가 존재한다.
//변수의 사용 영역은 해당 변수가 선언된 {} 안에서만 가능!
public class 변수의사용영역 {
  public static void main(String[] args) {

    int a = 5;

    if(a > 3){
      //변수 b는  if문 안에서만 사용(인식) 가능!
      int b = 10;
      System.out.println(a);
      System.out.println(b);

    }
    System.out.println(a);
//    System.out.println(b);오류 발생! {} 범위를 벗어남

    System.out.println();
    /// ////////////////////////////////////////////////
    //int num2 = 15; 위에서 지정하면 if문 안에서도 인식되므로 오류 발생!
    if(10 > 5){
      int num2 = 5;
    }
    if(3 > 1){
      int num2 = 10;
    }
    for(int i = 0 ; i < 10 ; i++){
      //for문의 ()안에서 정의된 변수 i는 어디까지 사용 가능?
      //현재 for문 안에서만 사용 가능하다.
    }
//    System.out.println(i);//for문을 벗어나면 i를 인식하지 못한다.
    System.out.println();

    //int data = 1; // for문 밖에서 변수를 선언하면 한번만 인식하므로 for문 내용으로 값이 변동된다.
    for(int i = 0 ; i < 10 ; i++){
      int data = 1;//선언문이 for문 안에 있으면 계속 반복되어 같은 값이 출력된다.
      System.out.println("data = " + data);
      data++;
    }

  }
}
