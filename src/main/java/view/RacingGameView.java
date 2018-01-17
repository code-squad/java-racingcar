package view;

import model.Car;

import java.util.List;

public interface RacingGameView {
    String[] askCarCount();
    int askRacingCount();
    void printCarPositions(List<Car> cars, String[] winners);
    String getPositionString(Car car);
}
