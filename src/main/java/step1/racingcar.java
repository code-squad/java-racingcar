package step1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class racingcar {

    static Scanner s= new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
    int car = 0;
    int move = 0;

    String behavior = "";

    car = carSn(car);
    move = carMove(move);

        System.out.println("================");
        System.out.println("");

        for(int i=0; i<car; i++) {
        behavior = run(car, move);
    }
}

    public static int carSn(int car) {                          //자동차의 숫자를 입력받는 메서드
        int cars = 0;

        System.out.println("자동차의 숫자를 입력하시오.");
        cars = s.nextInt();

        return cars;
    }//End carSn

    public static int carMove(int move) {                       //자동차를 움직일 횟수를 입력받는 메서드
        int carrun = 0;

        System.out.println("자동차를 움직일 횟수를 입력하시오.");
        carrun = s.nextInt();

        return carrun;
    }//End carMove

    public static String run(int car, int move) {               //자동차의 이동값을 구하는 횟수
        ArrayList<Integer> array = new ArrayList<>();
        String k= "";

        while(array.size() < move) {
            array.add(r.nextInt(9));
		/*	for(Integer ar : array) {		-> 확인용
				System.out.print(ar);
			} */
        }

        for(int i=0; i<move; i++){
            if(array.get(i) >=4) {
                System.out.print("-");
            }
        }

        System.out.println();
        return k;

    } //End run
} //End class