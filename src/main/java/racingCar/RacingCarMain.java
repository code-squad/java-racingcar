package racingCar;

public class RacingCarMain {

    /*
    * TODO Step2
       1. winner 로직 새로운 객체 추가 --추가
       2. 사용하지 않는 임포트문 제거 -- 제거
       3. carNumbers 값이 필요한지  --해당변수 제거
       4. List<Car> race() foreach 문으로 적용해본다.  --적용
       5. 자동차 이동유무에 대한 판단을 자동차가 하게구현한다.  --적용 car.move(makeRandomNumber());
       6. List result로 반환하지 말고 게임 결과를 저장하는 GameResult와 같은 객체에 List를 저장해 반환한다.
       winner 구하는 로직도 ResultView가 아니라 GameResult가 담당하도록 구현한다.
       --구현이 제대로 되었는지 모르겠습니다.
   * */

    public static void main(String[] args) {
        InputView inputView = new InputView();
        inputView.setup();

        Racing racingCar = new Racing(inputView.getCarsName(), inputView.getTimes());
        racingCar.race();

        Winner winner = new Winner(racingCar.getGameResult());
        winner.winnerCheck();

        ResultView resultView = new ResultView(racingCar.getGameResult());
        resultView.result(winner.getWinner());
    }
}
