package racingcar;

import java.util.Scanner;

public class CarMain {

    public void race() {
        Scanner scan = new Scanner(System.in);

        String Inputname = InputView.inputName(scan);
        String[] name = InputView.nameSplit(Inputname);

        CarRaceUtill carUtill = new CarRaceUtill(name);

        int tryNum = InputView.tryingNumber(scan);
        carUtill.moveCars(tryNum);
        
        carUtill.printAllCarDistance();
        carUtill.printWinner();
    }


    public static void main(String[] args) {
        CarMain carRace = new CarMain();
        carRace.race();
    }
}
