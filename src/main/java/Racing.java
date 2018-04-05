import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {
    private int numCircuit;
    List<Car> cars;

    public Racing(String[] carNames, int numCircuit){
//        for (int i =0; i<carNames.length; i++){
//            cars.add(new Car(car));
//        }
        this.cars = new ArrayList<>();
        for( String carName : carNames){
            this.cars.add(new Car(carName));
        }

        this.numCircuit = numCircuit;
    }
    public List<Car> move(Rule rule) {
        for (int i=0; i<this.cars.size(); i++){
            this.cars.get(i).move(movingDistance(rule));
        }
        return cars;
    }
    public int movingDistance(Rule rule){
        if(rule.isValid()){
            return 1;
        }
        return 0;
    }
    public List<Car> getWinner(){
        int maxPosition = 0;
        List<Car> winners = new ArrayList<>();

        for(Car car : this.cars){
            if(maxPosition > car.position){
                continue;
            }
            if (maxPosition < car.position){
                winners.clear();
                maxPosition = car.position;
            }
            winners.add(car);
        }
        return winners;
    }
}
