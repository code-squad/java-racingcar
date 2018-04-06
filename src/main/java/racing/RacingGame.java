package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RacingGame {
    private final static int MIN_NUM = 4;
    private List<Car> racingCars;
    private Random random;
    private String[] driverNames;


    public RacingGame(String driverNames){
        this.racingCars = new ArrayList<>();
        this.random = new Random(System.currentTimeMillis());
        this.driverNames = driverNames.split(",");
    }

    private void createCars() {
        checkMinSize();
        for(int i = 0; i < driverNames.length; i++){
            this.racingCars.add(new Car(driverNames[i]));
        }
    }

    public void readyRacing(){
        checkMinSize();
        createCars();
    }

    private void checkMinSize() {
        if(driverNames.length < 2 ){
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

    public List<String> getBestDrivers(){
        return getBestDriverNames(findBestDrivers(getMaxDistance()));
    }

    public List<String> getBestDriverNames(List<Car> bestDrivers) {
        return bestDrivers.stream().map(car -> car.getName()).collect(Collectors.toList());
    }


    public List<Car> findBestDrivers(int bestDistance) {
        List<Car> bestDrivers = new ArrayList<>();
        for(int i = 0; i < this.racingCars.size(); i++){
            findBestDriver(bestDistance, bestDrivers, this.racingCars.get(i));
        }
        return bestDrivers;
    }

    public void findBestDriver(int bestDistance, List<Car> bestDrivers, Car car) {
        if(car.getDistance() == bestDistance){
            bestDrivers.add(car);
        }
    }

    private int getMaxDistance() {
        return this.racingCars.stream().mapToInt( car -> car.getDistance()).max().getAsInt();
    }

}
