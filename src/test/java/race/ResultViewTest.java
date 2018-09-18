package race;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ResultViewTest {

    Car[] car = {new Car("lion",3),new Car("skull",2),new Car("ferrari",6)};

    @Test
    public void MaxValue(){
        CarRacing.maxSet(car);
        int max = car[0].getMax();
        assertThat(max).isEqualTo(5);
    }

    @Test
    public void champion() {
        CarRacing.maxSet(car);
        String result = ResultView.victory(CarRacing.victory(car));
        assertThat(result).isEqualTo("ferrari가 우승했습니다.");
    }
}
