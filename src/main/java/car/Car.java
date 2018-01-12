package car;

public class Car {
	private String name;
	private int position = 0;
	private String result = "";

	public Car(String name) {
		this.name = name;
	}
	public static boolean isCarMove(int moveDice) {
		return moveDice > 3;
	}
	public int move(int moveDice) {
		if (isCarMove(moveDice)) {
			position += 1;
			return position;
		}
		return position;
	}
	public String getName() {
		return this.name;
	}
	public int getPos() {
		return this.position;
	}
	public String getResult() {
		for (int i = 0; i < position; i++) {
			result += "-";
		}
		return result;
	}
}
