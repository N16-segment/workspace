public class 자료형_3{
  public static void main(String[] args) {
    //형(data type) 변환
    //정수 -> 실수, 실수 -> 정수

    int num1 = 5;

    //자동 형변환(promotion)
    double num2 = num1; //정수는 실수 범위안에 들어가므로 포함을 해준다.
    System.out.println("num2 = " + num2);

    double num3 = 5.9;
    //int num4 = num3; 실수를 더 작은 정수에 넣는 것은 범위가 작으므로 오류
    //강제 형변환(casting) -> 반올림 안되고 무조건 버림 실수를 정수로 억지로 변환가능 앞 ()괄호에 변환할 내용을 넣는다.
    int num4 = (int)num3;
    System.out.println("num4 = " + num4);//5


  }
}

