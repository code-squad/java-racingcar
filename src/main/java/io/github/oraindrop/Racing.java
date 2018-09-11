package io.github.oraindrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    public static void main(String[] args) {
        Racing race = new Racing();
        List<String> carPosition = new ArrayList<>();
        List<Integer> inputList = new ArrayList<>();

        inputList = race.inputSizeTime();
        carPosition = race.run(inputList.get(0), inputList.get(1));
        race.printResult(carPosition);
    }

    public List<String> run(int size, int time){
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            String s = "";
            for(int j = 0; j < time; j++){
                if(rnd.nextInt(10) >= 4){
                    s += "-";
                }
            }
            list.add(s);
        }
        return list;
    }

    public List<Integer> inputSizeTime(){
        List<Integer> inputResult = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        inputResult.add(sc.nextInt());

        System.out.println("시도할 회수는 몇 회 인가요?");
        inputResult.add(sc.nextInt());

        sc.close();
        return inputResult;
    }

    public void printResult(List<String> output){
        System.out.println("실행 결과");
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
    }
}
