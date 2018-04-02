package racingcar;

import java.util.ArrayList;

public class ResultView {
    public void printRoundState(ArrayList<PlayerCar> payerCarArrayList){
        for(int i=0; i<payerCarArrayList.size(); i++){
            payerCarArrayList.get(i).printCarPosition();
        }
    }

}
