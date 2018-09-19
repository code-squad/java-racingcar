package race;

public class RacingMain {
    public static void main(String[] args) {
        String[] nameArr = InputView.inputName().split(",");            //이름가져와서 쪼개서 이름배열에 넣은다.
        int tryCount = InputView.inputCount();                                 //사용자가 입력한 시도횟수를 넣는다.
        CarRacing race = new CarRacing(nameArr.length);                        //인스턴스 배열길이를 이름의 배열길이 만큼 생성한다.
        race.makeCar(nameArr);                                                 //5번에서 만든 이름배열을 인스턴스 배열에 있는 인스턴스에 이름을 부여한다.
        race.transport(tryCount);                                              //인스턴스 배열의 위치값을 구한다.
        race.valuePrint();                                                     //인스턴스 위치값을 dash("-")로 출력
        int max = race.maxSet();
        ResultView.victory(race.result(max));
    }
}
