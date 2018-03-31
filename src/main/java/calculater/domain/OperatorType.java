package calculater.domain;

import java.util.Arrays;

public enum OperatorType {
	PLUS("+"){double operate(double value1, double value2) {return value1+value2;}}
	,MINUS("-"){double operate(double value1, double value2) {return value1-value2;}}
	,MULTIPLY("*"){double operate(double value1, double value2) {return value1*value2;}}
	,DIVIDE("/"){double operate(double value1, double value2) {return value1/value2;}}
	;
	
	private String operatorSymbol;
	
	OperatorType(String operatorSymbol) {
		this.operatorSymbol = operatorSymbol;
	}
	
	public String getOperatorSymbol() {
		return operatorSymbol;
	}
	
	public boolean hasOperatorSymbol(String symbol) {
		return operatorSymbol.equals(symbol);
	}
	
	abstract double operate(double value1, double value2);
	
	public static OperatorType findBySymbol(String symbol){
		return Arrays.stream(OperatorType.values())
				.filter(operator -> operator.hasOperatorSymbol(symbol))
				.findAny()
				.orElseThrow(()->new IllegalArgumentException("입력한 symbol이 잘못되었습니다"));
	}
}
