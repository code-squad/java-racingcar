package racingGame;

public class Car implements Comparable<Car>{
    private int position;
    private String name;

    public Car() {
        this.position = 0;
    }

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public Car(int position, String name) {
        this.position = position;
        this.name = name;
    }

    public Car(int position) {
        this.position = 1;
    }

    public void rePosition(int random) {

        if (random >= GameHelperUtil.STANDARD_POINT) {
            this.position ++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String resultString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name);
        result.append(GameHelperUtil.RESULT_APPEND);

        for(int i=0; i<position; i++) {
            result.append(GameHelperUtil.MARK);
        }
        return String.valueOf(result);
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(position, car.getPosition());
    }
}
