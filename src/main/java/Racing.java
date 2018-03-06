import io.Output;

import java.util.ArrayList;

public class Racing {
    private ArrayList<Car> carList = new ArrayList<>();
    private int times;

    public void setPlayersCar(String playersName){
        String[] playerNameArr = RacingUtils.parseUsersName(playersName);

        for(String name : playerNameArr){
            addPlayersCarToList(name);
        }
    }

    private void addPlayersCarToList(String name){
        carList.add(new Car(name));
    }

    public void setCycleTimes(int num){
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
            int goNum = RacingUtils.getRandomNum();
            car.run(goNum);
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
