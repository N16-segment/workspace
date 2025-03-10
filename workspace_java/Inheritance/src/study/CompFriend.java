package study;
//직장동료
public class CompFriend extends Friend {
//  private String name;
//  private String tel;
  private String dept;
  //위의 값을 변경하는 생성자 값 넣고
  public CompFriend(String name, String tel, String dept) {
//    this.name = name; 삭제
//    this.tel = tel; 삭제
    super(name, tel);
    this.dept = dept;
  }
  //생성자 출력
  public void showInfo(){
//    System.out.println("이름 : "+ name); 삭제,
//    System.out.println("연락처 : "+ tel); 삭제하고,
    //부모에게 출력해달라고 한다.
    super.showInfo();
    System.out.println("부서: "+ dept);
  }




}
