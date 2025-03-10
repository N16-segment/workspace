package study;

public class StudentTest {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int[] arr2 = arr1;
    arr2[0] = 5;
    System.out.println(arr1[0]);//5
    System.out.println(arr2[0]);//5

    //String은 한번 값이 들어가면 바뀌지 않는다.
    //객체가 immutable(이뮤터블) 객체이기 때문이다.
    String a = "java";
    String b = a;
    b = "python";
    System.out.println(a);//java
    System.out.println(b);//python

    //String 데이터는 메모리 공간 낭비를 최소화할 수 있도록 설계되어있음
    //실제 데이터를 갖고 있는 주소값이 같다. -> true
    String str1 = "react";
    String str2 = "react";
    str2 = "coffee";
    System.out.println("str1 : " + str1);
    System.out.println("str2 : " + str2);
    //new는 새로운 객체를 만들어 달라는 것이므로 실제 데이터를 담고있는 주소값이 달라진다.
    //두 변수가 갖는 주소값이 달라지므로 같지 않다고 판단한다. -> false
    String str3 = new String("java");//문자열로 초기화된 문자열이 만들어진다. 객체생성
    String str4 = new String("java");

    // == 는 원낼 두 객체가 주소값이 같은지 비교하는 연산
    //숫자 비교 연산에서 사용

    if(str1 == str2){
      System.out.println("str1과 str2는 같습니다.");
    }
    if(str3 == str4){
      System.out.println("str3과 str4는 같습니다.");
    }

    Student s1 = new Student(2, "김자바");
    Student s2 = new Student(2, "박자바");

    //s1객체와 s2객체가 같은 객체니?라고 묻어본다.
    System.out.println(s1.equals(s2));//false 가 출력된다.
    //불린처럼 equals로 참과 거짓으로 물어보는 것으로,
    //나는 모르니까 너가 같은지 다른지 만들어라.

  }
}
