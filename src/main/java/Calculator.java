public class Calculator {

    public static int calculate(String leftStr, String operator, String rightStr){

        int left = Integer.parseInt(leftStr);
        int right = Integer.parseInt(rightStr);

        if (leftStr.isEmpty() || operator.isEmpty() || rightStr.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(operator.equals("+")){
            return (left + right);
        }
        if(operator.equals("-")){
            return (left - right);
        }
        if(operator.equals("*")){
            return (left * right);
        }
        if(operator.equals("/")){
            return (left / right);
        }


        return 0;
    }
    public static int run(String s){
        String[] values = s.split(" ");
        String first = values[0];
        for (int i=1; i<values.length -1; i+=2 ){
            int temp = calculate(first, values[i], values[i+1]);
            first = String.valueOf(temp);
        }

        return Integer.parseInt(first);

    }

}