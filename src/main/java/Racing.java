import io.Input;
import io.Output;

public class Racing {
    public static void main(String[] args) {
        Racing racing = new Racing();
        racing.setGame();
        racing.run();
        racing.showResult();
    }

    private int[] carPositions;
    private int time;

    public void setGame(){
        int carNum = getUserInputNumber("자동차 대수는 몇 대 인가요?");
        carPositions = new int[carNum];
        time = getUserInputNumber("시도할 회수는 몇 회 인가요?");
    }

    public void run(){
        int carIdx = 0;

        while(!isFinish(carIdx)){
            go(carIdx++);
        }
    }

    public void showResult(){
        Output.printMessage(
                "실행 결과\n" + ResultMessageBuilder.build(carPositions)
        );
    }

    private int getUserInputNumber(String message){
        int userInput = -1;

        while(isInvalidInput(userInput)){
            Output.printMessage(message);
            userInput = Input.getInt();
        }

        return userInput;
    }

    private boolean isInvalidInput(int num){
        return num < 0;
    }

    private void go(int carIdx){
        for(int i=0; i<time; i++){
            int goNum = RacingUtils.getRandomNum();

            if(canGo(goNum)){
                carPositions[carIdx]++;
            }
        }
    }

    private boolean canGo(int goNum){
        return goNum >= 4;
    }

    private boolean isFinish(int carIdx){
        return carIdx == carPositions.length;
    }
}
