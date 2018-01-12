package racing;

import java.util.List;

public class RaceGame {

    private RaceVO vo;

    public RaceGame() {

    }

    public void initRace() {
        initRace(new String[]{},0);
    }

    public void initRace(String[] names, int moveCount) {
        if (moveCount == 0) {
            InputView inputView = InputView.getByUser();
            names = inputView.getNames();
            moveCount = inputView.getMaxMoveCount();
        }
        vo = new RaceVO(names, moveCount);
    }

    public List<RacingCar> getResult() {
        if (vo == null || vo.getCars() == null || vo.getCars().isEmpty()) throw new RuntimeException("initRace 메소드를 실행 후 진행하세요.");
        OutputView.getInstance().printResult(vo.getCars());
        return vo.getCars();
    }
}