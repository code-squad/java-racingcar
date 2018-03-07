public class CarOutput {

    private static void runningExpression(Car c) {
        System.out.printf("Car " + c.getName() + " >> ");
        for (int i = 0; i < c.getPosition(); i++) {
            System.out.printf("-");
        }
        System.out.println("");
    }

    public static void printRacing(Racing r) {
        for (Car c : r.getCarList()) {
            runningExpression(c);
        }
    }

    public static void printWinner(Racing r) {
        System.out.println("우승자는 " + r.getWinnerList() + "입니다.");
    }

    public static void printResult(Racing r) {
        printRacing(r);
        printWinner(r);
    }
}


