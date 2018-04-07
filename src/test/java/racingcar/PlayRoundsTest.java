package racingcar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayRoundsTest {
    @Test
    public void checkWinnerOrNotNewMaxLength() {
        String players[] = {"test"};
        PlayRounds playRounds = new PlayRounds(players);
        PlayerCar testCar = playRounds.getPlayerCars().get(0);
        testCar.setCarPosition("---");
        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        maxLength = playRounds.makeWinnerList(maxLength, testCar, winners).get(0).getCarPosition().length();

        assertThat(maxLength).isEqualTo(3);
    }
    @Test
    public void checkWinnerOrNotAddNewPlayerCar() {
        String players[] = {"test"};
        PlayRounds playRounds = new PlayRounds(players);
        PlayerCar testCar = playRounds.getPlayerCars().get(0);
        testCar.setCarPosition("---");
        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        winners = playRounds.makeWinnerList(maxLength, testCar, winners);

        assertThat(winners.size()).isEqualTo(1);
    }

    @Test
    public void checkWinnerOrNotSmallerThenMaxLength() {
        String players[] = {"test"};
        PlayRounds playRounds = new PlayRounds(players);
        PlayerCar testCar = playRounds.getPlayerCars().get(0);
        testCar.setCarPosition("---");
        List<PlayerCar> winners = new ArrayList<>();
        int maxLength = -1;
        winners = playRounds.makeWinnerList(maxLength, testCar, winners);
        maxLength = winners.get(0).getCarPosition().length();

        PlayerCar testCar2 = new PlayerCar("test2");
        testCar2.setCarPosition("--");
        maxLength = playRounds.makeWinnerList(maxLength, testCar2, winners).get(0).getCarPosition().length();

        assertThat(maxLength).isEqualTo(3);
    }

    @Test
    public void checkWinnerOrNotEqualMaxValue() {
        String players[] = {"test"};
        PlayRounds playRounds = new PlayRounds(players);
        PlayerCar testCar = playRounds.getPlayerCars().get(0);

        testCar.setCarPosition("---");
        List<PlayerCar> winners = new ArrayList<>();
        int maxLength = -1;
        winners = playRounds.makeWinnerList(maxLength, testCar, winners);
        maxLength = winners.get(0).getCarPosition().length();

        PlayerCar testCar2 = new PlayerCar("test2");
        testCar2.setCarPosition("---");
        winners = playRounds.makeWinnerList(maxLength, testCar2, winners);

        assertThat(winners.size()).isEqualTo(2);
    }



    @Test
    public void checkWinnerOrNotBiggerThenMaxValue() {
        String players[] = {"test"};
        PlayRounds playRounds = new PlayRounds(players);
        PlayerCar testCar = playRounds.getPlayerCars().get(0);
        testCar.setCarPosition("---");

        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        winners.add(testCar);
        testCar = new PlayerCar("test2");
        testCar.setCarPosition("---");
        winners.add(testCar);
        maxLength = 3;

        testCar = new PlayerCar("test2");
        testCar.setCarPosition("----");
        winners = playRounds.makeWinnerList(maxLength, testCar, winners);

        assertThat(winners.size()).isEqualTo(1);
    }
}
