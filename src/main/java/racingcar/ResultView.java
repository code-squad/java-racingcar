package racingcar;

public class ResultView {
    public static void printResult(RacingGame racingGame){
        System.out.println(racingGame.output() + "가 최종 우승했습니다.");
    }

    public static void printDesh(){
        System.out.print("-");
    }

    public static void finishLine(int i, int carsLen) {
        if(i < carsLen -1)
            System.out.println();
    }

    public static void carDist(int i, Car[] cars) {
        System.out.print(cars[i].getUserName() + " : ");
        cars[i].desh();
    }

}
