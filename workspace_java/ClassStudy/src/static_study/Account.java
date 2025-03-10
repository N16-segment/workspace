package static_study;

public class Account {
  String owner;
  int money;
  static double iyul;//이율

  static{//일괄적용
    iyul = 5.0;
  }

  public Account(String owner){
     this.owner = owner;
     money = 50000;
     iyul = 5.0;
  }
}
