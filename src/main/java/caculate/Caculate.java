package caculate;

import java.util.ArrayList;
import java.util.Queue;

public class Caculate {
    static int caculate(String sentence) {
        String[] list = sentence.split(" ");

        for(int i=0; i<(list.length/2); ++i) {
            ArrayList<String> caculateSentence = new ArrayList();

        }

        /*while(i+2 < list.length-1) {
            //ArrayList<String> caculateSentence = new ArrayList();
            for(int j=0; j<3; ++j)

                caculateSentence.add(list[i]);
            result = operation(caculateSentence.toArray(new String[0]));
            i += 2;
            list[i+2] = result + "";
        }*/

        return operation(list);
    }

    private static int operation(String[] list) {
        String s = list[1];
        if(s.equals("+"))
            return plus(list);
        if(s.equals("-"))
            return subtract(list);
        if(s.equals("*"))
            return multiply(list);
        if(s.equals("/"))
            return division(list);
        return 0;
    }

    private static int plus(String[] list) {
        int first = Integer.parseInt(list[0]);
        int two = Integer.parseInt(list[2]);
        return first + two;
    }

    private static int subtract(String[] list) {
        int first = Integer.parseInt(list[0]);
        int two = Integer.parseInt(list[2]);
        return first - two;
    }

    private static int multiply(String[] list) {
        int first = Integer.parseInt(list[0]);
        int two = Integer.parseInt(list[2]);
        return first * two;
    }

    private static int division(String[] list) {
        int first = Integer.parseInt(list[0]);
        int two = Integer.parseInt(list[2]);
        return first / two;
    }
}
