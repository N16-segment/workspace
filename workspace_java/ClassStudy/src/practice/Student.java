package practice;
//문제 13.
//학생관리 프로그램
public class Student {
  private String name;
  private int age;
  private String grade;
  private String tel;//010-1111-2222 문자열로 표현

  public Student(String name, int age, String grade, String tel) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tel = tel;
  }

  public void printStudent(){
    System.out.print("이름 : " + name);
    System.out.print("나이 : " + age);
    System.out.print("학점 : " + grade);
    System.out.print("연락처 : " + tel);
  }
}
