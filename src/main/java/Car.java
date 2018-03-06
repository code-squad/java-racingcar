public class Car implements Comparable<Car>{
    private String name;
    private int carPos;

    Car(String name) {
        this.name = name;
        this.carPos = 0;
    }

    public void run(int goNum){
        if(canRun(goNum)) {
            this.carPos++;
        }
    }

    private boolean canRun(int goNum){
        return goNum >= 4;
    }

    public String getName() {
        return name;
    }

    public int getCarPos() {
        return carPos;
    }

    @Override
    public int compareTo(Car car) {
        return car.carPos - this.carPos;
    }
}
