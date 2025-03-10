  /*
  * 자료형(data type)
  * 자바의 자료형음 크게 기본자료형, 참조자료형(전부 대문자로 시작)으로 구분.
  * 기본자료(primivite type)형 8개 존재. 8개 모두 소문자.
  * 참과 거짓 : boolean -<true, false
  * 정수 : byte, short, int, long ->정수 자료형은 int를 기본으로 인식
  * 실수 : float, double -> 실수 자료형은 double을 기본으로 인식
  * 문자 : char
  * 문자열(문자 나열) vs 문자
  * 문자 : 한 글자 + 홀따옴표로 감싸짐 -> ex) '가' / 'java'-> 이런 문자는 없어서 오류발생
  * 문자열 : 여러 글자, !! 쌍따옴표에 싸여진 글자 -> ex) 가방, "가", "java", ""
  * 자바의 기본자료형에는 문자열을 저장할 '기본'자료형을 제공하지 않는다.
  * 문자열 참조자료형 : String -> 앞에 글자 (S)대문자
  * 참조자료형은 무한대.
  * */

  public class 자료형_1 {
    public static void main(String[] args) {
      //참과 거짓
      boolean a = true;
      boolean b = false;
      // boolean c = "true"; 주의!!! 쌍따옴표 없음
      System.out.println(a);

      int d = 1;
      byte e = 1;
      short f = 1;
      long g = 1L;//기본이 int이므로  범위가 더 큰 long이므로 숫자만 작성해도 오류가 나지 않고,
                  // 1L는 long 1로 해석해서 long로 넣기때문에 오류가 나지는 않는다.

      double h = 1.5;
      // float i = 1.5; 자료형은 중복이 안되므로 1.5를 더블로 기본 자료형으로 인식하므로 더블을 플로트에 넣는다고 생각해서 오류가 남
      // float i = 1.5F; 정상, float가 double보다 범위가 작으므로 넣을 수 없어서 뒤에 float->1.5F 대문자를 붙여서 실행하면 출력됨
      System.out.println(h);

      //문자열
      String s = "hello";
      System.out.println(s);

    }

  }
