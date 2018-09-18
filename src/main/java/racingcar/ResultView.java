package racingcar;

public class ResultView {
    static String winName = "";

    public static void output(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            carDist(i, cars);
            finishLine(i, cars);
        }
        winUser(cars);
    }

    public static void carDist(int i, Car[] cars) {
        System.out.print(cars[i].getUserName() + " : ");
        cars[i].desh();
    }

    public static void winUser(Car[] cars) {
        int max = getMax(cars);
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            winName = winNameAll(i, max, winName, cars);
        }
        System.out.println(winName + "가 최종 우승했습니다.");
    }

    public static int getMax(Car[] cars) {
        int max = cars[0].getPosition();
        for (int i = 1; i < cars.length; i++) {
            max = cars[i].findMaxPos(max);
        }
        return max;
    }

    public static String winNameAll(int i, int max, String winName, Car[] cars) {
        if(cars[i].isMaxPos(max)){
            winName += (cars[i].getUserName() + " ");
        }
        return winName;
    }

    public static void finishLine(int i, Car[] cars) {
        if(i < cars.length -1)
            System.out.println();
    }
}
