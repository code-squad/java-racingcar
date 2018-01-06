package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Race {

    private final int MIN_COUNT = 1;
    private final int MAX_COUNT = 100;
    private final int MIN_FORWARD = 4;
    private final int RANDOM_BOUND = 10;

    private int carCount;
    private int maxMoveCount;
    private List<Car> carList;

    public Race() {
    }

    public int getCarCount() {
        return carCount;
    }

    public int getMaxMoveCount() {
        return maxMoveCount;
    }

    public void setCarCount(int count) {
        this.carCount = count;
    }

    public void setMaxMoveCount(int count) {
        this.maxMoveCount = count;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    /**
     * UI 전용.
     */
    @Deprecated
    private void setCountByUser() {
        System.out.println(format("자동차 대수는 몇 대 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        setCarCount(getNumberByUser());

        System.out.println(format("시도할 회수는 몇 회 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        setMaxMoveCount(getNumberByUser());

        System.out.println(format("[안내] 자동차 대수 : %d, 이동 횟수 : %d", getCarCount(), getMaxMoveCount()));
    }

    /**
     * UI 전용.
     */
    @Deprecated
    protected int getNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        while (isOutOfNumber(temp)) {
            System.out.println(format("%d-%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
            temp = scanner.nextLine().trim();
        }
        return Integer.parseInt(temp);
    }

    private boolean isOutOfNumber(String temp) {
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

    public void initRace() {
        setCountByUser();
        enrollRacingCars();
    }

    public void racing() {
        for (Car car : getCarList()) {
            raceACar(car);
        }
    }

    private void raceACar(Car car) {
        for (int i = 0; i < maxMoveCount; i++) {
            if (getRandom() >= MIN_FORWARD) {
                car.move();
            }
        }
    }

    void enrollRacingCars() {
        if (this.carCount == 0) throw new RuntimeException("carCount가 0 입니다. initRace 메소드를 실행 후 진행하세요.");
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < getCarCount(); i++) {
            carList.add(new Car(i));
        }
        setCarList(carList);
    }

    int getRandom() {
        return new Random(System.nanoTime()).nextInt(RANDOM_BOUND);
    }

    public void printResult() {
        if (getCarCount() < MIN_COUNT && getMaxMoveCount() < MIN_COUNT || getCarList() == null || getCarList().isEmpty()) throw new RuntimeException("initRace 메소드를 실행 후 진행하세요.");
        for (Car car : getCarList()) {
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
