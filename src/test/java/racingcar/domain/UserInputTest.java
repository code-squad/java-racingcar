package racingcar.domain;

import org.junit.Test;

public class UserInputTest {
    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterCarCountNull() {
        UserInput userInput = new UserInput("", "5");
    }

}
