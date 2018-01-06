package game;

import car.Car;
import java.util.Random;
import java.util.Scanner;

public class RacingGame {

  private int times;
  private Car[] cars;
  private int[] carPositions;

  public RacingGame(int size, int times) {
    cars = new Car[size];
    carPositions = new int[size];
    for (int i = 0; i < size; i++) {
      cars[i] = new Car();
      carPositions[i] = 0;
    }
    this.times = times;
  }

  public int[] move() {
    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < times; j++) {
        cars[i].move(generateRandomIntValue());
      }
      carPositions[i] = cars[i].getPosition();
    }
    return carPositions;
  }

  public static int generateRandomIntValue() {
    return new Random().nextInt(10);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("자동차 대수는 몇대 인가요? ");
    int cars = scanner.nextInt();
    System.out.print("시도할 회수는 몇 회 인가요? ");
    int times = scanner.nextInt();

    RacingGame racingGame = new RacingGame(cars, times);
    racingGame.move();
    racingGame.print();
  }

  private void print() {
    System.out.println(ResultView.drawView(carPositions));
  }
}

/*
  초간단 자동차 경주 게임을 구현한다.
  주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
  사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
  전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
  자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
 */