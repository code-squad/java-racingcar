package racing;

public class Main {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        int time = inputs.getTime();
        String[] carNames = inputs.getCarName();

        Racing racing = new Racing(time, carNames);
        inputs.close();

        racing.run();
    }

}