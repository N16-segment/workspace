package practice;

public class ManTest2 {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.initmember("홍길동", 30, "서울시");

    Man m2 = new Man();
    m2.initmember("유관순", 20, "울산시");

    //m1과 m2중 나이가 많은 사람의 이름을 출력
    //setter -> 각각의 데이터 변경 시 사용
    //getter -> 각각의 데이터를 읽어올 때 사용
    if(m1.getAge() > m2.getAge()){
      System.out.println(m1.getAge());
    }
    else{
      System.out.println(m2.getAge());
    }

    //m1 객체의 나이가 30이면
    //m1 객체의 이름을 "이순신"으로 변경하세요.
    if(m1.getAge() == 30){//객체를 불러온다.->getter
      m1.setName("이순신");//객체를 변경한다.->setter
    }

  }
}
