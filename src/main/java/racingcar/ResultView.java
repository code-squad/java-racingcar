package racingcar;


import java.util.ArrayList;

public class ResultView {

    private static final String OUT_COMMMA = "-";

    public static void printResult(RacingGame rg){
        ArrayList<Car> cars = rg.getCars();

        printRun(cars);
       // win(cars);
    }

    public static void printRun(ArrayList<Car> cars) {                  //출력
        System.out.println("출력 결과");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + " : ");
            checkRun(cars.get(i).getMoveMax());
            System.out.println();
        }
        System.out.println();
    }

    public static void checkRun(int num) {
        for (int i = 0; i < num; i++)
            System.out.print(OUT_COMMMA);
    }

   /* private void win(ArrayList<Car> cars) {                     //최종값 출력
        int num = 0;
        for (int i = 0; i < cars.size(); i++) {
            num = getNum(num, i);
        }
        winCheck(num);
    }

    private int getNum(ArrayList<Car> cars , int num, int i) {
        if (num < cars.get(i).getMoveMax()) {
            num = cars.get(i).getMoveMax();
        }
        return num;
    }

    private void winCheck(int num) {
        ArrayList<String> winner = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            winCheckMax(num, winner, i);
        }
        System.out.println(String.join(",", winner) + " 최종 우승자 입니다.");
    }

    private void winCheckMax(int num, ArrayList<String> winner, int i) {
        if (num == cars.get(i).getMoveMax()) {
            winner.add(cars.get(i).getName());
        }
    }*/

}
