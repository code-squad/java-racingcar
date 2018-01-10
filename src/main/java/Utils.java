import java.util.Random;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class Utils {

    private static final Integer RANDOM_NUMBER_BOUNDARY= 9;

    public static Integer getRandomNumber() {
        return new Random().nextInt(RANDOM_NUMBER_BOUNDARY);
    }

    public static String makeResult(Integer position) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < position; i++) {
            builder.append("-");
        }
        return builder.toString();
    }
}
