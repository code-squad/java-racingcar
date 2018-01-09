package racing;

import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Race {

    private final static int MIN_COUNT = 1;
    private final static int MAX_COUNT = 100;
    private final static int MIN_FORWARD_NUMBER = 4;
    private final static int RANDOM_BOUND = 10;

    private RaceVO vo;

    public Race() {
        vo = new RaceVO();
    }

    public void initRace() {
        initRace(0,0);
    }

    public void initRace(int carCount, int moveCount) {
        if (carCount == 0 || moveCount == 0) {
            setCountByUser();
            carCount = vo.getCarCount();
            moveCount = vo.getMaxMoveCount();
        }
        setVOCount(carCount, moveCount);
        vo.enrollCars();
    }

    public void setVOCount(int carCount, int moveCount) {
        vo.setCarCount(carCount);
        vo.setMaxMoveCount(moveCount);
    }

    private void setCountByUser() {
        System.out.println(format("자동차 대수는 몇 대 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        vo.setCarCount(getNumberByUser());

        System.out.println(format("시도할 회수는 몇 회 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        vo.setMaxMoveCount(getNumberByUser());

        System.out.println(format("[안내] 자동차 대수 : %d, 이동 횟수 : %d", vo.getCarCount(), vo.getMaxMoveCount()));
    }

    private int getNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        while (isOutOfNumber(temp)) {
            System.out.println(format("%d-%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
            temp = scanner.nextLine().trim();
        }
        return Integer.parseInt(temp);
    }

    public boolean isOutOfNumber(String temp) {
        return isBlank(temp) ||
                !isNumeric(temp) ||
                isOutOfBound(temp);
    }

    private boolean isBlank(String temp) {
        return temp == null || temp.isEmpty();
    }

    private boolean isNumeric(String temp) {
        return temp.matches("^[0-9]*$");
    }

    private boolean isOutOfBound(String temp) {
        return Integer.parseInt(temp) < MIN_COUNT || Integer.parseInt(temp) > MAX_COUNT;
    }

    public void racing() {
        for (Car car : vo.getCars()) {
            raceACar(car);
        }
    }

    private void raceACar(Car car) {
        for (int i = 0; i < vo.getMaxMoveCount(); i++) {
            if (getRandom() < MIN_FORWARD_NUMBER) continue;
            car.move();
        }
    }

    int getRandom() {
        return new Random(System.nanoTime()).nextInt(RANDOM_BOUND);
    }

    public void printResult() {
        if (vo.getCarCount() < MIN_COUNT && vo.getMaxMoveCount() < MIN_COUNT || vo.getCars() == null || vo.getCars().isEmpty()) throw new RuntimeException("initRace 메소드를 실행 후 진행하세요.");
        for (Car car : vo.getCars()) {
            printCarDistance(car);
        }
    }

    private void printCarDistance(Car car) {
        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}