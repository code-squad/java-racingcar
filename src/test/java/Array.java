import org.junit.Test;
import racingcar.Car;

public class Array {
    @Test
    public void createCar() {
        String input = "pobi,crong,honux";
        String[] names = input.split(",");

        Car car = null;
        for (String name : names) {
            System.out.println(name);

        }
    }

    @Test
    public void stringTest() {
        StringBuffer  sb = new StringBuffer();
        sb.append("1234567890");

        System.out.println(sb.deleteCharAt(5));
    }

}
