package util;

import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;

public class RandomUtilTest {
    private static final int TRY_COUNT = 1000;
    private static final int BOUND_NUM = 100;

    @Test
    public void nextIntTest() {
        Random random = new Random();
        int testNum = random.nextInt(BOUND_NUM);

        for(int i = 0; i < TRY_COUNT; ++i) {
            int randomNum = RandomUtil.nextInt(testNum);
            assertTrue(0 <= randomNum && randomNum < testNum);
        }
    }
}
