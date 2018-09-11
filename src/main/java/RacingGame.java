import java.util.*;


public class RacingGame {
    static final int MOVE_CAR = 4;
    static final int MAXIMUM_NUM = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int cars = scanner.nextInt();
        System.out.println("시도할 횟수는 몇번인가요?");
        int movingCount = scanner.nextInt();
        int[] carArrays = makeCarsList(cars, movingCount);
        System.out.println("실행 결과");
        displayCar(carArrays, movingCount);
        // 배열값 확인용
//        System.out.println(Arrays.toString(carArrays));
    }

    //cars 와 movingCount를 곱해서 1차원 배열로만듬
    public static int[] makeCarsList(int cars, int movingCount) {
        int[] carArrays = new int[cars * movingCount];
        Random random = new Random();
        for (int i = 0; i < cars * movingCount; i++) {
            carArrays[i] = random.nextInt(MAXIMUM_NUM);
        }
        return carArrays;
    }

    // 자동차 배열을 하나 읽어 출력
    // intend 를 줄이자.
    public static void displayCar(int[] cars, int movingCount) {
        for (int i = 0; i < cars.length; i++) {
            drawLine(cars, movingCount, i);
        }
        System.out.println("");
    }

    public static void drawLine(int[] cars, int movingCount, int i)  {
        if (i != 0 && i % movingCount == 0) {
            System.out.println("");
        }
        if (cars[i] >= MOVE_CAR) {
            System.out.print("-");
        }
    }
}