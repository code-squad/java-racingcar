package stringcalculator;


import java.util.*;

public class StringCalculator extends Calculator {
    private Queue<Integer> numQueue;
    private Queue<String> operatorQueue;


    public StringCalculator() {
        this.numQueue = new LinkedList<Integer>();
        this.operatorQueue = new LinkedList<String>();
    }

    public String[] makeArr(String str) {
        return str.split(" ");
    }

    // 숫자전에 사칙연산 기호가 오는 경우는 고려하지 않음
    public int run(String str) {
        String[] values = makeArr(str);
        for (String s : values) {
            checkValue(s);
            if (this.numQueue.size() == 2) {
                calculate(this.operatorQueue.poll(), this.numQueue.poll(), this.numQueue.poll());
            }
        }
        return this.numQueue.poll();
    }

    public void checkValue(String value) {
        if (isNum(value)) {
            this.numQueue.offer(Integer.parseInt(value));
        } else {
            this.operatorQueue.offer(value);
        }
    }

    public void calculate(String operator, int a, int b) {
        switch (operator) {
            case "+": this.numQueue.offer(add(a, b)); break;
            case "-": this.numQueue.offer(subtract(a, b)); break;
            case "*": this.numQueue.offer(multiplay(a, b)); break;
            case "/": this.numQueue.offer(divide(a, b)); break;
        }
    }

    public boolean isNum(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
