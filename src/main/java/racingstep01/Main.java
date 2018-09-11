package racingstep01;

public class Main {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        int time = inputs.getTime();
        int cars = inputs.getCars();

        inputs.close();

        Racing racing = new Racing(time, cars);
        racing.run();
        racing.printRacingResult();

    }
}
