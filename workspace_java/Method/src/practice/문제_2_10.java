package practice;

//문제 10.
// 매개변수로 문자열 데이터 하나를 받아, 해당 문자열의 길이가 짝수 일 때는 true를 리턴하고,
// 홀수 일 때는 false를 리턴하는 메서드를 선언하고 사용해보세요.
public class 문제_2_10 {
  public static void main(String[] args) {

    String a = "가가가";
    aaa(a);
    System.out.println(aaa(a));

  }
  public static boolean aaa(String str){
//    int a = str.length();//배열에서 나오는 num.length(요소의 길이 = 크기)는 매서드가 아니다.
//                        // 소괄호가 없음
//    return a % 2==0;
//    return str.length() % 2 == 0 ? true : false; //삼항 연산자

//    System.out.println(10 > 2);//true
//    System.out.println(10 == 2);//false
//    System.out.println(10 % 2 ==0);//true
    //위와 같은 내용으로 연산자의 결과 값으로 참과 거짓으로 출력이 가능
    //따라서 아래처럼 간단하게 표기할 수 있다.
    return str.length() % 2 == 0;

    //return 문 밑에는 더이상 실행되지 않는다.
//    if(str.length() % 2 == 0){
//      //str = "java"
//      return true;
//    }
//    else{
//      return false;
//    }

    }

  }

