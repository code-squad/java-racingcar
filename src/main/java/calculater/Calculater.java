package calculater;

import java.util.HashMap;
import java.util.Map;

public class Calculater {
	static private Map<String,Operator> operatorMap = new HashMap<>();
	static private double result = 0;
	
	static {
		operatorMap.put("+", new PlusOperator());
		operatorMap.put("-", new MinusOperator());
		operatorMap.put("*", new MultiplyOperator());
		operatorMap.put("/", new DivisionOperator());
	}
	
	static public double calculate(String fomula) {
		String[] valueList = fomula.split(" ");
		result = Integer.parseInt(valueList[0]);
		
		for(int i=1; i<valueList.length; i = i+2) {
			result = operatorMap.get(valueList[i]).operate(result, Integer.parseInt(valueList[i+1]));
		}
		
		return result;
	}
}
