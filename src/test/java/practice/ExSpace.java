package practice;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import java.util.Scanner;

public class ExSpace {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

    }

    @Test
    public void test1() throws Exception{
        String value = s.nextLine();
        String[] values = value.split(" ");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
