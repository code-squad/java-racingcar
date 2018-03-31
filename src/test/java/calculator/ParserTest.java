package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {
    String input;
    Parser parser;
    String removalSpace;

    @Before
    public void setUp(){
        parser = new Parser();
        input = "2 + 3 * 4 / 2";
        removalSpace ="2+3*4/2";
    }

    // 공백제거
    @Test
    public void 공백제거(){
        String expected = "2+3*4/2";
        String output = parser.removeSpace(input);

        assertThat(output).isEqualTo(expected);
    }

    // 특수문자로 숫자를 나눌 것
    @Test
    public void 숫자만_뽑아내기(){
        List<Integer> expectedNumbers = Arrays.asList(2,3,4,2);
        List<Integer> outputNumbers = parser.extractNumbers(removalSpace);

        assertThat(expectedNumbers).isEqualTo(outputNumbers);
    }

    // 특수문자만 따로 가져올 것
    @Test
    public void 연산자만_가져오기(){
        String expectedChars = "+*/";
        String outputChars = parser.extractSpecialChars(removalSpace);

        assertThat(outputChars).isEqualTo(expectedChars);
    }





}
