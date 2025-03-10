/*
* 조건문 - Switch case break문
* 조건이 범위!!라면 if문 사용이 코딩에 수월
* 조건이 특정값!!!이라면 switch문 사용이 수월
* if문은 switch문으로 변경 가능한데 그 반대는 어려움, 가능한 if사용 추천
* */
public class Switch_1 {
  public static void main(String[] args) {
    int num = 2;

  //조건이 맞은 case부터 아래의 모든 내용 실행
    switch(num){
      case 1://조건이 맞지 않아 출력되지 않음
        System.out.println(1);
        break;
      case 2://조건이 맞는 것부터 아래까지 모두 출력
        System.out.println(2);
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      default :
        System.out.println(4);
        //더이상 나올 값이 없으므로 default 는 브레이크 걸어줄 필요없다.
    }



  }
}
