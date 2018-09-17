package racingcar;

public class Lengthtest {
    public static void main(String[] args) {
        String[] s = {"asd", "asdfee", "zdree"};
        String winner = "";
        winner += ", ";
        winner += "name";
        String[] a = winner.split("");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[5]);

        System.out.println(s[1].length());
    }
}
