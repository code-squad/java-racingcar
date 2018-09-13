package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    ArrayList<Car> cars = new ArrayList<>();

    public void run(){
        InputView iv = new InputView();
        ResultView rv = new ResultView();

        cars = iv.getCars();
        rv.print(cars);
    }
}
