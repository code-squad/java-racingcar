import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

//MEMO: 리턴이 오는게 아닌 함수는 어떻게 테스트?

public class CarTest {

    @Test
    public void 이동(){
        Car car = new Car("ddd");
        car.move(9);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
