package race;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGameTest {

    private MoveRule rule;
    private Drawer drawer;
    
    @Before
    public void setUp() { 
        rule = new DefaultMoveRule();
        drawer = new LineDrawer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이스에_참여한_자동차가_null이면_예외발생() {
        //when
        RacingGame game = new RacingGame(null, 0, rule, drawer);

        //then
        Assert.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void 레이스에_참여한_자동차가_0이면_예외발생() {
        //when
        RacingGame game = new RacingGame(new ArrayList<>(), 0, rule, drawer);

        //then
        Assert.fail("레이스에 참여한 자동차가 없으면 예외가 발생해야 한다");
    }

    @Test
    public void race_를_시작하면_자동차들은_움직이거나_움직이지_않을_수_있다() {
        //given
        List<Car> cars = getCarsNumberOf(3);
        int iteration = 5;
        RacingGame game = new RacingGame(cars, iteration, rule, drawer);

        //when
        game.race();
        List<Car> raceResult = game.getResult();

        //then
        Assert.assertEquals(cars.size(), raceResult.size());
        cars.forEach(c -> Assert.assertTrue(c.getCurrentLocation() >= 0));
    }

    @Test
    public void 반복_주기가_0이면_모든_자동차는_움직이지_않는다() {
        //given
        List<Car> cars = getCarsNumberOf(10);
        int iteration = 0;
        RacingGame game = new RacingGame(cars, iteration, rule, drawer);

        //when
        game.race();
        List<Car> raceResult = game.getResult();

        //then
        Assert.assertEquals(cars.size(), raceResult.size());
        cars.forEach(x -> Assert.assertEquals(0, x.getCurrentLocation()));
    }


    @Test
    public void random_함수_테스트_인자_값과_같거나_낮은값_얻는다() {
        //given
        int randomLimit = 1; // 낮은 수로 해야 그나마 모든 랜덤 케이스가 테스트 될 확율이 높을 듯.
        Random random = new Random();

        //when then
        for (int i = 0; i < 200; i++) {
            randomAssert(randomLimit, random.nextInt(randomLimit));
        }

    }

    private void randomAssert(int limit, int result) {
        Assert.assertTrue(limit >= result);
    }

    private List<Car> getCarsNumberOf(int number) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            cars.add(new Car());
        }

        return cars;
    }
}