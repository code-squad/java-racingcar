package racingcar;

public class ResultView {
    public static void printResult(RacingGame racingGame){
        System.out.println(racingGame.output() + "가 최종 우승했습니다.");
    }

    public static void printDesh(){
        System.out.print("-");
    }
}
