public class RacingPrompt {

    public static void main(String[] args) {
        String names = CarInput.getNames();
        int times = CarInput.getTimes();
        Racing r1 = new Racing(names, times);
        r1.run();
        CarOutput.printResult(r1);
    }
}
