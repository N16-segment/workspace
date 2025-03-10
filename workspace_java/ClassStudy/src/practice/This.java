package practice;
//문제 9~12번으로 this
//이름, 아이디, 비밀번호, 나이
public class This {
  String name;
  String id;
  String pw;
  int age;

  //회원의 모든 정보를 변경하는 기능
  public void setAllInfo(String name, String id, String pw, int age){
    //this. 이 클래스에서 정의된 name
    // -> 자바에서 가장 중요한 이름을 따라간다.
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }
  public void printInfo(){
    System.out.println("name : " + name);
    System.out.println("id : " + id);
    System.out.println("pw : " + pw);
    System.out.println("age : " + age);

  }

}
