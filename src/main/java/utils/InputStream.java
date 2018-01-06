package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static String getInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String result;

        try {
            result = bufferedReader.readLine();
        } catch (IOException e) {
            result = "error";
            e.printStackTrace();
        }
        return result;
    }
}
