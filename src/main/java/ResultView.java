import java.util.List;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class ResultView {
    public static void printResult(List<Car> cars) {
        cars.forEach(ResultView::print);
        printWinner(cars);
    }

    private static void print(Car car) {
        System.out.println(makeResult(car));
    }

    private static void printWinner(List<Car> cars) {

        List<Car> sortedCars = Utils.sortByPositionDesc(cars);

        StringBuilder builder = new StringBuilder();

        builder.append(makeWinner(sortedCars));
        builder.append("가 최종 우승했습니다.");

        System.out.println(builder.toString());
    }

    private static String makeWinner(List<Car> cars) {
        StringBuilder builder = new StringBuilder();
        builder.append(cars.get(0).getName());
        for(int i = 1; i < cars.size(); i++) {
            if(cars.get(i-1).getPosition() == cars.get(i).getPosition()) {
                builder.append(", ").append(cars.get(i).getName());
            }
        }
        return builder.toString();
    }

    private static String makeResult(Car car) {
        StringBuilder builder = new StringBuilder();
        builder.append(car.getName()).append(" : ").append(car.toString());
        return builder.toString();
    }
}