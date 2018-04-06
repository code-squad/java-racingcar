public class Main {

    public static void main(String[] args){
        String[] carNames = RaceInput.setCarNames();
        int numCircuit = RaceInput.readNumCircuit();

        Race race = new Race(carNames);
        for(int i=0; i<numCircuit; i++){
            RaceView.printStatus(race.move());
        }
        RaceView.printWinner(race.getWinner());
    }
}
