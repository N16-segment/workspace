public class Switch_2 {
  public static void main(String[] args) {

    String a = "자바"; //문자열은 반드시 쌍따옴표에 넣어준다

    switch(a){
      case "남" :
        System.out.println("남성입니다.");
        break;
      case "여" :
        System.out.println("여성입니다.");
        break;
      default:
        System.out.println("잘못된 문자열입니다.");
    }
  }
}
