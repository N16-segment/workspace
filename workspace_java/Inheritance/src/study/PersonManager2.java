package study;

public class PersonManager2 {
  public static void main(String[] args) {

    //친구 객체 10개 저장할 수 있는 배열 생성
    Friend[] fs = new Friend[10];
    int cnt = 0;
    //    Friend a = new CompFriend();
    //    Friend b = new UnivFriend();
    //배열하나에 데이터를 다 넣을 수 있다.
    //자료형이 달라도 한번에 넣을 수 있다.
    fs[cnt++] = new UnivFriend("김자바", "010-111", "화학과");
    fs[cnt++] = new CompFriend("김사원", "010-222", "총무부");

    for(int i = 0 ; i < cnt ; i++){
      fs[i].showInfo();

    }
  }
}
