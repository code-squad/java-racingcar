package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    /*
    기능 요구사항

    초간단 자동차 경주 게임을 구현한다.
    주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다. -> 한칸만 움직인다
    자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
     */

    private final int time;
    private final List<Integer> carPositions;

    private final int MAX_RANDOM_VALUE = 10;
    private final int MOVE_CONDITION = 4;
    private final int MOVE_FORWARD = 1;

    public RacingGame(int time, int carCount) {
        this.time = time;
        this.carPositions = initCarPositions(carCount);
    }

    List<Integer> initCarPositions(int carCount) {
        List<Integer> carPositions = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            carPositions.add(0);
        }
        return carPositions;
    }

    public void start() {
        System.out.println("\n실행 결과");
        play();
    }

    private void play() {
        for (int i = 0; i < time; i++) {
            round();
            print();
        }
    }

    private void round() {
        final Random random = new Random();
        final int carCount = carPositions.size();

        for (int position = 0; position < carCount; position++) {
            move(position, random.nextInt(MAX_RANDOM_VALUE));
        }
    }

    List<Integer> move(int position, int randomValue) {
        if(MOVE_CONDITION <= randomValue && randomValue < MAX_RANDOM_VALUE) {
            carPositions.set(position, carPositions.get(position) + MOVE_FORWARD);
        }
        return carPositions;
    }

    String draw() {
        String result = "";
        for (int i = 0; i < carPositions.size(); i++) {
            for (int j = 0; j <= carPositions.get(i); j++) {
                result = result + "-";
            }
            result = result + "\n";
        }

        return result;
    }

    private void print() {
        System.out.println(draw());
    }
}
