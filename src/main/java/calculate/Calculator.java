package calculate;

import java.util.LinkedList;
import java.util.Deque;

public class Calculator {
    static String calculate(String sentence) {
        return betweenCal(transeQueue(sentence));
    }

    private static String betweenCal(Deque<String> que) {
        String[] caculateText = new String[3];
        while (que.size() > 2) {
            caculateText[0] = que.poll();
            caculateText[1] = que.poll();
            caculateText[2] = que.poll();

            que.addFirst(operation(caculateText) + "");
        }

        return que.poll();
    }

    private static Deque<String> transeQueue(String sentence) {
        String[] list = sentence.split(" ");
        Deque<String> que = new LinkedList();
        for (String s : list) {
            que.offer(s);
        }
        return que;
    }

    private static int operation(String[] list) {
        String s = list[1];
        int first, two;
        try {
            first = Integer.parseInt(list[0]);
            two = Integer.parseInt(list[2]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(); //int형 아닌 다른값
        };

        if(s.equals("+"))
            return plus(first, two);
        if(s.equals("-"))
            return subtract(first, two);
        if(s.equals("*"))
            return multiply(first, two);
        if(s.equals("/"))
            return division(first, two);

        throw new RuntimeException(); //잘못된 연산기호

    }

    private static int plus(int first, int two) {
        return first + two;
    }

    private static int subtract(int first, int two) {
        return first - two;
    }

    private static int multiply(int first, int two) {
        return first * two;
    }

    private static int division(int first, int two) {
        return first / two;
    }

}


