public class CarOutput {

    private static void runningExpression(Car car) {
        System.out.printf("Car " + car.getName() + " >> ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.printf("-");
        }
        System.out.println("");
    }

    public static void printRacing(Racing racing) {
        for (Car c : racing.getCars()) {
            runningExpression(c);
        }
    }

    public static void printWinner(Racing racing) {
        System.out.println("우승자는 " + racing.getWinnerList() + "입니다.");
    }

    public static void printResult(Racing racing) {
        printRacing(racing);
        printWinner(racing);
    }
}


