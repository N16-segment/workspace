public class Break_Continue {
  public static void main(String[] args) {
    //반복문에 break, continue 라는 명령어를 사용할 수 있음

    //break
    //break가 실행이 되면 가장 가까운 반복문을 종료(벗어남)
    //반복문을 이중으로 사용할 수도 있으므로 가장 가까운 반복문을 확인할 것
    int i = 1;
    while(i < 6){
      if(i == 3){
        break;
      //조건문 안에서 break 아래에 출력 값을 넣어주면 어짜피 break로 종료되므로 의미가 없어 오류로 판단한다.
      }
      System.out.println(i);//출력 값 : 1 2
      i++;

    }

    System.out.println();
    /// /////////////////////////////////////////////////
    //continue
    //가장 가까운 반복문의 {} 안에서 마지막 다음으로 이동한다.
    int a = 1;
    while(a < 6){
      a++;

      if(a == 3){
        continue;
      }
      System.out.println(a);
    }
      //->출력값 : 2 4 5 6 조건이 맞는 경우 한 번만 빼고 돌아간다.

  }
}
