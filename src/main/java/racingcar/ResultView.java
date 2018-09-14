package racingcar;

public class ResultView {
    public static void output(int [] carPos, Car[] carArr){
        for (int i = 0; i < carPos.length; i++) {
            carDist(i, carArr);
            finishLine(i, carArr);
        }
        winUser(carArr);
    }

    public static void carDist(int i, Car[] carArr) {
        System.out.print(carArr[i].getUserName() + " : ");
        for (int j = 0; j < carArr[i].getPosition(); j++) {
            System.out.print("-");
        }
    }

    public static void winUser(Car[] carArr) {
        int max = carArr[0].getPosition();
        String winName = "";
        for (int i = 1; i < carArr.length; i++) {
            max = maxChecker(max, i, carArr);
        }
        System.out.println();
        for (int i = 0; i < carArr.length; i++) {
            winName = winNameAll(i, max, winName, carArr);
        }
        System.out.println(winName + "가 최종 우승했습니다.");
    }

    public static int maxChecker(int max, int i, Car[] carArr) {
        if(max <= carArr[i].getPosition()){
            max = carArr[i].getPosition();
        }
        return max;
    }

    public static String winNameAll(int i, int max, String winName, Car[] carArr) {
        if(carArr[i].getPosition() == max){
            winName += (carArr[i].getUserName() + "  ");
        }
        return winName;
    }

    public static void finishLine(int i, Car[] carArr) {
        if(i < carArr.length -1)
            System.out.println();
    }
}
