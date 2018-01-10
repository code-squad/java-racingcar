import java.util.Random;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class Utils {

    private static final Integer RANDOM_NUMBER_BOUNDARY= 9;

    public static Integer getRandomNumber() {
        return new Random().nextInt(RANDOM_NUMBER_BOUNDARY);
    }

    public static String makeResult(Car car) {
        StringBuilder builder = new StringBuilder();
        builder.append(car.getName()).append(" : ");
        for(int i = 0; i < car.getPosition(); i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public static String[] splitWithComma(String target) {
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return target.split(",");
    }
}