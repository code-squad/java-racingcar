package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private final static int MIN_NUM = 4;
    private List<Car> racingCars;
    private Random random;

    private int size;
    private int trials;

    public RacingGame(){
        this(5,5);
    }

    public RacingGame(int size, int trials){
        this.size = size;
        this.trials = trials;
        this.racingCars = new ArrayList<>(size);
        this.random = new Random();
    }

    public void startRacing(){
        if(size < 2 || trials < 2){
            throw new IllegalArgumentException("size가 2 이상이며 trial 횟가 2회 이상 필요함");
        }

        for(int i = 0; i < this.size; i++){
            this.racingCars.add(new Car());
        }

        for(int i = 0; i < this.trials; i++){
            goStopAll();

            this.racingCars.forEach(System.out::println);

            System.out.println();
            System.out.println();
        }

    }

    private void goStopAll() {
        this.racingCars.forEach( car ->
            goStop(car, random.nextInt())
        );
    }

    public void goStop(Car car, int num){
        if(num % 10 > MIN_NUM){
            car.go();
        }
    }


}
