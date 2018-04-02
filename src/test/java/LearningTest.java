import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class LearningTest {

    @Test
    public void splitTest() {
        //given
        String expression = "2 + 3 * 4 / 2";

        //when
        String[] split = expression.split(" ");

        //then
        Assertions.assertThat(split).hasSize(7);
    }
    
    @Test
    public void random_함수_테스트_인자_값과_같거나_낮은값_얻는다() {
        //given
        int randomLimit = 1; // 낮은 수로 해야 그나마 모든 랜덤 케이스가 테스트 될 확율이 높을 듯.
        Random random = new Random();

        //when then
        IntStream.range(0, 200).forEach(idx -> 
                randomAssert(randomLimit, random.nextInt(randomLimit)));
    }
    
    private void randomAssert(int limit, int result) {
        Assertions.assertThat(limit).isGreaterThan(result);
    }

    @Test
    public void map_안의_리스트_특정_인덱스_순회하기() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("1", Arrays.asList(1, 2, 3));
        map.put("2", Arrays.asList(5, 6, 7));

        IntStream.range(0, 3)
                .forEach(idx -> map.forEach((k, v) -> {
                    System.out.print(String.format("%s :", k));
                    System.out.print(v.get(idx));
                    System.out.println();
                }));
    }
}
