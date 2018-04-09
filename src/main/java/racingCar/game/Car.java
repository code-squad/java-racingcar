package racingCar.game;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static final int STAND_VALUE =  4;
    private List<Integer> barHistory = new ArrayList<>();
    private int bar = 0;
    private String name;

    public Car(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("차 이름은 반드시 포함되어야 합니다.");
        }
        this.name = name;
    }

    public void move(int randomValue) {
        if(randomValue > STAND_VALUE){
            bar++;
        }
        barHistory.add(bar);
    }

    public boolean matchCondition(int winningCondition){
        if(this.bar == winningCondition ){
            return true;
        }
        return false;
    }

    public boolean checkWiningCondition(int maxPostion){
        if(maxPostion < this.bar){
            return true;
        }
        return false;
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
