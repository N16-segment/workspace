package Practice;

import java.util.ArrayList;
import java.util.List;

//문제 9.
// TestStudent 라는 클래스를 만들어, 위에서 만든 Student클래스의 객체가 저장되는 리스트를 만들어
// 3명의 학생 정보를 추가한 다음, 아래 문제를 풀어보세요
// 1) 리스트에 저장된 모든 정보를 출력해보세요.
// 2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
// 3) 모든 학생에 대한 평균 점수를 출력하세요.
// 4) 총점이 1등인 학생의 모든 정보를 출력해보세요.
public class StudentTest {
  public static void main(String[] args) {
    //Student클래스의 객체가 저장되는 리스트 생성
    List<Student> studentsList = new ArrayList<>();

    //3명의 학생 정보 객체 생성
    Student s1 = new Student("김자바", 70, 60);
    Student s2 = new Student("박자바", 65, 80);
    Student s3 = new Student("송자바", 60, 90);

    //리스트에 저장된 모든 정보를 출력
    for(int i = 0 ; i < studentsList.size(); i++){
      System.out.println(studentsList.get(i).toString());
    }
    //총점이 150점 이상인 학생의 모든 정보를 출력
    for(Student s : studentsList){
      if(s.getSum()>150){
        System.out.println(s);
      }
    }
    //모든 학생에 대한 평균 점수를 출력
    int avrg = 0;
    for(int i = 0 ; i < studentsList.size(); i++){
      avrg = (studentsList.get(i).getKorScore() + studentsList.get(i).getEngScore()) / 2;
      System.out.println(avrg);
      }
    //총점이 1등인 학생의 모든 정보를 출력
    int max = 0;
    for(int i = 0 ; i < studentsList.size(); i++){
      if(studentsList.get(i).getSum() > max){
        max = studentsList.get(i).getSum();
      }

    }

  }

  }


