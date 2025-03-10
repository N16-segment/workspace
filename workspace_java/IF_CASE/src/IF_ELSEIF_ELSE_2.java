public class IF_ELSEIF_ELSE_2 {
  public static void main(String[] args) {
    int num = 5;

    if (num >= 5) {
      System.out.println(1);

    }
    else if (num == 5) {
      System.out.println(2);

    }
    else{
      System.out.println(3);

    }
  }
}
//위에서 코드가 맞아버리면 아래는 계산하지 않고 처음 조건이 맞는 값만 출력한다.
//단, if 와 else를 묶어서 쌍으로 사용하는 것이 아닌,
//if를 개별적으로 여러개 사용하면 값은 조건에 맞는대로 모두 출력된다.