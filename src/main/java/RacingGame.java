import java.util.*;


public class RacingGame {
    static int moveCar = 4;
    static int maximumNum = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int cars = scanner.nextInt();
        System.out.println("시도할 횟수는 몇번인가요?");
        int movingCount = scanner.nextInt();
        int[][] carArrays = makeCarsList(cars, movingCount);

        //
        System.out.println("실행 결과");

        for (int i = 0; i < cars; i++) {
            displayCar(carArrays[i], movingCount);
        }

        // 배열값 확인용
/*        for (int i = 0; i < cars; i++) {
            System.out.println(Arrays.toString(carArrays[i]));
        }*/

    }

    //차들의 움직임 숫자를 이중배열로 생성
    public static int[][] makeCarsList(int cars, int movingCount) {
        int[][] carArrays = new int[cars][movingCount];
        Random random = new Random();
        for (int i = 0; i < cars; i++) {
            for (int j = 0; j < movingCount; j++) {
                carArrays[i][j] = random.nextInt(maximumNum);
            }
        }
        return carArrays;
    }

    // 자동차 배열을 하나 읽어 출력
    public static void displayCar(int[] cars, int count) {
        for (int i = 0; i < count; i++) {
            if (cars[i] >= moveCar) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }

}