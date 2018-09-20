public class ResultView {
    public static int MAX_NUM = 0;


    public static void printResult(Car[] cars) {
        System.out.println("실행결과");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            printDash(cars[i].getCarPosition());
            System.out.println("");
        }
    }

    public static void printDash(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("-");
        }
    }

    public static void checkWinner(Car[] cars) {
        int max = winner(cars);
        System.out.print("final winner : ");
        for (int i = 0; i < cars.length; i++) {
            if (max == cars[i].getCarPosition()) {
                System.out.print(cars[i].getName() + " , ");
            }
        }
    }

    public static int winner(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (MAX_NUM < cars[i].getCarPosition()) {
                MAX_NUM = cars[i].getCarPosition();
            }
        }
        return MAX_NUM;
    }


}
