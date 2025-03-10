package static_study;

public class Count {
  static int cnt;//공용변수

  //static 변수 초기화 구문
  static{//공유하기 위해서 생성자가 아닌 곳에서 사용
    cnt = 0;
  }
  public Count(){
//    cnt = 0;//cnt값을 호출할때 마다 초기값을 0으로 만들어 주므로
    //->static 변수는 생성자에서 초기화 하지 않는다.
    System.out.println("생성자 실행~");//생성자 내에서 출력문을 만들어도 무방
    cnt++;
    System.out.println("cnt = " + cnt);
  }

}
