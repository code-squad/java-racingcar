package racingcar;

import org.junit.Test;

public class UserInputTest {
    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterCarCountNull() {
        UserInput userInput = new UserInput("", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterCarCountNonPositive() {
        UserInput userInput = new UserInput("-1", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterRoundCountNull() {
        UserInput userInput = new UserInput("-1", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterRoundCountNonPositive() {
        UserInput userInput = new UserInput("-1", "5");
    }
}
