package racingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GameHelperUtil {
    public static final int STANDARD_POINT = 4;
    public static final String MARK = "-";
    public static final String NAME_SPLITER = ",";
    public static final String RESULT_APPEND = " : ";


    public static List<Car> getCarList(String input) {
        List<String> carNameList = Arrays.asList(input.split(NAME_SPLITER));
        List<Car> carList = new ArrayList<>();

        for (String name : carNameList) {
            carList.add(new Car(name));
        }

        return carList;
    }

    public static int getMaxPosition(List<Car> carList) {
        return carList.stream().max(Comparator.comparing(Car::getPosition))
                .get().getPosition();
    }

    public static String getWinnerToString(List<Car> carList, int max) {
        return carList.stream().filter(car -> max == car.getPosition())
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }
}
