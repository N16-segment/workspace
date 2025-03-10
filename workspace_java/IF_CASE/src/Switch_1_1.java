import java.util.Scanner;

public class Switch_1_1 {
  public static void main(String[] args) {

    //문자열 변수를 선언하고 scanner를 사용하여 문자열을 입력받는다. 입력받은 문자열이
    //“남” 이라면 ‘남자입니다.’를 출력하고, “여”라면 ‘여자입니다.’를 출력한다. 그 밖의 문자열
    //이 들어온다면 ‘다시 입력하세요.’를 출력해야 한다. if문을 사용하여 문제를 풀어보세요.
    // * 숫자가 같은지 비교를 할 때는 == 를 사용한다. ex> a == b
    // * 문자열이 같은지를 비교 할 때에는 equals() 메소드를 사용한다.
    // String s = “abc”;
    // if( s.equals(“abc”) ) // s에 저장된 문자열이 abc라면...

    String gender;
    Scanner sc = new Scanner(System.in);

    System.out.println("성별 입력 : ");
    gender = sc.next();

    if (gender.equals("남")) {
      System.out.println("남자입니다.");
    }
    else if (gender.equals("여")) {
      System.out.println("여자입니다.");
    }
    else {
      System.out.println("다시 입력하세요");
    }


//    String a = "여자";
//
//    if (a.equals("남자")) {
//      System.out.println("남자입니다.");
//    }
//    else if (a.equals("여자")) {
//      System.out.println("여자입니다.");
//    }
//    else{
//      System.out.println("다시 입력하세요");
//    }

  }
}
