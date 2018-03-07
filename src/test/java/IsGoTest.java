import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsGoTest {

    @Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        params.add(new Object[] {0, false});
        params.add(new Object[] {1, false});
        params.add(new Object[] {2, false});
        params.add(new Object[] {3, false});
        params.add(new Object[] {4, true});
        params.add(new Object[] {5, true});
        params.add(new Object[] {6, true});
        params.add(new Object[] {7, true});
        params.add(new Object[] {8, true});
        params.add(new Object[] {9, true});

        return params;
    }

    @Parameterized.Parameter(value = 0)
    public int inputNumber;
    @Parameterized.Parameter(value = 1)
    public boolean expectResult;

    public Car car;

    public void IsGoTest(Integer inputNumber, Boolean expectResult) {
        this.inputNumber = inputNumber;
        this.expectResult = expectResult;
    }

    @Before
    public void initialize(){
        this.car = new Car();
    }
    @Test
    public void testIsGoChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectResult, Car.isGo(inputNumber));
    }
}

