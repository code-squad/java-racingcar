package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {
    public static void run(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        Scanner s = new Scanner(System.in);
        int carNum = s.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = s.nextInt();

        int[] carPositions = new int[carNum];

        Random rnd = new Random();

        for(int i = 0; i < carNum; i++){
            carPositions[i] = 0;
            for(int j = 0; j < count; j++){
                int move = rnd.nextInt(10);
                if(move >= 4)
                    carPositions[i] += 1;
            }
        }

        for(int i = 0; i < carNum; i++){
            for(int j = 0; j < carPositions[i]; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        run();
    }
}
