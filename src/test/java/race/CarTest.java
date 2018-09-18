package race;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void isGo(){
        Car car = new Car("skull");
        car.go();
        int num = car.getPosition();
        assertThat(num).isEqualTo(0);
    }

    @Test
    public void what(){
        String answer = "asdf";
        answer += "bbbbbb";
        System.out.println(answer);
    }

}
