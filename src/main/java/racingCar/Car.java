package racingCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Integer> barHistory = new ArrayList<>();
    private int bar = 0;

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


}
