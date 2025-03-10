package practice;
//12. 6번 문제
public class Rectangle {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  //defalt 생성자
  public Rectangle() {
  }
  //x1, y1, x2, y2 값을 설정하는 생성자
  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //x1, y1, x2, y2 의 좌표 설정
  public void set(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //사각형의 넓이 리턴 : 가로 * 세로
  public int square() {
    return (x2 - x1) * (y2 - y1);
  }

  //좌표의 넓이 등 직사각형 정보의 화면 출력
  //ex) 좌표 : (1, 3), (2, 5), 넓이 : 2
  public void show() {
    System.out.println("좌표 : (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), 넓이 : " + square());
  }
  //인자(매게변수에 실제 전달되는 값)로 전달된 객체 r 과 현 객체가 동일한 넓이면(직사각형이면) true 리턴
  public boolean equals(Rectangle r){//Rectangle클래스에 인자가 들어왔다고 보면 됨
    if(square() == r.square()){
      return true;
    }
    else{
      return false;
    }

  }

}

