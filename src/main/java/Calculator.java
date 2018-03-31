public class Calculator {

    public static int calculate(String s){
        String[] values = s.split(" ");
        int first = Integer.parseInt(values[0]);
        int second = Integer.parseInt(values[2]);
        String operator = values[1];

        if(operator.equals("+")){
            return first + second;
        }
        if(operator.equals("-")){
            return first - second;
        }
        if(operator.equals("*")){
            return first*second;
        }
        if(operator.equals("/")){
            return first/second;
        }

        return 0;
    }
}