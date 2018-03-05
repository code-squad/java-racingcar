import io.Input;
import io.Output;

import java.util.Random;

public class RacingUtils {
    public static int getRandomNum(){
        return new Random().nextInt(10);
    }

    public static int getUserInputNumber(String message){
        int userInput = -1;

        while(isInvalidNumber(userInput)){
            Output.printMessage(message);
            userInput = Input.getInt();
        }

        return userInput;
    }

    private static boolean isInvalidNumber(int num){
        return num < 0;
    }

    public static String getUserInputStr(String message){
        String str = "";

        while(isInvalidStr(str)){
            Output.printMessage(message);
            str = Input.getString();
        }
        return str;
    }

    private static boolean isInvalidStr(String str){
        return str == null || str.isEmpty();
    }

    public static String[] parseUsersName(String usersName){
        String delimiter = ",";
        return usersName.split(delimiter);
    }
}