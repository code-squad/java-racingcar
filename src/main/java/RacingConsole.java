public class RacingConsole {
    public static void main(String[] args) {
        RacingConsole.start();
    }

    static void start(){
        Racing racing = new Racing();
        racing.setGame();
        racing.run();
        racing.showResult();
    }
}
