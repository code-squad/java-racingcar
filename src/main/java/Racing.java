import io.Output;

import java.util.ArrayList;

public class Racing {
    private ArrayList<Car> carList = new ArrayList<>();
    private int times;

    public void setGame(){
        initCarInfo();
        initTimes();
    }

    private void initCarInfo(){
        String usersName = RacingUtils.getUserInputStr("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] userNameArr = RacingUtils.parseUsersName(usersName);

        for(String userName : userNameArr){
            carList.add(new Car(userName));
        }
    }

    private void initTimes(){
        times = RacingUtils.getUserInputNumber("시도할 회수는 몇 회 인가요?");
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
