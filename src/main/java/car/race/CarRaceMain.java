package car.race;

public class CarRaceMain {

    public static void main(String[] args) {

        String playerNames = getPlayerNames();
        int numberOfMoves = getNumberOfMoves();
        CarRace race = new CarRace(playerNames, numberOfMoves);

        race.startRace();

        Result result = new Result();
        result.displayResult(race.getCars());
        result.findWinner(race.getCars());

    }

    private static String getPlayerNames() {
        Output.printMessage("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분): ");
        return Input.takeNames();
    }

    private static int getNumberOfMoves() {
        Output.printMessage("시도할 횟수는 몇 인가요?: ");
        return Input.takeNumberOfMoves();
    }
}