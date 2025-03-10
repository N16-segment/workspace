import java.util.Scanner;

public class IF_1_5 {
  public static void main(String[] args) {
//정수형 변수 하나를 선언하고 0 ~ 100까지의(0,100 포함) 숫자 중 임의의 값을 키보드로
//입력받아 초기화하자. 그 후 변수의 값이 90보다 크고 100보다 작거나 같으면 ‘학점은 A입니
//다.’를 출력하고, 80보다 크고 90보다 작거나 같으면 ‘학점은 B입니다.’를 출력하고, 80점 이
//하라면 ‘학점은 C입니다.’를 출력해보자

    Scanner sc = new Scanner(System.in);
    int x;
    String grade;

    System.out.print("정수 입력 : ");
    x = sc.nextInt();

    if(x > 90 && x <= 100) {
      grade = "A";

    }
    else if(x > 80){
      grade = "B";
    }
    else{
      grade = "C";
    }
    System.out.println("학점은 "+ grade +"입니다.");


  }
}
