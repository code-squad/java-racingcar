public class RacingPrompt {

	public static void main(String[] args) {
		String[] carNames = CarInput.getNames();
		int times = CarInput.getTimes();
		Racing r1 = new Racing(carNames, times);
		r1.run();
		CarOutput.printResult(r1);
	}
}
