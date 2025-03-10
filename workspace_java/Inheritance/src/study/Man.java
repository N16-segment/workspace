package study;

public class Man {
  String name;

//  public Man(){}
  public Man(String name){
    this.name = name;
  }

  //이름 메서드 생성
  public void tellName(){
    System.out.println("name is " + name);
  }
}
