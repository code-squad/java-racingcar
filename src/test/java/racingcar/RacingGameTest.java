//package racingcar;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class RacingGameTest {
//    @Test
//    public void findWinners() {
//        Car[] cars = {new Car("pobi", 3), new Car("honux", 1)};
//
//        ArrayList<Car> winners = RacingGame.findWinners(cars);
//
//        assertThat(winners.size()).isEqualTo(1);
//        assertThat(winners.get(0).getName()).isEqualTo("pobi");
//    }
//
//    @Test
//    public void generateWinnerText() {
//        ArrayList<Car> winners = new ArrayList<>();
//        winners.add(new Car("pobi", 3));
//        winners.add(new Car("honux", 3));
//
//        String text = RacingGame.generateWinnerText(winners);
//
//        assertThat(text).isEqualTo("pobi,honux");
//    }
//}
