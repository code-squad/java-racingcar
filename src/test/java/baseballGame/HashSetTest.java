package baseballGame;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<Integer>(a);
        ArrayList<Integer> c = new ArrayList<Integer>(b);

        System.out.println(c);
    }
}
