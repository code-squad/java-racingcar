package racingcar;

import java.util.*;

public class RacingCar {
    static Scanner sc = new Scanner(System.in);
    static final int RESTRICTNUM = 4;
    static final int RANGE = 10;
    static String winner = "";

    //랜덤값 받기
    public static int getRandNum() {
        Random random = new Random();
        return random.nextInt(RANGE);
    }

    //이동 거리 측정
    public static int countMove(int distance) {
        if (getRandNum() >= RESTRICTNUM) {
            distance++;
        }
        return distance;
    }

    //자동차 1대 이동하기
    public static int moveOneCar(int tryNum) {
        int distance = 0;
        for (int i = 0; i < tryNum; i++) {
            distance = countMove(distance);
        }
        return distance;
    }

    //경주하기
    public static void run(List<Car> cars, int tryNum) {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setPosition(moveOneCar(tryNum));
        }
    }

    //우승자 찾기
    public static void findWinner(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            findFirstWinner(cars, i);
        }
        for (int i = 0; i < cars.size(); i++) {
            findRemainWinner(cars, i);
        }
    }

    //우승한 자동차 중 첫번째 자동차 찾기
    public static void findFirstWinner(List<Car> cars, int i) {
        if (findMaxCarDist(cars) == cars.get(i).getPosition() && winner.length() == 0) {
            winner += cars.get(i).getName();
        }
    }

    //우승한 자동차 중 나머지 자동차 찾기
    public static void findRemainWinner(List<Car> cars, int i) {
        if (findMaxCarDist(cars) == cars.get(i).getPosition() && !cars.get(i).getName().equals(winner)) {
            winner += (", " + cars.get(i).getName());
        }
    }

    //경주한 자동차 중 최대 거리값 찾기
    public static int findMaxCarDist(List<Car> cars) {
        List<Integer> countDist = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            countDist.add(cars.get(i).getPosition());
        }
        return Collections.max(countDist);
    }

    public static void main(String[] args) {
        Car car = new Car();
        InputView input = new InputView();
        ResultView result = new ResultView();

        List<Car> cars = new ArrayList<>();
        String[] names = input.inputName();

        cars = car.createCars(names.length);    //자동차 객체리스트 생성
        car.initCarName(cars, names);           //각 자동차 객체별 이름 초기화

        int tryNum = input.getTryNum();
        sc.close();

        run(cars, tryNum);                      //경주 시작
        findWinner(cars);                       //우승자 찾기
        result.printResult(cars);               //결과 출력
    }
}