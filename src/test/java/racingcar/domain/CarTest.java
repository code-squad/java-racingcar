package racingcar.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {

    @Test
    public void 자동차이동테스트하기() {

        Car pobiCar = new Car("pobi");
        Car kokoCar = new Car("koko");
        pobiCar.move(6);
        kokoCar.move(3);

        assertThat(pobiCar.getCarPostion()).isEqualTo(1);
        assertThat(kokoCar.getCarPostion()).isEqualTo(0);

        pobiCar.move(5);

        assertThat(pobiCar.getCarPostion()).isEqualTo(2);
    }
}