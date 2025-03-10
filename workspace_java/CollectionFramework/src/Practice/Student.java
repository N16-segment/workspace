package Practice;

//문제 9.
//Student는 학생에 대한 정보가 들어있는 클래스이다.
//해당 클래스는 학생이름, 국어점수, 영어점수, 총점 데이터를 가지고 있다.
// 각 필드를 선언하고 setter와 getter를 만들어보자.
// 추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성한다.
// TestStudent 라는 클래스를 만들어, 위에서 만든 Student클래스의 객체가 저장되는 리스트를 만들어
// 3명의 학생 정보를 추가한 다음, 아래 문제를 풀어보세요
//1) 리스트에 저장된 모든 정보를 출력해보세요.
// 2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
// 3) 모든 학생에 대한 평균 점수를 출력하세요.
// 4) 총점이 1등인 학생의 모든 정보를 출력해보세요
public class Student {
  //학생이름, 국어점수, 영어점수, 총점 데이터
  private String name;
  private int korScore;
  private int engScore;
  private int sum;

  //각 필드를 선언하고 setter와 getter를 만들어보자.
  public Student(String name, int korScore, int engScore) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
    this.sum = korScore + engScore;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKorScore() {
    return korScore;
  }

  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }
  //추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성


  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korScore=" + korScore +
            ", engScore=" + engScore +
            ", sum=" + sum +
            '}';
  }
}
