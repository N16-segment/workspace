package study;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "simple";//s1 은 객체명이다.
    String s2 = "java";
    //concat() : 두 문자열을 나열한 결과를 리턴
    String s3 = s1.concat(s2);
    System.out.println(s3);
    //length() : 문자열의 길이를 정수로 리턴
    int len = s3.length();
    //String.valueOf() : 매개변수로 전달된 데이터를 문자열로 바꿔서 리턴
    String result = String.valueOf(10.5);

    String data = "hi java";
    //substring() : 일부 문자열을 추출할 때 사용
    //인덱스가 1인 부분부터 문자가 출력된다. 즉 자르기 시작하는 인덱스 번소첫글자는 0번째
    String r1 = data.substring(1);
    System.out.println(r1);//i java
    //앞에 있는 1은 1부터지만 뒤에 있는 4는 4번 전까지를 말한다. 4번은 불포함
    String r2 = data.substring(1,4);
    System.out.println(r2);//i j

    String data2 = "a,b,c";
    //split() : 매개변수로 전달된 문자열을 기준으로 문자열을 조각애소
    //조각낸 데이터를 리턴
    String[] r3 = data2.split(",");//쉼표기준 자르면 문자가 3개가 나오므로 리턴타입은 배열이 된다.
    System.out.println(r3[0]);//0번째 출력 -> a

    String r4 = data2.replace(",","-");//매개변수에서 쉼표를 찾아서 -로 바꾸어 넣는다.
    System.out.println(r4);//a-b-c

  }
}
