package car.race;

public class CarRaceMain {

    public static void main(String[] args) {

        String playerNames = getPlayerNames();
        int numberofMoves = getNumberofMoves();
        CarRace race = new CarRace(playerNames, numberofMoves);

        race.startRace();

        Result result = new Result();
        result.showResult(race.getCars());
        result.findWinner(race.getCars());
        result.printWinner();
    }

    private static String getPlayerNames() {
        Output.printMessage("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분): ");
        String playerNames = Input.takeNames();
        return playerNames;
    }

    private static int getNumberofMoves() {
        Output.printMessage("시도할 횟수는 몇 인가요?: ");
        int numMoves = Input.takeNumberofMoves();
        return numMoves;
    }
}
