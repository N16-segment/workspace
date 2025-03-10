//간단한 로또 번호 생성 프로그램을 만들어 보자.
//이를 위해 정수 6개를 저장할 수 있는 배열을 만들어,
//배열 요소에 1~46 사이의 난수를 저장한다.
//단, 중복 값은 허용하며 46은 포함하지 않는다.
//배열에 난수를 저장한 후 배열의 모든 요소의 값을 출력하세요.
public class Test2 {
    public static void main(String[] args) {
        //로또배열 생성
        int[] lottonums = new int[6];

        //1부터 45까지 랜덤 정수 저장
        for(int i = 0; i<lottonums.length; i++){
            lottonums[i] = (int)(Math.random() * 45 + 1);
        }
        System.out.println("로또번호 출력 :");

        //배열의 모든 요소 출력
        for(int i = 0; i<lottonums.length; i++){
            System.out.print(lottonums[i] + " " );
        }


    }
}
