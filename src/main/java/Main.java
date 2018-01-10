import In.Input;
import car.Race;

public class Main {
    public static void main(String[] args) {
        Race race = new Race(Input.inputCarSize(), Input.inputTryNumber(), 9, 4);
        race.moveCars();
        race.printCars();
    }
}
