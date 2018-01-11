import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class Utils {

    private static final Integer RANDOM_NUMBER_BOUNDARY= 9;

    public static Integer getRandomNumber() {
        return new Random().nextInt(RANDOM_NUMBER_BOUNDARY);
    }

    public static String[] splitWithComma(String target) {
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return target.split(",");
    }

    public static List<Car> sortByPositionDesc(List<Car> cars) {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        sortedCars.sort(Comparator.comparing(Car::getPosition).reversed());
        return sortedCars;
    }
}