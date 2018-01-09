import java.util.List;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class ResultView {
    public static void printResult(List<Car> cars) {
        cars.forEach(ResultView::print);
    }

    private static void print(Car car) {
        System.out.println(Utils.makeResult(car.getPosition()));
    }
}
