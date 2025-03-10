package static_study;

//static이 붙은 멤버변수는
//객체에 종속적이지 않고, 모든 객체가 공유하는 데이터
//static 변수는 생성자에서 초기화 하지 않는다.
//static 변수는 초기화 구문이 따로 존재!
//생성자보다 static 초기화가 먼저 진행 된다!
//static 변수는 객체명.멤버변수; 의 문법으로 호출을 권장하지 않는다.
//static 변수는 클래스명.변수명;
//static은 변수 및 메서드에 적용할 수 있다.
public class CountTest {
  public static void main(String[] args) {
    Count count1 = new Count();//static을 사용해도 공용변수가 계속 초기화 되어
    Count count2 = new Count();//cnt값이 0이라는 초기값을 갖는다.
    Count count3 = new Count();//그래서 static은 class 생성자에서 초기화하지 않는다.
    //static 변수는 생성자보다 먼저 실행되고 있으므로
    //위처럼 객체생성을 하지 않고 바로 클래스로 사용이 가능하다.

    System.out.println(count1.cnt);//3 생성자를 호출할때마다 증가하므로 호출이 없어서 마지막 값으로
    count2.cnt = 10;//공유이기때문에 하나의 객체명으로 변수를 불러오는 것은 비권장
    System.out.println(count1.cnt);//10 데이터를 공유하므로 같은 값을 갖는다.

    //static 변수는 -> 클래스명.변수명;
    //클래스명(첫글자 대문자) 뒤에 변수가 오면 static(공용)으로 인식한다.
    System.out.println(Count.cnt);//10

    System.out.println(Math.PI);//PI는 일정값이므로 공유해서 쓰라고 클래스명에 변수를 붙인다.
    System.out.println(Math.max(10,20));
  }




}
