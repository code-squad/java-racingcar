package racingCar;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Integer> barHistory = new ArrayList<>();
    private int bar = 0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    void go() {
        bar++;
        barHistory.add(bar);
    }

    void stop() {
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
