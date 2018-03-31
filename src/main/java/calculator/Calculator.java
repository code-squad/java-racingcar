package calculator;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

/*
    사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
    문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
    예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
    */

    public String input(String inputValue){
        String[] aa = inputValue.split(" ");
        List<Integer> numb = new ArrayList<>();
        String value="";
        String pin ="";

        for (int i = 0; i < aa.length ; i++) {
            System.out.println("전체"+ aa[i] );
            if(i % 2 != 0){
                System.out.println("aa[i]" + aa[i]);
                pin= aa[i];
               // numb.add(Integer.parseInt(aa[i]));
           }else{
                numb.add(Integer.parseInt(aa[i]));
                System.out.println("숫자aa[i] :" + aa[i]);
            }
        }

        if(pin.equals("+")){
            System.out.println("더하기" +numb.get(0) +"//"+ numb.get(1) );
            value = String.valueOf(sum(numb.get(0),numb.get(1)));

        }
        if(pin.equals("*")){
            System.out.println("곱하기" +numb.get(0) +"//"+ numb.get(1) );
            value = String.valueOf(multi(numb.get(0),numb.get(1)));

        }
        if(pin.equals("/")){
            System.out.println("나누기" +numb.get(0) +"//"+ numb.get(1) );
            value = String.valueOf(divide(numb.get(0),numb.get(1)));

        }
        if(pin.equals("-")){
            System.out.println("빼기" +numb.get(0) +"//"+ numb.get(1) );
            value = String.valueOf(minus(numb.get(0),numb.get(1)));

        }


        return value;
    }


    public int sum(int a, int b){

        return a+b;
    }
    public int minus(int a, int b) {
        return a-b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int multi(int a, int b) {
        return a*b;
    }
}
