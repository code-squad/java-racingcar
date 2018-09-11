package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {

    static int[] carPositions;
    static int condition = 4;
    static int bound = 10;

    public static int getVehicles (Scanner scanner) {
        System.out.println("자동차 대 수는 몇 대 인가요?");
        // int getVehicles로 변수명을 통일하는게 좋을 지 궁금합니다.
        int numberOfVehicles = scanner.nextInt();
        return numberOfVehicles;
    }

    public static int getTrials (Scanner scanner) {
        System.out.println("시도 할 회수는 몇 회 인가요?");
        int numberOfTrials = scanner.nextInt();
        return numberOfTrials;
    }

    public static int[] setCarpositions (int vehicles) {
            carPositions = new int [vehicles];
            return carPositions;
    }

    public static void run (Random random, int vehicles, int trials) {
        for (int i = 0; i < trials; i++) {
            runByVehicles(random, vehicles);
        }
    }

    public static void runByVehicles (Random random, int vehicles) {
        for (int i = 0; i < vehicles; i++) {
            runByCondition(random, i);
        }
    }

    public static void runByCondition (Random random, int i) {
        //원래 범위와 조건 각각 10, 4로 넣었는데 강의시간에 하드코딩X의 케이스를 참고해서 바꿔봤습니다.
        if (random.nextInt(bound) >= condition) {
            carPositions[i]++;
        }
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0",str);
    }

    public static void print (int vehicles) {
        System.out.println("실행 결과");
        for (int i = 0; i < vehicles; i++) {
            String result = repeat("-", carPositions[i]);
            System.out.println(result);
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vehicles = getVehicles(scanner);
        int trials = getTrials(scanner);

        setCarpositions(vehicles);
        run(random, vehicles, trials);
        print(vehicles);
    }
}