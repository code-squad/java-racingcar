package race;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class RacingGameTest {
    private RaceRule rule;

    @Before
    public void setUp() { 
        rule = new DefaultRaceRule();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이스에_참여한_자동차가_null이면_예외발생() {
        //when
        new RacingGame(null, 0);

        //then
        Assertions.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이스에_참여한_자동차가_0이면_예외발생() {
        //when
        new RacingGame(new String[0], 0);

        //then
        Assertions.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }

    @Test
    public void race_를_시작하면_모든_자동차는_룰에_따라_움직인다() {
        //given
        String[] racers = generateRacerNamesNumberOf(3);
        int iteration = 5;
        RacingGame game = new RacingGame(racers, iteration);

        //when
        game.race(randomValue -> true);
        List<RaceCar> raceCars = game.getParticipants();

        //then
        Assertions.assertThat(raceCars).hasSize(racers.length);
        Assertions.assertThat(raceCars.stream())
                .extracting(RaceCar::getRecorder)
                .extracting(Recorder::getLastRecord)
                .containsOnly(5);
    }

    @Test
    public void 반복_주기가_0이면_모든_자동차는_움직이지_않는다() {
        //given
        String[] racers = generateRacerNamesNumberOf(10);
        int iteration = 0;
        RacingGame game = new RacingGame(racers, iteration);

        //when
        game.race(rule);
        List<RaceCar> raceCars = game.getParticipants();

        //then
        Assertions.assertThat(raceCars).hasSize(racers.length);
        Assertions.assertThat(raceCars.stream())
                .extracting(RaceCar::getRecorder)
                .extracting(Recorder::getLastRecord)
                .containsOnly(0);
    }
    
    private String[] generateRacerNamesNumberOf(int number) {
        String[] racers = new String[number];

        IntStream.range(0, racers.length).forEach(idx ->
                racers[idx] = String.valueOf(String.format("Racer%d", idx))
        );

        return racers;
    }
}