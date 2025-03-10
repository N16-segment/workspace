import java.util.Scanner;
//세 정수를 Scanner로 입력받아
//큰 수부터 나열하여 출력하는 프로그램을 작성하시오.
//단 입력받는 세 수는 중복 값이 없다고 가정한다.
public class Test1 {
    public static void main(String[] args) {
        //세 정수입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수입력 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수입력 : ");
        int b = sc.nextInt();
        System.out.print("세번째 정수입력 : ");
        int c = sc.nextInt();

        //큰 수부터 나열
        if(a>b && a>c){
            if(b>c){//a>b>c
                System.out.println("["+a+" "+b+" "+c+"]");
            }
            else{//a>c>b
                System.out.println("["+a+" "+c+" "+b+"]");
            }
        }
        else if (b>a && b>c) {
            if(a>c){//b>a>c
                System.out.println("["+b+" "+a+" "+c+"]");
            }
            else{//b>c>a
                System.out.println("["+b+" "+c+" "+a+"]");
            }
        }
        else{
            if(a>b){//c>a>b
                System.out.println("["+c+" "+a+" "+b+"]");
            }
            else{//c>b>a
                System.out.println("["+c+" "+b+" "+a+"]");
            }
        }


    }
}
