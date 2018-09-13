package racingcar;

import java.util.*;

public class RacingGame {
    static final int MOVE_CAR = 4;
    static final int MAXIMUM_NUM = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        String carNames = scanner.nextLine();
        String[] names = carNames.split(",");
        System.out.println("시도할 횟수는 몇번인가요?");
        int movingCount = scanner.nextInt();
        int[] positionNum;
        // 차들이 각각 움직인 거리 배열
        String[] carsMoving;
        Car[] cars = new Car[names.length];
        // name 값 만큼 차인스턴스를 생성
        carNames(names, cars);
        //렌덤값을 입력받은 배열값
        positionNum = makePositionNum(names.length, movingCount);
        //움직인 거리를 "-"값으로 대입해준다.
        carsMoving = getCarsMoving(positionNum, movingCount);
        // car.position 값을 변경해줌
        changesPosition(cars, carsMoving);
        //output 출력값
        displayCar(cars, carsMoving);
    }

    private static void carNames(String[] names, Car[] cars) {
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
    }

    //cars 와 movingCount를 이용해 1차원 int 배열값을 만든다.
    public static int[] makePositionNum(int namesLength, int movingCount) {
        int[] carArrays = new int[namesLength * movingCount];
        Random random = new Random();
        for (int i = 0; i < namesLength * movingCount; i++) {
            carArrays[i] = random.nextInt(MAXIMUM_NUM);
        }
        return carArrays;
    }

    // car 인스턴스에 이동한만큼 position 을 바꿔준다
    public static void changesPosition(Car[] cars,String[] carsMoving) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].position(carsMoving[i].length());
        }
    }

    // 자동차가 움직인것을 출력해줌, 우승자를 출력해줌
    public static void displayCar(Car[] cars, String[] carsMoving) {
        String[] winners;
        System.out.println("실행 결과");
        for (int i = 0; i < carsMoving.length; i++) {
            System.out.println(cars[i].name() + " : " + carsMoving[i]);
        }
        winners = Car.winnerCar(cars);
        System.out.print("우승자는: " + winners[0]);
        for (int i = 1; i < winners.length; i++) {
            System.out.print(", " + winners[i]);
        }
    }

    //makePositionNum 에서 만든것을 이용해 자동차의 움직인 거리를 "-"를 이용해 자동차에 맞는 배열로만듬
    private static String[] getCarsMoving(int[] positionNum, int movingCount) {
        String movingLine = "";
        for (int i = 0; i < positionNum.length; i++) {
            movingLine += makeLines(positionNum, movingCount, i);
        }
       //System.out.println(movingLine);
        return movingLine.split(",");
    }

    // 상황에 맞게 MOVE_CAR 이상이면 "-"를 return 하는 메소드
    public static String makeLines(int[] carArrays, int movingCount, int i)  {
        String line = "";
        if (i != 0 && i % movingCount == 0) {
            line += ",";
        }
        if (carArrays[i] >= MOVE_CAR) {
            line += "-";
        }
        return line;
    }

}
