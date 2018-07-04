package calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitterTest {
    @Test
    public void defaultSplit() {
        String text = "1,2,3";
        DefaultSplitter splitter = new DefaultSplitter();
        assertThat(splitter.isSupports(text)).isTrue();
        assertThat(splitter.split(text)).containsSequence("1", "2", "3");
    }

    @Test
    public void customSplit() {
        String text = "//;\n1;2;3";
        CustomSplitter splitter = new CustomSplitter();
        assertThat(splitter.isSupports(text)).isTrue();
        assertThat(splitter.split(text)).containsSequence("1", "2", "3");
    }
}