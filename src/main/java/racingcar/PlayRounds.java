package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayRounds {
    private List<PlayerCar> playerCars;

    PlayRounds(){}
    PlayRounds(String[] players){
        playerCars = new ArrayList<>();
        for(int i=0; i < players.length; i++){
            playerCars.add(new PlayerCar(players[i]));
        }
    }

    public void playSingleRounds() {
        Random random = new Random();
        for (PlayerCar playerCar : playerCars) {
            playerCar.moveCar(random.nextInt(10));
        }
    }

    public List<PlayerCar> getPlayerCars() {
        return playerCars;
    }

    public List<PlayerCar> getWinners(){
        List<PlayerCar> winners = new ArrayList<>();
        int maxLength = -1;
        for (PlayerCar playerCar : playerCars) {
            winners = checkWinnerOrNot(maxLength, playerCar, winners);
            maxLength = winners.get(0).getCarPosition().length();
        }

        return winners;
    }

    List<PlayerCar> checkWinnerOrNot(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        if(maxLength < playerCar.getCarPosition().length()){
            winners = new ArrayList<>();
            winners.add(playerCar);
            playerCar.getCarPosition().length();
            return winners;
        }

        if(maxLength == playerCar.getCarPosition().length()){
            winners.add(playerCar);
            return winners;
        }

        return winners;
    }
}
