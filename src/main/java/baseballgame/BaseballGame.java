package baseballgame;

import java.util.*;

public class BaseballGame {

    public static final int MAX_NUM = 3;
    public static final int RANDOM_MAX = 9;
    public static final int RANDOM_MINIMUM = 1;
    public static final int CUT_NUM = 10;

    static Scanner s = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> com = new ArrayList<Integer>(getCom());
        game(com);
    }

    public static ArrayList<Integer> getCom() {
        ArrayList<Integer> getCom = new ArrayList<>();
        getCom.addAll(overlapCheck(maxRandom()));
        return getCom;
    }

    private static ArrayList<Integer> maxRandom() {
        ArrayList<Integer> com = new ArrayList<>();
        for (int i = 0; i < MAX_NUM; i++) {
            com.add(r.nextInt(RANDOM_MAX) + RANDOM_MINIMUM);
        }
        return com;
    }

    public static ArrayList overlapCheck(ArrayList<Integer> input) {
        HashSet<Integer> check = new HashSet<>(input);
        while (check.size() != 3) {
            check.clear();
            check.addAll(maxRandom());
        }
        input.clear();
        input.addAll(check);
        return input;
    }

    public static ArrayList<Integer> getUser() {
        ArrayList<Integer> getUser = new ArrayList<>();
        getUser = cutUserNum(userInput());
        Boolean isCheck = overlapUserCheck(getUser);

        while (isCheck == false) {
            System.out.println("숫자가 잘못되었습니다.");
            getUser.clear();
            getUser = cutUserNum(userInput());
            isCheck = overlapUserCheck(getUser);
        }
        return getUser;
    }

    public static String userInput() {                      //유저값 입력
        System.out.println("1~9까지의 숫자를 입력하세요(중복불가)");
        return s.next();
    }

    public static ArrayList<Integer> cutUserNum(String user) {                    //user값 중복 제거
        ArrayList<Integer> cutUser = new ArrayList<>();
        int input = Integer.parseInt(user);
        while (cutUser.size() < MAX_NUM) {
            cutUser.add(input % CUT_NUM);
            input /= CUT_NUM;
        }
        Collections.reverse(cutUser);
        return cutUser;
    }

    public static Boolean overlapUserCheck(ArrayList<Integer> input) {
        HashSet<Integer> check = new HashSet<>(input);
        Boolean isCheck = false;
        if (check.size() == 3) {
            isCheck = true;
        }
        return isCheck;
    }
    // 자리수 비교
    public static int getStrike(ArrayList<Integer> com, ArrayList<Integer> user) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (com.get(i) == user.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public static boolean ball(ArrayList<Integer> com, ArrayList<Integer> user, int index) {
        boolean ck = false;
        for (int i = 0; i < 3; i++) {
            if (com.get(i) == user.get(index) && i != index) {
                ck = true;
            }
        }
        return ck;
    }

    public static int getBall(ArrayList<Integer> com, ArrayList<Integer> user) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (ball(com, user, i)) {
                ball++;
            }
        }
        return ball;
    }

    public static boolean win(int strike) {
        boolean win = false;
        if (strike == 3) {
            win = true;
            System.out.println("you win!");
        }
        return win;
    }

    public static int bbInstens(ArrayList<Integer> com, ArrayList<Integer> user) {
        int strike = getStrike(com, user);
        int ball = getBall(com, user);
        System.out.println("스트라이크 : " + strike + ", 볼 : " + ball);
        return strike;
    }

    public static void game(ArrayList<Integer> com) {
        int strike = 0;
        while (strike != 3) {
            ArrayList<Integer> input = getUser();
            strike = bbInstens(com, input);
            win(strike);
        }
    }
}
