public class Car implements Comparable<Car>{
    private String name;
    private int carPos;

    Car(String name) {
        this.name = name;
        this.carPos = 0;
    }

    public void run(int times){
        for(int i=0; i<times; i++){
            int goNum = RacingUtils.getRandomNum();

            if(canGo(goNum)) {
                this.carPos++;
            }
        }
    }

    private boolean canGo(int goNum){
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
