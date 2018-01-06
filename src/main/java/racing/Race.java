package racing;

import java.util.List;
import java.util.Scanner;

public class Race {

    private static final int MIN_COUNT = 1;
    private static final int MAX_COUNT = 10;

    private int carCount;
    private int moveCount;
    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void setCarCountByUser() {
        carCount = getCount();
    }

    public void setMoveCountByUser() {
        moveCount = getCount();
    }

    public int getCount() {
        Scanner scanner = new Scanner(System.in);
        return getCount(Integer.parseInt(scanner.nextLine()));
    }

    // TODO : null이나 다른 문자가 들어오는 것 처리
    private static int getCount(int count) {
        Scanner scanner = new Scanner(System.in);
        while(count < MIN_COUNT || MAX_COUNT < count) {
            if (count < MIN_COUNT) {
                System.out.println(String.format("%s보다 큰 수를 입력해주세요.",MIN_COUNT));
            }
            if (count > MAX_COUNT) {
                System.out.println(String.format("%s보다 작은 수를 입력해주세요.",MAX_COUNT));
            }
            count = Integer.parseInt(scanner.nextLine());
        }
        return count;
    }

    public int getCarCount() {
        return carCount;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
