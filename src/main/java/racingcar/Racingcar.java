package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Racingcar {
    static Scanner sc = new Scanner(System.in);
    static final int RESTRICTNUM = 4;
    static final int RANGE =10;

    //자동차 대수 입력 받기
    public static int getCarNum() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carNum = sc.nextInt();
        return carNum;
    }

    //시도 회수 입력 받기
    public static int getTryNum() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryNum = sc.nextInt();
        sc.close();
        return tryNum;
    }

    //랜덤값 받기
    public static int getRandNum() {
        Random random = new Random();
        int randNum = random.nextInt(RANGE);
        return randNum;
    }

    //이동 거리 측정
    public static String countMove(String distance) {
        if (getRandNum() >= RESTRICTNUM) {
            distance += "-";
        }
        return distance;
    }

    //자동차 1대 이동하기
    public static void moveOneCar(List<String> result, int tryNum) {
        String distance = "";
        for (int i = 0; i < tryNum; i++) {
            distance = countMove(distance);
        }
        result.add(distance);
    }

    //경주하기
    public static List<String> run(int carNum, int tryNum) {
        List<String> result = new ArrayList();
        for (int i = 0; i < carNum; i++) {
            moveOneCar(result, tryNum);
        }
        return result;
    }

    //결과화면 출력
    public static void printResult(List<String> result) {
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList();
        int carNum = getCarNum();
        int tryNum = getTryNum();
        result = run(carNum, tryNum);
        printResult(result);
    }
}