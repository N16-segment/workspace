package study;

public class StudentTest2 {
  public static void main(String[] args) {
    //Student 클래스의 객체 stu1 생성
    Student stu1 = new Student();
    stu1.printInfo();

    //학생 stu1 객체의 데이터 변경
    stu1.name = "Lee";
    stu1.age = 18;
    stu1.score = 90;
    stu1.printInfo();

    System.out.println();

    //Student 객체 stu2 생성
    Student stu2 = new Student();

    //stu2 객체의 데이터 변경
    stu2.setName("Kim");
    stu2.setAge(21);
    stu2.setScore(96);
    stu2.printInfo();

    System.out.println();

    //Student 클래스의 객체 stu3 생성
    Student stu3 = new Student();
    stu3.setAllInfo("Hong", 50, 100);
    stu3.printInfo();

  }
}
