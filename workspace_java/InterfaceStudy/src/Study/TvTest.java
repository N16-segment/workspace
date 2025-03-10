package Study;

//국제 tv 연합 기구
public class TvTest {
  public static void main(String[] args) {
    Tv tv = new LgTv();
    tv.turnOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.turnOff();

    SamsungTv[] a = new SamsungTv[3];
    a[0] = new SamsungTv();
    //a[1] = new LgTv(); 이렇게는 적용되지 않는다.
    Tv[] b = new Tv[3];
    b[0] = new SamsungTv();
    b[1] = new LgTv();

  }
}
