package racingcar;

import java.util.List;

public class ResultView {
    public void printRoundState(List<PlayerCar> playerCars){
        for(PlayerCar playerCar : playerCars){
            System.out.println( playerCar.getCarPosition() );
        }
    }

}
