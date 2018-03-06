import java.util.Random;

public class RacingUtils {
    public static int getRandomNum(){
        return new Random().nextInt(10);
    }

    public static String[] parseUsersName(String usersName){
        String delimiter = ",";
        return usersName.split(delimiter);
    }
}