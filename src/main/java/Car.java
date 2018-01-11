public class Car {

    private int position;

    public void move (int randomValue) {
        position += randomValue;
        System.out.println("print from move method position is " + position);
    }
}
