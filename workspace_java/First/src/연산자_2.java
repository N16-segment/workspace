public class 연산자_2 {
  public static void main(String[] args) {
    //증감 연산자(++, --) : 값을 1 증가, 1 감소 시키는 역할

    int a = 5;

    //전위, 후위 증감 연산자를 사용하여 a의 값을 1 증가(동일)
    ++a; // 전위 증감 연산자 a = a + 1;, a += 1;
    a++; // 후위 증감 연산자 a = a + 1;, a += 1;
    System.out.println("a = " + a);

    --a;//한 줄에 단독 사용
    a--;//한 줄에 단독 사용
    System.out.println("a = " + a);

    //전위 증감 연산자와 후위 증감 연산자는
    //단독으로 사용하면 해석에 차이가 없지만
    //단독 사용이 아닐 시 해석 순서가 달라진다.
    //단독 사용 : 한 줄에 증감 연산자만 사용한 경우.
    int num = 5;
    System.out.println(num++);//num을 인식하고 후에 ++ 시킨 값을 갖고 있음, 5
    System.out.println(num);// 위의 연산이 끝난 값을 출력, 6
    System.out.println(++num);// ++ 를 먼저 연산하고 출력, 7
      // 먼저나온 거 우선 처리하는 개념으로 본다.

    System.out.println();

    int x = 10;
    System.out.println("x = " + x);
    int y = x++;// y = 10, x = 11
    System.out.println("x = " + x);
    x = x + 5;// y = 10, x = 16
    System.out.println("x = " + x);
    System.out.println("y = " + y);

  //  int a = 10;
  //  int b = 20;
  //  int z = (++a) + (b--); z=11+20
  //  System.out.println(“a = ” + a + “ b = ” + b + “ z = ” + z); a=11 b=19 z=31


    //증감 연산자를 단독으로 사용하면 어렵지 않다.
    // '='은 대입 연산자
    int value = 10;
    System.out.println(value++);
    System.out.println(value++);
    System.out.println(value++);

    //모든 우선순위에서 '=' 대입 연산자는 항상 가장 마지막이지만 후위 연산자!가 있으면 그보다 앞선다.
    int aa = 4 + 3;//우측을 먼저 계산하고 왼쪽으로 대입(저장)한다.

    //연산자 우선순위
    //'&&' 그리고 연산자가 '||' 이거나 연산자보다 우선순의가 높다.
    //'=' 대입 연산자가 가장 우선순위가 낮다.
    //나머지 헤깔리는 우선순의는 그냥 괄호로 표기하도록 한다.


  }
}
