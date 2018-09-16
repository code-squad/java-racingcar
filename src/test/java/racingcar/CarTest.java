package racingcar;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class CarTest {

    // stackoverflow 참조
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    Car car1;
    Car car2;
    List<Car> allCars;
    List<Car> winners;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));

        car1 = new Car("test1", 3);
        car2 = new Car("test3", 3);
        allCars = new ArrayList<Car>();
        winners = new ArrayList<Car>();

        allCars.add(car1);
        allCars.add(new Car("test2", 1));
        allCars.add(car2);
        allCars.add(new Car("test4", 2));
        winners.add(car1);
        winners.add(car2);
    }

    // randNum이 4이상인 경우
    @Test
    public void moveTest1(){
        int nowPosition = car1.getPosition();
        assertEquals(nowPosition+1, car1.move(4));
        System.out.println(car1.getPosition());
    }

    // randNum이 4미만인 경우
    @Test
    public void moveTest2(){
        int nowPosition = car1.getPosition();
        assertEquals(nowPosition, car1.move(3));
        System.out.println(car1.getPosition());
    }

    @Test
    public void maxPositionCheckTest(){
        int maxPosition = car1.getPosition();
        assertEquals(true, car1.isMaxPostion(maxPosition));
        System.out.println(maxPosition);
    }

    @Test
    public void winnerCheckTest(){
        List<Car> result = ResultView.checkWinner(allCars, 3);
        for(int i=0; i<winners.size(); i++){
            assertEquals(winners.get(i), result.get(i));
        }
    }

    // System.out.println() test
    @Test
    public void printWinnerTest(){
        ResultView.printWinner(allCars, 3);
        String expectResult = "test1, test3가 최종 우승하였습니다.";
        assertEquals(expectResult, outContent.toString());
    }


    @After
    public void tearDown() {
        car1 = null;
        car2 = null;
        System.setOut(originalOut);
    }

}