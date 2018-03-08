import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RacingTest {

    @Test
    public void selectWinnerPositionTest() {
        int[] positions = {12, 1, 21, 8};
        System.out.println("Positions are : " + Arrays.toString(positions));
        System.out.println("Max position is : " + Racing.selectMaxPosition(positions));
        assertEquals(21, Racing.selectMaxPosition(positions));
    }

    @Test
    public void selectWinnersTest() {

        // 테스트용 인스턴스 생성
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("car1"));
        cars.add(new Car("car2"));
        cars.add(new Car("car3"));
        cars.add(new Car("car4"));

        // 랜덤수 지정
        ArrayList<int[]> userRandomNum = new ArrayList<int[]>();
        userRandomNum.add(new int[]{1, 1, 1, 1, 5}); // car1
        userRandomNum.add(new int[]{1, 1, 1, 5, 5}); // car2
        userRandomNum.add(new int[]{1, 1, 5, 5, 5}); // car3
        userRandomNum.add(new int[]{1, 5, 5, 5, 5}); // car4 , winner

        //run
        for (int i = 0; i < cars.size(); i++) {
            int[] times = (int[]) userRandomNum.get(i);
            for (int j = 0; j < times.length; j++) {
                cars.get(i).oneRun(times[j]);
            }
        }

        ArrayList<String> winner = new ArrayList<String>();
        winner.add("car4");
        System.out.println("expected winner are : " + winner);
        System.out.println("real winner are : " + Racing.selectWinners(cars));
        assertEquals(winner, Racing.selectWinners(cars));
    }

}
