package racingcar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayRoundsTest {
    @Test
    public void checkWinnerOrNotNewMaxLength() {
        PlayRounds rounds = new PlayRounds();
        //int checkWinnerOrNot(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        PlayerCar testCar = new PlayerCar("test");
        testCar.setCarPosition("---");
        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        maxLength = rounds.checkWinnerOrNot(maxLength, testCar, winners).get(0).getCarPosition().length();

        assertThat(maxLength).isEqualTo(3);
    }
    @Test
    public void checkWinnerOrNotAddNewPlayerCar() {
        PlayRounds rounds = new PlayRounds();
        //int checkWinnerOrNot(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        PlayerCar testCar = new PlayerCar("test");
        testCar.setCarPosition("---");
        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);

        assertThat(winners.size()).isEqualTo(1);
    }

    @Test
    public void checkWinnerOrNotSmallerThenMaxLength() {
        PlayRounds rounds = new PlayRounds();
        //int checkWinnerOrNot(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        PlayerCar testCar = new PlayerCar("test");
        testCar.setCarPosition("---");
        List<PlayerCar> winners = new ArrayList<>();
        int maxLength = -1;
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);
        maxLength = winners.get(0).getCarPosition().length();

        PlayerCar testCar2 = new PlayerCar("test2");
        testCar2.setCarPosition("--");
        maxLength = rounds.checkWinnerOrNot(maxLength, testCar2, winners).get(0).getCarPosition().length();

        assertThat(maxLength).isEqualTo(3);
    }

    @Test
    public void checkWinnerOrNotEqualMaxValue() {
        PlayRounds rounds = new PlayRounds();
        PlayerCar testCar = new PlayerCar("test");
        testCar.setCarPosition("---");
        List<PlayerCar> winners = new ArrayList<>();
        int maxLength = -1;
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);
        maxLength = winners.get(0).getCarPosition().length();

        PlayerCar testCar2 = new PlayerCar("test2");
        testCar2.setCarPosition("---");
        winners = rounds.checkWinnerOrNot(maxLength, testCar2, winners);

        assertThat(winners.size()).isEqualTo(2);
    }



    @Test
    public void checkWinnerOrNotBiggerThenMaxValue() {
        PlayRounds rounds = new PlayRounds();
        //int checkWinnerOrNot(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        PlayerCar testCar = new PlayerCar("test");
        testCar.setCarPosition("---");
        int maxLength = -1;
        List<PlayerCar> winners = new ArrayList<>();
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);
        maxLength = winners.get(0).getCarPosition().length();

        testCar = new PlayerCar("test2");
        testCar.setCarPosition("---");
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);

        testCar = new PlayerCar("test3");
        testCar.setCarPosition("----");
        winners = rounds.checkWinnerOrNot(maxLength, testCar, winners);

        assertThat(winners.size()).isEqualTo(1);
    }
}
