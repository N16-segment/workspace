package practice;

//문제 7.
// 문자열 배열을 매개변수로 받아 배열에 저장된 모든 문자열을 나열하여
// 리턴하는 메소드를 만들고 호출해보세요.
// [1,2,3,4,5] 모든 요소의 합이랑 같다.
public class 문제_3_7 {
  public static void main(String[] args) {
    String[] a = {"집에", "가고", "싶다"};
    String t = test7(a);
    System.out.println(t);


  }
  public static String test7(String[] arr){//["aa","bb","cc"] -> "aabbcc"
    String result = "";//sum = sum + i 와 같다고 보면 된다.
    for(int i = 0 ; i < arr.length; i++){
      result = result + arr[i];

//      result = result + "java"; // result += "java" -> "" + "java" => java
//      result = result + "C++";
//      System.out.println(result);// "javaC++"
    }
    return result;
  }
}
