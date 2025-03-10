package study;
//대학동창정보
public class UnivFriend extends Friend{
 /* private String name;
  private String tel;*/
  private String major;
  //위의 값을 변경하는 생성자 값 넣고
  public UnivFriend(String name, String tel, String major) {
    //Friend에서 상속은 받았지만 private하게 name 변수를 만들었으므로
    // 좋은 코드가 아니다. -> Friend 클래스에서 초기화 해야된다.
//    this.name = name; 삭제해야함 -프렌드클래스에서 생성자 생성했으므로
//    this.tel = tel; 삭제해야함
    //부모클래스의 생성자 호출 super();
    super(name,tel);
    this.major = major;
  }
  //생성자 출력
  public void showInfo(){
//    System.out.println("이름 : "+ name); 삭제
//    System.out.println("연락처 : "+ tel); 삭제하고
    //부모에게 출력해달라고 하면 된다.
    //부모꺼 출력하려면 메서드의 이름을
    //부모와 같이 showInfo로 오버라이딩 했으므로,
    // super.showInfo();해줘야 부모꺼가 호출됨
    super.showInfo();
    System.out.println("전공: "+ major);
  }




}
