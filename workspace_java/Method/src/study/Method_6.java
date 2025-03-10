package study;

public class Method_6 {
  public static void main(String[] args) {
    String a = ccc(6);
    System.out.println(a);
  //ccc(6);
  //System.out.println(ccc(6));
  }
  //매개변수로 정수 하나를 전달받아,
  //전달받은 정수가 짝수라면 "짝수"라는 문자열을 리턴,
  //홀수라면 "홀수"란느 문자열을 리턴

  public static String ccc(int num){
    String result = "";

    if (num % 2 ==0) {
      result = "짝수";
    }
    else {
      result = "홀수";
    }
    return result; //결과를 돌려주겠다는 마무리 멘트이기때문에 리턴 뒤에는 다른 코드 못옴

  }

}
