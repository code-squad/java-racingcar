package io.github.oraindrop;

import java.util.*;

public class Racing {
    static final int RANDOM_SIZE = 10;
    private List<Car> cars;

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
        this.makeResultMessage();
    }

    public void run(){
        Random rnd = new Random();
        for(Car car : cars){
            car.decideForward(rnd.nextInt(RANDOM_SIZE));
        }
    }

    public void sortCars(){
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getResult().length() > o2.getResult().length()) return -1;
                if(o1.getResult().length() < o2.getResult().length()) return 1;
                return 0;
            }
        });
    }

    public void judge(List<String> winners, int maxScore, Car car){
        int score = car.getResult().length();
        if(maxScore > score){
           return;
        }
        winners.add(car.getName());
        return;
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
        this.sortCars();
        int maxScore = this.cars.get(0).getResult().length();
        List<String> winnerList = new ArrayList<>();
        for(Car car : cars){
            this.judge(winnerList, maxScore, car);
        }
        String s = String.join(", ", winnerList);
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
