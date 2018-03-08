package car.race;

public class Output {

    public static void printMessage(String message) {
        System.out.print(message);
    }

    public static void printDash(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }

    public static void startNewLine() {
        System.out.println("");
    }
}
