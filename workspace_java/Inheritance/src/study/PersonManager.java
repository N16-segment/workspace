package study;

public class PersonManager {
  public static void main(String[] args) {
    //대학동창을 5명 저장할 수 있는 배열 생성
    UnivFriend[] ufs = new UnivFriend[5];
    //대학동창이 저장된 배열의 index 정보
    int ucnt = 0;
    //직장동료를 5명 저장할 수 있는 배열 생성
    CompFriend[] cfs = new CompFriend[5];
    int ccnt =0;

    //대학 동창을 생성
//    UnivFriend f1 = new UnivFriend("김자바", "010-111","화학과");
//    ufa[0] = f1;
//    위처럼 만들면 코드가 길어지므로 한줄로 아래처럼 간소화한다.
    //생성한 대학 동창 객체를 ufs에 저장
    //[ucnt++]증감연산자를 사용해서 우측을 먼저 넣어주고 그다음 죄측 1증가시킨다.
    //일일이 생성자 아래에 ufs++; 넣어줄 필요가 없다.
    ufs[ucnt++] = new UnivFriend("김자바", "010-111", "화학과");
    ufs[ucnt++] = new UnivFriend("이자바", "010-112", "생물학과");

    //직장동료를 생성 + 생성한 직장동료 객체를 cfs에 저장 - 회원을 저장하는 코드
    cfs[ccnt++] = new CompFriend("김사원", "010-222", "영업부");
    cfs[ccnt++] = new CompFriend("박대리님", "010-223", "인사부");

    //저장된 대학동창 정보 출력
    // - ufs.length는 데이터수가 아니고 배열의 수이므로 안된다.
    for(int i = 0 ; i < ucnt ; i++){
      //ufs[i].showUnivInfo();
    }
    //저장된 직장동료 정보 출력
    for(int i = 0 ; i < ccnt ; i++){
      //cfs[i].showCompInfo();
    }


  }
}
