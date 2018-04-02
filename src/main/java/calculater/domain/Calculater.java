package calculater.domain;

public class Calculater {
	private static double result = 0;
	
	public static double calculate(String fomula) {
		String[] valueList = fomula.split(" ");
		result = Integer.parseInt(valueList[0]);
		
		for(int i = 1, length = valueList.length; i < length; i += 2) {
			result = OperatorType.findBySymbol(valueList[i])
								.operate(result, Integer.parseInt(valueList[i + 1]));
		}
		
		return result;
	}
}
