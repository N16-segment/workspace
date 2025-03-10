package study;

public class WorkerTest {
  public static void main(String[] args) {
    Worker w1 = new Worker(); // 객체 만듦
    //-> 회사명, 부서명, personInfo에서 이름, 나이는 아래처럼 .찍어서 뒤에 연결하면 호출됨

    //w1의 이름 출력
    System.out.println(w1.personInfo);
    System.out.println(w1.personInfo.name);//객체명.필드(멤버변수) 객체명.변수명

    System.out.println(w1.company);
  }
}
