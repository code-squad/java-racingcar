package race;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

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
        Assert.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이스에_참여한_자동차가_0이면_예외발생() {
        //when
        new RacingGame(new String[0], 0);

        //then
        Assert.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }

    @Test
    public void race_를_시작하면_자동차들은_움직이거나_움직이지_않을_수_있다() {
        //given
        String[] racers = generateRacerNamesNumberOf(3);
        int iteration = 5;
        RacingGame game = new RacingGame(racers, iteration);

        //when
        game.race(rule);
        Map<String, Recorder> raceResult = game.getRecords();

        //then
        Assert.assertEquals(racers.length, raceResult.size());
        game.getRecords().entrySet().stream().forEach(e -> 
                Assert.assertTrue(e.getValue().getLastRecord() >= 0));
    }

    @Test
    public void 반복_주기가_0이면_모든_자동차는_움직이지_않는다() {
        //given
        String[] racers = generateRacerNamesNumberOf(10);
        int iteration = 0;
        RacingGame game = new RacingGame(racers, iteration);

        //when
        game.race(rule);
        Map<String, Recorder> raceResult = game.getRecords();

        //then
        Assert.assertEquals(racers.length, raceResult.size());
        game.getRecords().entrySet().stream().forEach(e ->
                Assert.assertTrue(e.getValue().getLastRecord() == 0));
    }
    
    private String[] generateRacerNamesNumberOf(int number) {
        String[] racers = new String[number];
        
        for (int i = 0; i < racers.length; i++) {
            racers[i] = String.valueOf(String.format("Racer%d", i));
        }

        return racers;
    }
}