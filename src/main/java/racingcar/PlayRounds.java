package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class PlayRounds {
    private ArrayList<PlayerCar> payerCarArrayList;

    PlayRounds(int carCount){
        payerCarArrayList = new ArrayList<PlayerCar>();
        for(int i=0; i < carCount; i++){
            payerCarArrayList.add(new PlayerCar());
        }
    }

    public void playSingleRounds() {
        Random random = new Random();
        for (int i = 0; i < payerCarArrayList.size(); i++) {
            payerCarArrayList.get(i).moveCar(random.nextInt(10));
        }
    }

    public ArrayList<PlayerCar> getPayerCarArrayList() {
        return payerCarArrayList;
    }
}
