public class RacingPrompt {

    public static void main(String[] args) {
        String names = CarInput.getNames();
        int times = CarInput.getTimes();
        Racing racing1 = new Racing(names, times);
        racing1.run();
        CarOutput.printResult(racing1);
    }
}
