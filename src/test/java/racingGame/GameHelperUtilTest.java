package racingGame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameHelperUtilTest {

    private List<Car> carList = new ArrayList<>();

    @Before
    public void setUp() {
        carList.add(new Car(2,"jisun"));
        carList.add(new Car(4,"kjs4395"));
        carList.add(new Car(4,"winner"));
    }

    @Test
    public void 가장_높은_점수_테스트() throws Exception {
        assertEquals(4,GameHelperUtil.getMaxPosition(carList));
    }

    @Test
    public void 우승자_String_테스트() throws Exception {
        assertEquals("kjs4395, winner",GameHelperUtil.getWinnerToString(carList,GameHelperUtil.getMaxPosition(carList)));
    }

}