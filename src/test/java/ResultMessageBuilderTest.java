import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ResultMessageBuilderTest {
    ArrayList<Car> carList;
    Car testCar1, testCar2, testCar3;

    @Before
    public void setUp() throws Exception {
        carList = new ArrayList<>();
        testCar1 = new Car("test1");
        testCar2 = new Car("test2");
        testCar3 = new Car("test3");
        fillPos(testCar1, 0);
        carList.add(testCar1);
        fillPos(testCar2, 9);
        carList.add(testCar2);
        fillPos(testCar3, 3);
        carList.add(testCar3);
    }

    private void fillPos(Car car, int startGoNum){
        for(int i=startGoNum; i<10; i++){
            car.run(i);
        }
    }

    @Test
    public void 위치문자열변환() {
        assertEquals("-----", ResultMessageBuilder.convertMessage(5));
    }

    @Test
    public void 위너찾기() {
        int winnerRecord = ResultMessageBuilder.getWinnerRecord(carList);
        assertEquals(new Car[]{testCar1, testCar3}, ResultMessageBuilder.searchWinners(carList));
    }

    @Test
    public void 위치기준내림차순정렬() {
        ResultMessageBuilder.recordSort(carList);
        assertEquals(testCar1, carList.get(0));
    }

    @Test
    public void 위너의위치찾기() {
        assertEquals(6, ResultMessageBuilder.getWinnerRecord(carList));
    }

    @Test
    public void 위너이름출력() {
        assertEquals("test1, test3", ResultMessageBuilder.getWinnersName(carList));
    }
}