import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void 초기설정() {
        String[] names = {"pobi", "crong", "honux"};

        racingGame = new RacingGame(names, 4);
    }

    @Test
    public void 자동차생성() {
        racingGame.start();
        assertEquals(5, racingGame.getCars().size());
    }

    @Test
    public void 우승자가져오기_포비() {
        Car pobiCar = racingGame.getCars().get(0);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);

        Car crongCar = racingGame.getCars().get(1);
        crongCar.move(9);
        crongCar.move(9);
        crongCar.move(9);

        Car honuxCar = racingGame.getCars().get(2);
        honuxCar.move(4);
        honuxCar.move(4);
        honuxCar.move(4);
        honuxCar.move(4);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        racingGame.printWinners();

        assertEquals("\npobi, honux이(가) 최종 우승했습니다.\n", outputStream.toString());

        System.setOut(null);
    }

    @Test
    public void 우승자가져오기_포비호눅스() {
        Car pobiCar = racingGame.getCars().get(0);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);
        pobiCar.move(8);

        Car crongCar = racingGame.getCars().get(1);
        crongCar.move(9);
        crongCar.move(9);
        crongCar.move(9);

        Car honuxCar = racingGame.getCars().get(2);
        honuxCar.move(4);
        honuxCar.move(4);
        honuxCar.move(4);
        honuxCar.move(4);
        honuxCar.move(4);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        racingGame.printWinners();

        assertEquals("\npobi, honux이(가) 최종 우승했습니다.\n", outputStream.toString());

        System.setOut(null);
    }
}
