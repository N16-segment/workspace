import java.sql.SQLOutput;
import java.util.Scanner;

//키보드로 국어, 영어, 수학 점수를 입력받은 후,
//입력받은 국어, 영어, 수학 점수 및 총점, 평균을 출력
//단, 국어, 영어, 수학 점수는 정수만 저장된다고 가정
//문제를 해결하기 위해 필요한 변수를 우선 생각
//int kor;
//int eng;
//int math;
//int total;
//double avrg;
//위의 경우 변수를 지정해 두었으므로,
//아래에 동시에 변수를 지정하고 값을 주지 않더라도 지정된 변수값을 바로 주면 된다.
//kor = sc.nextInt();
//eng = sc.nextInt();
//math = sc.nextInt();
//total = kor + eng + math;
//avrg = total/3;


public class 성적프로그램_1 {
  public static void main(String[] args) {
    //키보드 입력을 받기 위한 변수(복사해서 사용! 실무에서 사용 안함)
    Scanner sc = new Scanner(System.in);

    System.out.print("국어점수 : ");
    int kor = sc.nextInt();
    System.out.print("영어점수 : ");
    int eng = sc.nextInt();
    System.out.print("수학점수 : ");
    int math = sc.nextInt();

    int total = kor + eng + math;
    //정수끼리의 연산결관는 무조건 정수로 나옴
    double avrg = total/3.0;

//    System.out.print("국어점수 : " + kor);
//    System.out.print("영어점수 : " + eng);
//    System.out.print("수학점수 : " + math);
    System.out.println("총점 : " + (total));
    System.out.println("평균 : " + (avrg));
//    System.out.println("평균 : " + (total/3));


//위의 과정으로 출력
//    System.out.println("국어점수 : " + kor);
//    System.out.println("영어점수 : " + eng);
//    System.out.println("수학점수 : " + math);
//    System.out.println("총점 : " + (total));
//    System.out.println("평균 : " + (avrg));

  }
}
