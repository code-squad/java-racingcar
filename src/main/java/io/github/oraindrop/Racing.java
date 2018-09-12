package io.github.oraindrop;

import java.util.*;

public class Racing {
    static final int RANDOM_SIZE = 10;
    private List<Car> cars;
    private List<String> winnerList;

    public void readyRace(String names){
        String[] nameArr = names.split(",");
        this.cars = new ArrayList<>();
        for(int i = 0; i < nameArr.length; i++){
            this.cars.add(new Car(nameArr[i]));
        }
    }

    public void race(int time){
        for(int i = 0; i < time; i++){
            this.run();
        }
    }

    public void run(){
        Random rnd = new Random();
        for(Car car : this.cars){
            car.decideForward(rnd.nextInt(RANDOM_SIZE));
        }
    }

    public void calculateWinner(){
        this.winnerList = new ArrayList<>();
        Collections.sort(this.cars);
        int maxScore = this.cars.get(0).getResult().length();
        for(Car car : this.cars){
            car.decideWinFlag(maxScore);
            this.makeWinnerList(car.isWinFlag(), car.getName());
        }
    }

    public void makeWinnerList(boolean isWin, String name){
        if(isWin){
            this.winnerList.add(name);
        }
    }


    public String makeResultMessage(){
        StringBuilder sb = new StringBuilder();
        sb.append("실행 결과\n");
        for(Car car : cars){
            sb.append(car.getName() + " : " + car.getResult() + "\n");
        }
        return sb.toString();
    }

    public String makeWinnerMessage(){
        StringBuilder sb = new StringBuilder();
        this.calculateWinner();
        String s = String.join(", ", this.winnerList);
        sb.append(s + "가 최종 우승 했습니다.");
        return sb.toString();
    }


    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Racing racing = new Racing();
        String carNames = inputView.inputCarNames();
        int runTime = inputView.inputTime();

        racing.readyRace(carNames);
        racing.race(runTime);
        resultView.print(racing.makeResultMessage(), racing.makeWinnerMessage());
    }
}
