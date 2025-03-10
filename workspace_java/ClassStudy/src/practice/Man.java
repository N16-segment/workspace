package practice;
//문제 15.
//아래의 문제를 풀면서 사람을 표현하는 Man 클래스를 만들어보자.
//1) Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버변수를 선언하세요.
//2) 맴버변수의 모든 값을 초기화 할 수 있는 메소드를 만드세요,
//3) 맴버변수 각각의 값을 변경하는 메소드를 3개를 만드세요.->setter를 만들어라!
//4) 각 맴버변수의 값을 리턴하는 메소드를 3개 만드세요.
//5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
//6) Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.
public class Man {
  String name;
  int age;
  String address;
  //멤버변수의 모든 값을 초기화 할 수 있는 메서드
  public void initmember(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }
//  //멤버변수 각각의 값을 변경하는 메소드
//  //setter 만드세요~
//  //setter -> 멤버변수 하나의 값을 변경시키는 메서드
//  //       ->setter 메서드는 이름이 정해져 있음(set멤버변수명)
//
//  //name 값을 변경하는 setter 메서드 정의
//  public void setName(String name){
//    this.name = name;
//  }
//
//  //age 값을 변경하는 setter 정의
//  public void setAge(int age){
//    this.age = age;
//  }
//  public void setAddress(String address){
//    this.address = address;
//  }
//
//  //각 멤버변수의 값을 리턴하는 메서드
//  //name을 리턴하는 메서드
//  //getter -> 멤버변수 하나의 값을 리턴하는 메서드
//  //       -> 메서드의 이름 : get변수명 -> 변수명이 똑같이 들어와야한다.
//  public String getName(){
//    return name;
//  }
//  public int getAge(){
//    return age;
//  }
//  public String getAddress(){
//    return address;
//  }

//빈공간 우클릭 Generate
// -> Getter(리턴하는 메서드) and Setter(변수값 변경) 자동변환
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  //멤버변수의 모든 정보를 출력하는 메서드
  public void printInfo(){
    System.out.println("이름 : "+ getName());
    System.out.println("이름 : "+ name);
    System.out.println("나이 : "+ age);
    System.out.println("주소 : "+ address);
  }
}
