import java.util.ArrayList;
import java.util.Arrays;

public class Racing {
    private static int times;
    private ArrayList<Car> carList = new ArrayList<Car>();
    private ArrayList<String> winnerList = new ArrayList<String>();

    public Racing() {
    }

    public Racing(String names, int times) {
        String[] carNames = names.split(",");
        this.carList = makeCarList(carNames);
        this.times = times;
    }

    public static int getRandomInt() {
        int randomNum = (int) (Math.random() * 9);
        return randomNum;
    }

    public ArrayList<Car> makeCarList(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            carList.add(new Car(carNames[i]));
        }
        return carList;
    }

    public static void doRace(Car c, int times) {
        for (int i = 0; i < times; i++) {
            c.oneRun(Racing.getRandomInt());
        }
    }

    public void race(ArrayList<Car> carList) {
        for (Car c : carList) {
            doRace(c, this.times);
        }
    }

    public static int selectMaxPosition(int[] positions) {
        Arrays.sort(positions);
        int max = positions[positions.length - 1];
        return max;
    }

    public static int[] makePositions(ArrayList<Car> carList, int times){
        int[] positions = new int[times];
        for (int i = 0; i < carList.size(); i++) {
            positions[i] = carList.get(i).getPosition();
        }
        return positions;
    }

    public static ArrayList<String> selectWinner(ArrayList<Car> carList, int times) {
        ArrayList<String> winner = new ArrayList<String>();
        int[] positions = makePositions(carList, times);
        int winnerPosition = selectMaxPosition(positions);
        for(Car c : carList) {
            if(c.getPosition() == winnerPosition) {
                winner.add(c.getName());
            }
        }
        return winner;
    }


    public ArrayList<Car> getCarList() {
        return carList;
    }
    public ArrayList<String> getWinnerList() {
        return winnerList;
    }

    public void run() {
        race(carList);
        winnerList = selectWinner(carList, times);
    }
}
