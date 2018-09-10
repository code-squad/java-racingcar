package racingcar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대 수는 몇대인가요?");
        int carNum = sc.nextInt();
        System.out.println("시도할 횟 수는 몇번인가요?");
        int time = sc.nextInt();
        sc.close();

        Racing race = new Racing(time, carNum);
        race.run();

    }
}
