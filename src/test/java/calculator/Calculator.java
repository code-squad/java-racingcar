package calculator;

import java.util.Stack;

public class Calculator {
    public Stack<Integer> numbers = new Stack<>();
    public Stack<String> operators = new Stack<>();

    public void start(String s){
        String[] expression = s.split(" ");
        for(int i = expression.length-1; i >= 0; i-=2){
            numbers.push(Integer.parseInt(expression[i]));
        }
        for(int i = expression.length-2; i >= 0; i-=2){
            operators.push(expression[i]);
        }
    }

    public int calculate(){
        while (!operators.empty()){
            this.selectOperator(operators.pop());
        }
        return(numbers.pop());
    }

    public void add(){
        numbers.push(numbers.pop() + numbers.pop()) ;
    }
    public void sub(){
        numbers.push(numbers.pop() - numbers.pop()) ;
    }
    public void multi(){
        numbers.push(numbers.pop() * numbers.pop()) ;
    }
    public void div(){
        numbers.push(numbers.pop() / numbers.pop()) ;
    }

    public void selectOperator(String op){
        if(op.equals("+")){
            this.add();
            return;
        }
        if(op.equals("-")){
            this.sub();
            return;
        }
        if(op.equals("*")){
            this.multi();
            return;
        }
        if(op.equals("/")){
            this.div();
            return;
        }
    }
}
