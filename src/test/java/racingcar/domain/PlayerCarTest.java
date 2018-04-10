package racingcar.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerCarTest {

    @Test
    public void moveBiggerThenOrEqual4() {
        PlayerCar playerCar = new PlayerCar("test");
        playerCar.moveCar(4);

        assertThat(playerCar.getPosition()).isEqualTo("--");
    }

    @Test
    public void stopSmallerThen4() {
        PlayerCar playerCar = new PlayerCar("test");
        playerCar.moveCar(3);

        assertThat(playerCar.getPosition()).isEqualTo("-");
    }
}
