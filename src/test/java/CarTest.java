import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car c;
    Racing r;
    int position;

    @Before
    public void setUp() {
        c = new Car();
        r = new Racing();
    }

    @Test
    public void runTest() {
        int randomValue = Racing.getRandomInt();
        System.out.println("randomValue is : "+randomValue);
        position = c.getPosition();
        System.out.println("original position is : "+position);
        c.oneRun(randomValue);

        if (randomValue >= 4) {
            assertEquals(position + 1, c.getPosition());
            System.out.println("later position is : "+c.getPosition());
        } else {
            assertEquals(position, c.getPosition());
            System.out.println("later position is : "+c.getPosition());
        }
    }

    @Test
    public void selectWinnerPositionTest(){
        int[] positions = {12, 1, 21, 8};
        System.out.println("Positions are : "+ Arrays.toString(positions));
        System.out.println("Max position is : "+Racing.selectMaxPosition(positions));
        assertEquals(21, Racing.selectMaxPosition(positions));
    }

    @Test
    public void selectWinnerTest(){

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("a"));
        carList.add(new Car("b"));
        carList.add(new Car("c"));
        carList.add(new Car("d"));

        ArrayList<int[]> usersPosition = new ArrayList<int[]>();
        usersPosition.add(new int[] {1, 1, 1, 1, 5}); // a
        usersPosition.add(new int[] {1, 1, 1, 5, 5}); // b
        usersPosition.add(new int[] {1, 1, 5, 5, 5}); // c
        usersPosition.add(new int[] {1, 5, 5, 5, 5}); // d , winner

        int times = 5;

        //run
        for (int i=0; i<carList.size(); i++){
            int[] pp = (int[]) usersPosition.get(i);
            for (int j=0; j<pp.length; j++){
                carList.get(i).oneRun(pp[j]);
            }
        }

        ArrayList<String> winner = new ArrayList<String>();
        winner.add("d");
        System.out.println("expected winner are : "+winner);
        System.out.println("real winner are : "+Racing.selectWinner(carList, 5));
        assertEquals(winner, Racing.selectWinner(carList, 5));
    }

}

