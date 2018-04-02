import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void 막대생성(){
        Racing racing = new Racing();
        assertThat(racing.convertToBar(3, 1)).isEqualTo("----");
    }
    @Test
    public void 현상황보여주기(){
        Racing racing = new Racing();
        racing.setNumCar(3);
        racing.setNumCircuit(5);
        racing.update(new int[] {0, 1, 1});
        racing.printStatus();
        assertEquals("-\n" +
                "--\n" +
                "--\n\n", outContent.toString());

    }

    //MEMO: private 멤버변수가 설정되었다는 것은 어떻게 테스트핧 수 있을까?
    @Test
    public void 차의개수설정(){
        Racing racing = new Racing();
        racing.setNumCar(3);
        assertThat(racing.getNumCar()).isEqualTo(3);
    }

    @Test
    public void 레이스바퀴수설정(){
        Racing racing = new Racing();
        racing.setNumCircuit(3);
        assertThat(racing.getNumCircuit()).isEqualTo(3);
    }
    @Test
    public void 한바퀴결과업데이트(){
        Racing racing = new Racing();
        racing.setNumCar(3);
        racing.setNumCircuit(5);
        racing.update(new int[] {0, 1, 1});
        racing.update(new int[] {0, 1, 0});
        assertThat(racing.getCarPositions()).isEqualTo(new int[] {0, 2, 1});
    }


}
