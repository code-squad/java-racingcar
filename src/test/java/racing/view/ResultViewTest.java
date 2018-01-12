package racing.view;

import org.junit.Before;
import org.junit.Test;
import racing.model.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResultViewTest {
    private ResultView resultView;

    @Before
    public void setUp() throws Exception {
        resultView = new ResultView();
    }

    @Test
    public void showGameResultAndGameWinnerJustOne() throws Exception {
        List<Car> cars = new ArrayList<>();
        cars.add(newCar("나나", 3));

        List<String> results = new ArrayList<>();
        results.add("나나 : &nbsp&nbsp&nbsp");

        assertEquals(results, resultView.showGameResult(cars));
        assertEquals("나나가 최종 우승했습니다.", resultView.showGameWinner(cars));
    }

    @Test
    public void showGameResultAndGameWinnerMoreThanOne() throws Exception {
        List<Car> cars = new ArrayList<>();
        cars.add(newCar("보라돌이", 2));
        cars.add(newCar("뚜비", 5));

        List<String> results = new ArrayList<>();
        results.add("보라돌이 : &nbsp&nbsp");
        results.add("뚜비 : &nbsp&nbsp&nbsp&nbsp&nbsp");

        assertEquals(results, resultView.showGameResult(cars));
        assertEquals("보라돌이, 뚜비가 최종 우승했습니다.", resultView.showGameWinner(cars));
    }

    private Car newCar(String name, int position) {
        return new Car(name, position);
    }
}