package practice;

//문제 3.
// Math.random() 메소드를 활용하여 1~ 50의 수 중
// 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
public class 문제_3_3 {
  public static void main(String[] args) {
    int result = test3();
    System.out.println(result);
    //위의 내용과 같은 결과를 실행 -> 한 줄로 간단히 정리
    System.out.println(test3());

  }
  public static int test3(){
    //0.0 <= x <= 1.0 실수라인
    return(int)(Math.random() * 50 + 1);
  }

    }




