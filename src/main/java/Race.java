import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {
    private List<Car> cars;
    public Race(String[] carNames){
        this.cars = new ArrayList<>();
        for( String carName : carNames){
            this.cars.add(new Car(carName));
        }
    }
    public List<Car> move() {
        for (int i=0; i<this.cars.size(); i++){
            Random r = new Random();
            int randomValue = r.nextInt(9);
            this.cars.get(i).move(randomValue);
        }
        return cars;
    }
    public List<Car> getWinner(){
        int maxPosition = 0;
        List<Car> winners = new ArrayList<>();

        for(Car car : this.cars){
            if(maxPosition > car.getPosition()){
                continue;
            }
            if (maxPosition < car.getPosition()){
                winners.clear();
                maxPosition = car.getPosition();
            }
            winners.add(car);
        }
        return winners;
    }
}
