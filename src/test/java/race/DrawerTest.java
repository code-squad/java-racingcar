package race;

import static org.hamcrest.CoreMatchers.is;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class DrawerTest {
    private Drawer drawer;

    private ByteArrayOutputStream outputCapture;

    @Before
    public void setUp() {
        outputCapture = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputCapture));
    }

    @Test
    public void lineDrawer_자동차의_위치만큼_라인을_그린다() {
        //given
        drawer = new LineDrawer();
        Car car = new Car();
        car.move();
        car.move();
        car.move();
        List<Car> cars = ImmutableList.of(car);

        //when
        drawer.draw(cars);
        
        //then
        Assert.assertThat(outputCapture.toString(), is("---\n\n"));
    }
}