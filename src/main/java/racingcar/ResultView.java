package racingcar;

public class ResultView {
    int[] carPositions;
    Car[] carArr;

    ResultView(RacingGame game, Car[] carArr){
        this.carPositions = game.carPositions;
        this.carArr = carArr;
    }

    public void output(){
        for (int i = 0; i < carPositions.length; i++) {
            carDist(i);
            finishLine(i);
        }
        winUser();
    }

    public void carDist(int i) {
        System.out.print(carArr[i].name + " : ");
        for (int j = 0; j < carArr[i].position; j++) {
            System.out.print("-");
        }
    }

    private void winUser() {
        int max = carArr[0].position;
        String winName = "";

        for (int i = 1; i < carPositions.length; i++) {
            max = maxChecker(max, i);
        }

        System.out.println();

        for (int i = 0; i < carPositions.length; i++) {
            winName = winNameAll(i, max, winName);
        }

        System.out.println(winName + "가 최종 우승했습니다.");
    }

    private int maxChecker(int max, int i) {
        if(max <= carArr[i].position){
            max = carArr[i].position;
        }
        return max;
    }

    private String winNameAll(int i, int max, String winName) {
        if(carArr[i].position == max){
            winName += (carArr[i].name + "  ");
        }
        return winName;
    }

    public void finishLine(int i) {
        if(i < carPositions.length -1)
            System.out.println();
    }
}
