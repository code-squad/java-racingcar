package racing;

public class Main {
    public static void main(String[] args) {
        /* 입력값을 받는 부분을 static으로 구현함으로써, 객체 별도 생성할 필요X */
        Racing racing = new Racing(Inputs.getTime(), Inputs.getCarName());
        Inputs.close();
        racing.run();
        racing.printRacingResult();
        racing.printWinners();
    }
}