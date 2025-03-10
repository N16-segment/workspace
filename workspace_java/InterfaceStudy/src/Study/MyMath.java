package Study;

import com.sun.source.tree.ReturnTree;

public class MyMath implements MathUtil{

  @Override
  //매개변수로 전달된 세 정수의 합이 짝수이면서, 동시에
  //그 합이 5의 배수일 경우에만 true를 리턴.
  public boolean isEven(int a, int b, int c) {
    int sum = a + b + c;
    //return sum % 2 == 0 && sum % 5 == 0 ? true : false;
    //참이면 바로 true가 리턴된다.
    return sum % 2 == 0 && sum % 5 == 0;
  }

  @Override
  //1부터 매개변수로 받은 정수까지의 합을 리턴
  public double getSumFromOne(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
     // sum = sum + i;
      sum += i;
    }

    return sum;
  }

  @Override
  public double getCircleArea(int rad) {
  //    if (rad < 0) {
  //      return 0;
  //    }
  //    return 3.14 * rad * rad;

    //변하지 않는 상수는 대문자로 표시한다.
    return rad < 0 ? 0 : Math.PI * rad * rad;
  }

}
