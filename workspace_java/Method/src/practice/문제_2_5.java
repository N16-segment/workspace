package practice;

//문제 5.
// 임의의 정수를 매개변수로 받아,
// 만약 매개변수로 받은 정수가 90 이상이면 ‘A’, 70 이상이면 ‘B’,
// 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요
public class 문제_2_5 {
  public static void main(String[] args) {
    String a = aaa(10);
    System.out.println(a);

  }
  public static String aaa(int num){
    String result = "";
    if(num > 90){
      result = "A";
    }
    else if(num > 70){
      result ="B";
    }
    else{
      result ="C";
    }
    return result;

  }
}
