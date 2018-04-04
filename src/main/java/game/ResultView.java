package game;

public class ResultView implements View {

    public static void print(GameResult gameResult) {
        System.out.println("\n실행 결과");
        System.out.println(gameResult.draw());
    }
}
