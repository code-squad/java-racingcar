package racing;

public class RaceGame {

    private RaceVO vo;

    public RaceGame() {

    }

    public void initRace() {
        initRace(0,0);
    }

    public void initRace(int carCount, int moveCount) {
        if (carCount == 0 || moveCount == 0) {
            InputView inputView = InputView.getByUser();
            carCount = inputView.getCarCount();
            moveCount = inputView.getMaxMoveCount();
        }
        vo = new RaceVO(carCount, moveCount);
    }

    public void printResult() {
        if (vo == null || vo.getCars() == null || vo.getCars().isEmpty()) throw new RuntimeException("initRace 메소드를 실행 후 진행하세요.");
        vo.getCars().forEach(RacingCar::printCarDistance);
    }
}