package practice;

import java.util.Scanner;

public class StudentManager {
//  Scanner sc = new Scanner(System.in);//자료형 변수명 -> 멤버 변수
  private Scanner sc;//멤버 변수는 생성자에서 초기화 시킨다
//  Student[] students = new Student[3];//학생을 3명 저장시킬 수 있는 공간을 만듦
  private Student[] students;//멤버변수
  //->학생을 3명 저장시킬 수 있는 공간을 생성만 해주고 초기화 해주는 것이 좋으므로 생성자로 간다.
  private int index;//students 배열의 요소를 지정. 몇번째 인지

  public StudentManager(){
    sc = new Scanner(System.in);
    students = new Student[3];//멤버변수
    index = 0;

  }
  //학생 등록 기능
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생정보를 입력하세요.");
    System.out.println("이름 : ");
    String name = sc.next();
    System.out.println("나이 : ");
    int age = sc.nextInt();
    System.out.println("연락처 : ");
    String tel = sc.next();
    System.out.println("학점 : ");
    String grade = sc.next();

    //입력받은 정보로 학생을 생성한다.
    Student stu = new Student(name, age, grade, tel);//입력받은 정보를 갖고 있는 학생을 객체 한 명 만든다.

    //생성한 학생을 students 배열에 저장한다.
    students[index++] = stu;//학생 배열에 학생을 저장
    //->증감연산자로 순서대로
    //students[index] = stu; 위 의 한 줄을 풀어쓴 것
    //index++;

  }
  //학생 정보 변경(연락처)
  public void setTelInfo(){
    System.out.println("학생의 연락처 정보를 변경하는 기능 실행~");
  }
  //학생 정보 출력(한명)
  public void printStuInfo(){
    System.out.println("학생 한 명의 정보를 출력하는 기능 실행~");
  }
  //모든 학생 정보 출력
  public void printStuInfoAll(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+ index + "명입니다.");
    for(int i = 0 ; i < index ; i++){
      students[i].printStudent();
      System.out.println();

    }
  }

}
