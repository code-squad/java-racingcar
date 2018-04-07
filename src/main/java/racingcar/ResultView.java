package racingcar;

import java.util.List;

public class ResultView {
    public void printRoundState(List<PlayerCar> playerCars){
        for(PlayerCar playerCar : playerCars){
            System.out.println( playerCar.getCarName() + " : " +  playerCar.getCarPosition() );
        }
    }

    public void printWinners(List<PlayerCar> winners){
        String resultString = "";
        for(PlayerCar winner : winners){
            resultString += "".equals(resultString) ? winner.getCarName() : ", " + winner.getCarName();
        }

        resultString += " 가 최종 우승했습니다.";
        System.out.println(resultString);
    }

}
