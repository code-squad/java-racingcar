package baseballGame;

import baseballgame.BaseballGame;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {

    @Test
    public void win참(){
        boolean a = BaseballGame.win(3);
        assertThat(a).isTrue();
    }

    @Test
    public void win거짓(){
        boolean a = BaseballGame.win(2);
        assertThat(a).isFalse();
    }

    @Test
    public void 볼체크1(){
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();

        com.add(3);
        com.add(5);
        com.add(7);

        user.add(1);
        user.add(3);
        user.add(2);

        int a = BaseballGame.getBall(com, user);
        assertThat(a).isEqualTo(1);
    }

    @Test
    public void 볼체크2(){
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();

        com.add(3);
        com.add(5);
        com.add(7);

        user.add(3);
        user.add(7);
        user.add(5);

        int a = BaseballGame.getBall(com, user);
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void 볼체크3(){
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();

        com.add(3);
        com.add(5);
        com.add(7);

        user.add(7);
        user.add(3);
        user.add(5);

        int a = BaseballGame.getBall(com, user);
        assertThat(a).isEqualTo(3);
    }

    @Test
    public void 스트라이크1(){
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();

        com.add(3);
        com.add(5);
        com.add(7);

        user.add(3);
        user.add(1);
        user.add(2);

        int a = BaseballGame.getStrike(com, user);
        assertThat(a).isEqualTo(1);
    }

    @Test
    public void 스트라이크3(){
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();

        com.add(3);
        com.add(5);
        com.add(7);

        user.add(3);
        user.add(5);
        user.add(7);

        int a = BaseballGame.getStrike(com, user);
        assertThat(a).isEqualTo(3);
    }

    @Test
    public void 유저중복체크(){
        ArrayList<Integer> user = new ArrayList<>();

        user.add(3);
        user.add(3);
        user.add(1);

        Boolean a =BaseballGame.overlapUserCheck(user);
        assertThat(a).isFalse();
    }

    @Test
    public void 자료형변환(){
        ArrayList<Integer> a = new ArrayList<>();
        String b = "123";

        a = BaseballGame.cutUserNum(b);
        assertThat(a.get(0)).isEqualTo(1);
    }

}
