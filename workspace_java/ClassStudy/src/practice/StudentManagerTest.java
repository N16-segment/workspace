package practice;

import java.util.Scanner;

public class StudentManagerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("학생 관리 프로그램을 실행합니다.");

    //while문 실행여부 값을 갖고 있는 변수
    boolean isRunning = true; //실행되고 있는 거니라고 물을 경우 보통 변수값을 is를 많이 준다.

    //학생 관리 기능이 있는 StudentManage 클래스에 대한 객체 생성
    StudentManager manager = new StudentManager(); //객체명 만들어줄때 자동으로 생성자 호출

    while(isRunning){//무한루프 while문에서 종료를 위해 변수를 만들어서 넣어준다.
      System.out.print(" 1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 : ");
      int option = sc.nextInt();

      switch (option){
        case 1:
          manager.regStudent();//객체명.메서드
          break;
        case 2:
          manager.setTelInfo();
          break;
        case 3:
          manager.printStuInfo();
          break;
        case 4:
          manager.printStuInfoAll();
          break;
        case 5:
          System.out.println("프로그램을 종료합니다.");
          //while문 그만하세요!
          isRunning = false;
          break;
        default:
          System.out.println("1 ~ 5번 중 하나의 정수를 입력해주세요.");

      }

    //break
      //1. switch case break;
      //2. 가장 가까운 반목문을 벗어난다.
    }
  }
}
