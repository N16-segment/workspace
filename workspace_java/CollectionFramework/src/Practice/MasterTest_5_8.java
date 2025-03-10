package Practice;

import java.util.ArrayList;
import java.util.List;
//// 6. TestMember클래스에 main메소드를 만들어
//// 위에서 만든 Member클래스의 객체를 저장할 수 있는 리스트를 만들어라.
//// 그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요.
//// 7. List에 저장된 모든 회원의 나이의 합을 출력하여라.
//// 8. List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.
public class MasterTest_5_8 {
  public static void main(String[] args) {
    //멤버 클래스의 객체를 저장할 수 있는 리스트 생성
    List<Member> list = new ArrayList<>();

    //3개의 Member 클래스의 객체 생성
    Member m1 = new Member("green", "12345", "Kim", 20);
    Member m2 = new Member("red", "23456", "Park", 30);
    Member m3 = new Member("java", "34567", "Lee", 40);

    //생성한 객체 3개를 리스트에 저장
    list.add(m1);
    list.add(m2);
    list.add(m3);

    //list에 저장된 모든 Member객체의 정보를 출력(toString 활용)
    for (int i = 0; i < list.size(); i++) {
      //출력문 안에 객체(명)이 있다면 toString()메서드 호출
      System.out.println(list.get(i).toString());//뒤에 toString는 생략해도 출력됨 /6번 끝
    }
//    System.out.println(list.toString());전체 모두 한줄로 출력
    System.out.println();

    //7. List에 저장된 모든 회원의 나이의 합을 출력하여라. for-each 문
    int sum = 0;
    for (Member m : list) {
      sum = sum + m.getAge();
    }
    //저장된 모든 회원의 나이의 합
    System.out.print("모든 회원의 나이의 합 : ");
    System.out.println(sum);
    System.out.println();

    //8. List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.
    //list에 저장된 데이터 하나하나에 접근하여 id가 "java"인지 확인
//    for (Member m : list) { -> for-each문을 사용할 수 없다.
    for(int i = 0 ; i < list.size();  i++){
      if (list.get(i).getId().equals("java")) {
        list.remove(i);
        break;
        //리스트 객체명.remove(index);
        //list.remove(?); index의 순번을 알 수 없으므로 for-each문을 사용할 수 없다.
      }
      System.out.println(list.get(i).toString());
    }

  }



}









