package practice;
//다음 문제를 풀면서 Member 클래스를 완성하여라.
// 1. Member 클래스는 필드로 이름, 아이디, 비밀번호를 갖는다.
// 모든 필드를 선언하고,
// 기본 생성자와 클래스의 모든 데이터를 변경할 수 있는 생성자를 만드시오.
// 2. 각 필드에 대한 setter와  getter를 만들어라.
// 3. 모든 필드의 값을 출력하는 displayInfo() 메소드를 만들어라.
// 4. 실행 클래스를 만들어 이름을 ‘자바’,
// 아이디는  ‘java’, 비밀번호는  ‘123’으로 변경하고
// 출력메소드를 사용하여 결과를 확인하여라.
public class Member1 {
  //필드선언
  private String name;
  private String id;
  private String pw;

  //기본 생성자, 데이터 변경할 생성자
  public Member1(){}

  public Member1(String name, String id, String pw){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  //setter
  public void setName(String name){
    this.name = name;
  }public void setId(String id){
    this.id = id;
  }public void setPw(String pw){
    this.pw = pw;
  }
  //getter
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public String getPw(){
    return pw;
  }
  //출력 메소드
  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + pw);
  }




}
