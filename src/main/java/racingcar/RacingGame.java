package racingcar;

public class RacingGame {
    private Car[] cars;
    private String winName = "";

    RacingGame(String[] users){
        cars = new Car[users.length];
        makeCar(users);
    }

    public void makeCar(String[] users){
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car(users[i]);
            cars[i] = car;
        }
    }

    public void move(int time) {
        for (int i = 0; i < time; i++) {
            runCar(cars);
        }
    }

    public void runCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
        }
    }

    public String output(){
        for (int i = 0; i < cars.length; i++) {
            ResultView.carDist(i, cars);
            ResultView.finishLine(i, cars.length);
        }
        return winUser();
    }

    public String winUser() {
        int max = getMax();
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            winName = winNameAll(i, max);
        }
        return winName;
    }

    public int getMax() {
        int max = cars[0].getPosition();
        for (int i = 1; i < cars.length; i++) {
            max = cars[i].findMaxPos(max);
        }
        return max;
    }

    public String winNameAll(int i, int max) {
        if(cars[i].isMaxPos(max)){
            winName += (cars[i].getUserName() + " ");
        }
        return winName;
    }
}

