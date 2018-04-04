package com.codesquad.carracing.app;

import com.codesquad.carracing.ui.*;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        final InputView input = ConsoleCarRacingApp.createInputView();

        input.inputNumberOfCars("자동차 대수는 몇 대 인가요?");
        input.inputNumberOfTries("시도 횟수는 몇 회 인가요?");


//        final Scanner scanner = new Scanner(System.in);
//
//        System.out.println("자동차 대수는 몇 대 인가요?");
//        final String inputNumberOfCar = scanner.nextLine();
//        final int numberOfCar = Integer.parseInt(inputNumberOfCar);
//
//        System.out.println("시도할 회수는 몇 회 인가요?");
//        final String inputNumberOfTries = scanner.nextLine();
//        final int numberOfTries = Integer.parseInt(inputNumberOfTries);
//
//        final Random random = new Random();
//        final RandomGenerator randomGenerator = new BoundedRandomGenerator(10, random);
//        final MoveStrategy strategy = new RandomMoveStrategy(randomGenerator);
//
//        final CarRacing carRacing = new CarRacing(numberOfCar, numberOfTries);
//
//        List<Car> cars;
//
//        for (int i = 0; i < numberOfTries; i++) {
//            cars = carRacing.getCars();
//            ConsoleCarRacingApp.printCars(cars);
//            carRacing.nextTry(strategy);
//        }
    }

    public static InputView createInputView() {
        final Writer writer = new ConsoleWriter();
        final Reader reader = new ConsoleReader();
        return new InputView(writer, reader);
    }

//    private static void printCars(final List<Car> cars) {
//        for (final Car car : cars) {
//            ConsoleCarRacingApp.printDistance(car.getPosition());
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    private static void printDistance(final int position) {
//        for (int i = 0; i <= position; i++) {
//            System.out.print("-");
//        }
//    }
}
