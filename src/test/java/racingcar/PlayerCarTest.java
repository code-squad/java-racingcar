package racingcar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerCarTest {

    @Test
    public void moveBiggerThenOrEqual4() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.moveCar(4);

        assertThat(playerCar.getCarPosition()).isEqualTo("--");
    }

    @Test
    public void stopSmallerThen4() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.moveCar(3);

        assertThat(playerCar.getCarPosition()).isEqualTo("-");
    }
}
