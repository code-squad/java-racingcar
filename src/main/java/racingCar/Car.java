package racingCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final int STAND_VALUE =  4;
    private List<Integer> barHistory = new ArrayList<>();
    private int bar = 0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomValue) {
        if(randomValue > STAND_VALUE){
            bar++;
        }
        barHistory.add(bar);
    }

    public List<Integer> getBarHistory() {
        return barHistory;
    }

    public int getBar() {
        return bar;
    }

    public String getName() {
        return name;
    }
}
