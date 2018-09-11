package io.github.oraindrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    static final int RANDOM_SIZE = 10;
    static final int FORWARD_CONDITION = 4;

    private int size;
    private int time;
    private List<String> carPosition;

    public Racing(int size, int time) {
        this.size = size;
        this.time = time;
    }

    public void run(){
        this.carPosition = new ArrayList<>();
        for(int i = 0; i < this.size; i++){
            String position = this.calculatePosition();
            this.carPosition.add(position);
        }
    }

    public String calculatePosition(){
        Random rnd = new Random();
        String s = "";
        for(int j = 0; j < this.time; j++){
            if(rnd.nextInt(RANDOM_SIZE) >= FORWARD_CONDITION){
                s += "-";
            }
        }
        return s;
    }

    public void printResult(){
        System.out.println("실행 결과");
        for(int i = 0; i < this.carPosition.size(); i++){
            System.out.println(this.carPosition.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeNum = 0;
        int timeNum = 0;
        System.out.println("자동차 대수는 몇 대 인가요?");
        sizeNum = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        timeNum = sc.nextInt();
        Racing race = new Racing(sizeNum, timeNum);
        race.run();
        race.printResult();
    }
}
