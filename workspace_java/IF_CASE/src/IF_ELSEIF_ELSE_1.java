public class IF_ELSEIF_ELSE_1 {
  public static void main(String[] args) {
    //조건이 3개 이상일 때 사용

    //정수가 짝수면 1출려, 홀수면 2출력, 0이면 3출력
    int num = 5;

    //만약에 ~~라면,...
    if(num % 2 ==0){
      System.out.println(1);
    }
    //그렇지 않고 만약에 ~~라면,...
    //else if 구문은 필요 시 여러개 사용 가능
    else if(num % 2 ==1){
      System.out.println(2);
    }
    else{
      System.out.println(3);
    }


  }
}
