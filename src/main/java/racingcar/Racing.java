package racingcar;

public class Racing {

    private CarsInfo carsInfo;

    public Racing(String[] carNames) {
        carsInfo = CarsInfo.makeRacingCarInfo(carNames);
    }

    public void carPositionMove() {
        carsInfo.moveRacingCars();
    }

    public String returnRacingWinningResult() {
        return returnRacingWinningResult(carsInfo.searchWinningPosition());
    }

    private String returnRacingWinningResult(int winningPosition) {
        return String.join(", ", carsInfo.makeWinnerNames(winningPosition));
    }

    public int getCarsInfoSize() {
        return carsInfo.getCarsInfoSize();
    }

    public String findCarNameByIndex(int index) {
        return carsInfo.findCarByIndex(index).getCarName();
    }

    public int findCarMoveByIndex(int index) {
        return carsInfo.findCarByIndex(index).getMove();
    }

}