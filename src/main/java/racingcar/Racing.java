package racingcar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Racing {
    private int time;
    private int carNum;
    private ArrayList<Integer> carPositions = new ArrayList<>();

    public void init() {
        for (int i = 0; i < carNum; i++) {
            carPositions.add(1);
        }
    }

    public void run() {
        Random random = new Random();

        for(int i = 0; i < time; i++){
            for(int j = 0; j < carNum; j++){
                int posAdder = random.nextInt(10);
                if(posAdder >= 4){
                    carPositions.set(j, carPositions.get(j) + 1);
                }
            }
        }
    }

    public void print(){
        System.out.println("실행 결과");
        for(int i = 0; i < carPositions.size(); i++){
            for(int j = 0; j < carPositions.get(i); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Racing racing = new Racing();
        System.out.println("자동차 대수는 몇 대 인가요? ");
        racing.carNum = scan.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        racing.time = scan.nextInt();

        racing.init();
        racing.run();
        racing.print();
    }
}
