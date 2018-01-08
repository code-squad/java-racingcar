package racing.game;

import racing.car.CarList;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class RacingGame {

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.startGame();
    }

    public void startGame() {
        //사용자에게 게임에 필요한 값 입력받기
        InputView inputView = new InputView();
        inputView.inputFromUser();
        int numberOfCar = inputView.getNumberOfCar();
        int numOfMove = inputView.getNumberOfMove();

        //입력받은 수만큼 자동차 생성
        CarList carList = new CarList(numberOfCar);
        //모든 자동차에게 이동 명령
        playRacing(carList, numOfMove);
        //자동차의 위치 출력
        ResultView resultView = new ResultView(carList);
        resultView.printResult();
    }

    private void playRacing(CarList carList, int numOfMove) {
        for (int i = 0; i < numOfMove; i++) {
            carList.moveAll();
        }
    }

}
