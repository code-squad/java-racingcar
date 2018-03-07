public class Car implements Comparable<Car> {
    private String name;
    private int position;

    public Car(){}

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public static boolean isGo(int randomValue) {
        if (randomValue >= 4) {
            return true;
        }
        return false;
    }
    public void oneRun(int randomValue){
        if (isGo(randomValue)) this.position++;
    }

    @Override
    public int compareTo(Car c) {
        if (this.position > c.position)
            return 1;
        else if (this.position < c.position)
            return -1;
        else
            return 0;
    }
}