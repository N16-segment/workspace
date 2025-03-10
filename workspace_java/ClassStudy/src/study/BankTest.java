package study;

public class BankTest {
  public BankTest() {
  }

  public static void main(String[] args) {
    //Bank 클래스에 대한 객체를 5개 저장할 수 있는 배열 bankArr을 생성
    //Bank 클래스에 대한 객체 5개를 만든 코드다? x
    //Bank 클래스에 대한 객체 5개를 저장할 수 있는 공간을 5개 생성? o
    Bank[] bankArr = new Bank[5];

    //Bank 클래스에 대한 객체를 5개 생성, 초기값만 마음대로.
    //그 다음 bankArr에 객첼르 저장
    bankArr[0] = new Bank("김자박", 10000, "111-222");
//    bankArr[0] = b1;
//    bankArr[0] = new Bank("김자박", 10000, "111-222");//뱅크 클래스 = 객체

    bankArr[1] = new Bank("박자박", 20000, "112-223");
    bankArr[2] = new Bank("최자박", 30000, "113-224");
    bankArr[3] = new Bank("감자박", 40000, "114-225");
    bankArr[4] = new Bank("송자박", 50000, "115-226");

    //bankArr 배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum1 = 0;
    for(int i = 0 ; i < bankArr.length; i++){
      sum1 = sum1 + bankArr[i].getBalance();
      System.out.println("sum1 = " + sum1);
    }

    System.out.println();

    //for-each문
    int sum2 = 0;
    for(Bank bank : bankArr){//bankArr에는 Bank들이 하나씩 들어가 있다. 하나씩 뺴서 bank라고 하겠다.
      sum2 = sum2 + bank.getBalance();
      System.out.println("sum2 = " + sum2);
    }

    /// /////////////////////////////////////
    //2. bankArr에 저장된 모든 계좌정보 중에서
    //계좌주가 "최자박"인 계좌정보를 찾고, 그 정보 중
    //예금액을 20%로 인상 시키는 코드를 작성!

    for(int i = 0 ; i < bankArr.length; i++){
      if(bankArr[i].getOwner().equals("최자박"));
      //20%인상
      int result = (int)(bankArr[i].getBalance() * 1.2);
      bankArr[i].setBalance(result);

    }
    //for-each
    for(Bank e : bankArr){
      if(e.getOwner().equals("최자바")){
        int result = (int)(e.getBalance() * 1.2);
        e.setBalance(result);

      }
    }

  }
}
