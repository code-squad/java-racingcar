package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayRounds {
    private List<PlayerCar> playerCars;

    PlayRounds(String[] players){
        playerCars = new ArrayList<>();
        for(String player : players){
            playerCars.add(new PlayerCar(player) );
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
            winners = makeWinnerList(maxLength, playerCar, winners);
            maxLength = winners.get(0).getCarPosition().length();
        }

        return winners;
    }

    List<PlayerCar> makeWinnerList(int maxLength, PlayerCar playerCar, List<PlayerCar> winners ){
        if(playerCar.isBiggerThenPosition(maxLength)){
            return makeNewWinnerList(playerCar);
        }

        if(playerCar.isEqualThenPosition(maxLength)){
            return addExistWinnerList(playerCar, winners);
        }

        return winners;
    }

    List<PlayerCar> addExistWinnerList(PlayerCar playerCar, List<PlayerCar> winners) {
        winners.add(playerCar);
        return winners;
    }

    List<PlayerCar> makeNewWinnerList(PlayerCar playerCar) {
        List<PlayerCar> winners;
        winners = new ArrayList<>();
        winners.add(playerCar);
        return winners;
    }
}
