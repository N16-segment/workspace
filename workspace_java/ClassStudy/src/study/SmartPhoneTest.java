package study;

//클래스 자료형을 배열로 활용하기
public class SmartPhoneTest {
  public static void main(String[] args) {
    //스마트폰 5개를 저장할 수 있는 배열 phones를 생성
    //자료형[] 배열명 = new 자료형[개수];
    SmartPhone[] phoneArr = new SmartPhone[5];//참조자료형은 모두 null로 초기화

    //스마트폰 객체 생성
    SmartPhone p1 = new SmartPhone("s1", 10000, 12.0);
    SmartPhone p2 = new SmartPhone("s2", 20000, 12.5);
    SmartPhone p3 = new SmartPhone("s3", 30000, 13.0);
    SmartPhone p4 = new SmartPhone("s4", 40000, 13.5);
    SmartPhone p5 = new SmartPhone("s5", 50000, 14.0);
    //폰 객체를 배열에 저장
    phoneArr[0] = p1;
    phoneArr[1] = p2;
    phoneArr[2] = p3;
    phoneArr[3] = p4;
    phoneArr[4] = p5;

    //phoneArr 배열에 저장된 모든 폰의 모델명, 가격, 크기를 출력
//    for(int i = 0 ; i < phoneArr.length; i++){
//      phoneArr[i].printInfo();
//    }

    //phoneArr 배열에서 0번째에 저장된 폰의 가격 출력
    //System.out.println(phoneArr[0].getPrice());

    //phoneArr 배열에서 크기가 13inch 이상인 폰의 모델명을 모두 출력
    //for문
    for(int i = 0; i < phoneArr.length; i++){
      if(phoneArr[i].getInch()>13){
        System.out.println(phoneArr[i].getModelName());

      }
    }

    //for-each문
    for(SmartPhone e : phoneArr){
      if(e.getInch()>13){
        System.out.print(e.getModelName() + " ");
    }
  }


//      int[] a = {1,2,3};
//      for(int e : a){//왼쪽은 저장할 변수 : 반족을 돌리고자 하는 데이터 변수
//        System.out.println(e + " ");
//      }
//      String [] b = {"a", "b", "c"};
//      for(String e : b){
//        System.out.println(e + " ");
//      }
//      double[] c = {1.1, 2.2, 3.3};
//      for(double e : c){
//      }

    }

  }


