package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayRounds {
    private List<PlayerCar> playerCars;

    PlayRounds(int carCount){
        playerCars = new ArrayList<>();
        for(int i=0; i < carCount; i++){
            playerCars.add(new PlayerCar());
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
}
