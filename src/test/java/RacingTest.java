import org.junit.*;
import racing.*;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RacingTest {

    Racing racing;
    String[] name;
    int time;
    Car[] cars;

    @Before
    public void berforeTest() {
        name = new String[3];
        cars = new Car[name.length];
        for (int i = 0; i < name.length; i++) {
            name[i] = (char)('A' + i) + "";
            cars[i] = new Car(name[i]);
        }

        time = 1;
        racing = new Racing(time, name);
    }

    /* 4이상의 값을 받았을 때, 1이 증가되었는지 확인 */
    @Test
    public void moveCarTest0() {
        cars[0].move(1);
        assertEquals(cars[0].getCarDistance(), "");
    }

    /* 4이상의 값을 받았을 때, 1이 증가되었는지 확인 */
    @Test
    public void moveCarTest1() {
        cars[1].move(5);
        assertEquals(cars[1].getCarDistance(), "-");
    }

    /* 4이상의 값을 받았을 때, 1이 증가되었는지 확인 */
    @Test
    public void moveCarTest2() {
        cars[2].move(7);
        assertEquals(cars[2].getCarDistance(), "-");
    }

    /* 가장 큰 값 확인 */
    @Test
    public void getWinnerTest0() {
        for (int i = 0; i < cars.length; i++) {
            cars[i].move(i + 2);
        }
        assertEquals(racing.getWinner(cars).getCarDistance(), "-");
    }

    /* 가장 큰 값을 가진 우승자 목록 확인 (2명)*/
    @Test
    public void getWinnersTest0() {//getWinners
        for (int i = 0; i < cars.length; i++)
            cars[i].move(i + 3);
        List<String> winnerList = racing.getWinners(cars);
        for(String winner : winnerList) {
            assertEquals(winner, "B");
            assertEquals(winner, "C");
        }
    }

    /* 가장 큰 값을 가진 우승자 목록 확인 (1명) */
    @Test
    public void getWinnersTest1() {//getWinners
        for (int i = 0; i < cars.length; i++)
            cars[i].move(i + 2);
        List<String> winnerList = racing.getWinners(cars);
        for(String winner : winnerList)
            assertEquals(winner, "C");

    }

    @After
    public void afterTest() {
        racing = null;
        cars = null;
    }
}
