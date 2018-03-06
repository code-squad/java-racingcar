import io.Output;

import java.util.ArrayList;

public class Racing {
    private ArrayList<Car> carList = new ArrayList<>();
    private int times;

    public void setGame(){
        String playersName = getPlayerInfo();
        setPlayersCar(playersName);

        int cycleTimes = getCycleTimes();
        setCycleTimes(cycleTimes);
    }

    private String getPlayerInfo(){
        return RacingUtils.getUserInputStr("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    private void setPlayersCar(String playersName){
        String[] playerNameArr = RacingUtils.parseUsersName(playersName);

        for(String name : playerNameArr){
            addPlayersCarToList(name);
        }
    }

    private void addPlayersCarToList(String name){
        carList.add(new Car(name));
    }

    private int getCycleTimes(){
        return RacingUtils.getUserInputNumber("시도할 회수는 몇 회 인가요?");
    }

    private void setCycleTimes(int num){
        times = num;
    }


    public void run(){
        int startIdx = 0;

        while(!isFinish(startIdx)){
            doRunLoop(selectCar(startIdx++));
        }
    }

    private Car selectCar(int idx){
        return carList.get(idx);
    }

    private void doRunLoop(Car car){
        for(int i=0; i<times; i++){
            car.run();
        }
    }

    private boolean isFinish(int currentIdx){
        return currentIdx >= carList.size();
    }

    public void showResult(){
        Output.printMessage(
                "실행 결과\n" + ResultMessageBuilder.build(carList)
        );
    }
}
