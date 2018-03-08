public class RacingPrompt {

    public static void main(String[] args) {
        String names = CarInput.getNames();
        int times = CarInput.getTimes();

        Racing racing = new Racing(names);
        racing.run(times);

        CarOutput.printResult(racing);
    }
}
