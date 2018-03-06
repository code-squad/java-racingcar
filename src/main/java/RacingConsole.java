import io.Input;
import io.Output;

public class RacingConsole {
    public static void main(String[] args) {
        RacingConsole.start();
    }

    static void start(){
        Racing racing = new Racing();
        racing.setPlayersCar(getPlayerNames());
        racing.setCycleTimes(getCycleTimes());
        racing.run();
        racing.showResult();
    }

    private static String getPlayerNames(){
        String names = "";

        while(isInvalidNames(names)){
            Output.printMessage("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            names = Input.getString();
        }
        return names;
    }

    private static boolean isInvalidNames(String str){
        return str == null || str.isEmpty();
    }

    private static int getCycleTimes(){
        int times = -1;

        while(isInvalidCycleTimes(times)){
            Output.printMessage("시도할 회수는 몇 회 인가요?");
            times = Input.getInt();
        }

        return times;
    }

    private static boolean isInvalidCycleTimes(int num){
        return num < 0;
    }
}
