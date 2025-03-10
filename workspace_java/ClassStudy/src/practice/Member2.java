package practice;

//문제 13~
//현실 세계의 회원을 Member 클래스로 모델링하려고 합니다.
//회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다.
//이 데이터들을 가지는 Member 클래스를 선언해보세요.

//
public class Member2 {
  private String name;
  private String id;
  private String pw;
  private int age;

  public Member2(String name, String id){
    this.name = name;
    this.id = id;
  }
    public Member2(String pw, int age){
    this.pw = pw;
    this.age = age;
  }


}
