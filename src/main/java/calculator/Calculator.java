package calculator;

import java.util.*;

import static java.util.Objects.isNull;

public class Calculator {

    private List<String> parsedString;

    private ListIterator<String> iterator;

    public Calculator(String input) {
        this.parsedString = parse(input);
        this.iterator = parsedString.listIterator();
    }

    int calculate() {
        return analysis();
    }

    private int analysis() {
        while (iterator.hasNext()) {
            execute(iterator.next());
        }
        return Integer.parseInt(parsedString.get(0));
    }

    private void execute(String string) {
        if (string.equals("+")) {
            add(getPrevious(), getNext());
        }
        if (string.equals("-")) {
            sub(getPrevious(), getNext());
        }
        if (string.equals("*")) {
            mul(getPrevious(), getNext());
        }
        if (string.equals("/")) {
            div(getPrevious(), getNext());
        }
    }

    private String getPrevious() {
        if (iterator.hasPrevious()) {
            iterator.previous();
            String previous = iterator.previous();
            iterator.remove();
            return previous;
        }
        throw new IllegalArgumentException();
    }

    private String getNext() {
        if (iterator.hasNext()) {
            iterator.next();
            String next = iterator.next();
            iterator.remove();
            return next;
        }
        throw new IllegalArgumentException();
    }

    private void add(String previous, String next) {
        Integer result = Integer.parseInt(previous) + Integer.parseInt(next);
        clearList();
        addCalculatedReulst(result);
    }

    private void sub(String previous, String next) {
        Integer result = Integer.parseInt(previous) - Integer.parseInt(next);
        clearList();
        addCalculatedReulst(result);
    }

    private void mul(String previous, String next) {
        Integer result = Integer.parseInt(previous) * Integer.parseInt(next);
        clearList();
        addCalculatedReulst(result);
    }

    private void div(String previous, String next) {
        Integer result = Integer.parseInt(previous) / Integer.parseInt(next);
        clearList();
        addCalculatedReulst(result);
    }

    private void clearList() {
        iterator.previous();
        iterator.remove();
    }

    private void addCalculatedReulst(Integer result) {
        iterator.add(String.valueOf(result));
    }

    private List<String> parse(String input) {
        if (isNull(input) || input.equals(""))
            throw new IllegalArgumentException();

        return new LinkedList<>(Arrays.asList(input.split(" ")));
    }
}
