package racingcar;

public class RacingCar {

    public int car;
    public int move;
    public int[] carPosition;

    public RacingCar(int car, int move) {
        this.car = car;
        this.move = move;
        carPosition = new int[car];
    }

    public void racing() {

        for(int i = 0 ; i<move; i++){
            for(int j = 0; j<carPosition.length; j++) {
              if(moveCar()) {
                    carPosition[j]++;
              }
            }
        }

        for(int i = 0; i<carPosition.length; i++) {
            System.out.println(carPosition[i]);
        }

    }

    public boolean moveCar() {
        return (((int) (Math.random() * 9) >= 4) ? true : false);
    }

    public void moveCarPrint() {
        System.out.print("-");
    }

    public void nextLinePrint() {
        System.out.println();
    }


}
