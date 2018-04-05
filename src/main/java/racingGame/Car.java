package racingGame;

import java.util.Random;

public class Car {
    private int position; //차의 현재 위치
    private String name;
    private Random random = new Random();

    public Car(String name) {
        this.position = 0;
        this.name = name;
    }

    public Car(String name, int position) {
        this.position = position;
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() { return name; }

    public int move() {
        return move(makeRandomNumber());
    }

    int move(int randomNumber) { // 랜덤숫자에 따라 전진(4이상이면 전진하고 0반환, 4이하면 전진하지 않고 -1 반환)
        if (randomNumber > 3) {
            this.position++;
            return 0;
        }
        return -1;
    }

    private int makeRandomNumber() { //랜덤숫자생성 0~9
        return random.nextInt(10);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (position != car.position) return false;
        return name.equals(car.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
