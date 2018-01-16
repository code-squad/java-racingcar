public class Car {
    private int position;

    public Car() {
        position = 0;
    }

    public void tryMove(int tryGo) {
        if (tryGo >= 4) {
            position += 1;
        }
    }

    public int getPosition() {
        return position;
    }
}
