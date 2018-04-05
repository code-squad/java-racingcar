package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private final static int MIN_NUM = 4;
    private List<Car> racingCars;
    private Random random;
    private int size;

    public RacingGame(){
        this(5);
    }

    public RacingGame(int size){
        this.size = size;
        this.racingCars = new ArrayList<>(size);
        this.random = new Random();
    }

    private void createCars() {
        for(int i = 0; i < this.size; i++){
            this.racingCars.add(new Car());
        }
    }

    public void readyRacing(){
        checkMinSize();
        createCars();
    }

    private void checkMinSize() {
        if(size < 2 ){
            throw new IllegalArgumentException("size가 2 이상 필요함");
        }
    }

    public List<Car> moveAll() {
        this.racingCars.forEach( car ->
            move(car, random.nextInt())
        );
        return this.racingCars;
    }

    public void move(Car car, int num){
        if(num % 10 > MIN_NUM){
            car.go();
        }
    }
}
