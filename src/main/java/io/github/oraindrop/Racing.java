package io.github.oraindrop;

import java.util.*;

public class Racing {
    static final int RANDOM_SIZE = 10;
    private List<Car> cars;

    public void readyRace(String inputCarNames){
        String[] carNames = inputCarNames.split(",");
        this.cars = new ArrayList<>();
        for(String carName : carNames){
            this.cars.add(new Car(carName));
        }
    }

    public void race(int runTime){
        for(int i = 0; i < runTime; i++){
            this.run();
        }
        this.finishRace();
    }

    public void run(){
        Random rnd = new Random();
        for(Car car : this.cars){
            car.decideForward(rnd.nextInt(RANDOM_SIZE));
        }
    }

    public void finishRace(){
        ResultView.printResultMessage(this.cars);
        ResultView.printWinnerMessage(this.pickWinner());
    }

    public List<String> pickWinner() {
        List<String> winners = new ArrayList<>();
        Collections.sort(this.cars);
        int maxScore = this.cars.get(0).getScore();
        int len = this.cars.size();
        for (int i = 0; i < len && maxScore == this.cars.get(i).getScore(); i++) {
            winners.add(this.cars.get(i).getName());
        }
        return winners;
    }

    public static void main(String[] args) {
        Racing racing = new Racing();
        String inputCarNames = InputView.inputCarNames();
        int inputRunTime = InputView.inputRunTime();

        racing.readyRace(inputCarNames);
        racing.race(inputRunTime);
    }
}
