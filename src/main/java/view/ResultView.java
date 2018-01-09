package view;

import car.Car;
import racing.GameResult;

public class ResultView {
    private GameResult gameResult;

    public ResultView(GameResult gameResult) {
        this.gameResult = gameResult;
    }

    public void showResult() {
        System.out.println("실행 결과");
        for(Car car : gameResult.getCars())
            System.out.println(car);
    }

    public void showWinner() {
        System.out.println(String.join(", ", gameResult.getWinners()) + "가 최종 우승했습니다.");
    }

/*    public void showWinner() {
        Collections.sort(carList);
        List<String> winnerList = new ArrayList<>();
        Queue<Car> rankQueue = new LinkedList<>();
        rankQueue.addAll(carList);

        int winnersPosition = rankQueue.peek().getCurrentPosition();
        while(!rankQueue.isEmpty() && rankQueue.peek().getCurrentPosition() == winnersPosition) {
            winnerList.add(rankQueue.poll().getName());
        }

        System.out.println(String.join(", ", winnerList) + "가 최종 우승했습니다.");
    }*/
}
