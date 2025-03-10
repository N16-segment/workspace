package study;
//대학동창과 직장동료의 같은 부모 친구 클래스를 생성
//중복으로 나오는 변수를 자식 클래스에서 줄일 수 있다.

public class Friend {
  private String name;
  private String tel;

  public Friend(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public void showInfo(){
    System.out.println("이름 : " + name);
    System.out.println("연락처 : " + tel);

  }


}

