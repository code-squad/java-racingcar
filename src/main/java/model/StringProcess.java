package model;
import java.util.*;

public class StringProcess {
	// 인스턴스 변수 없기때문에 static 으로 구현가능.
	public static List<String> parseInputString(String inputString){
		List<String> carNames = new ArrayList<String>();
		String[] subStrings = inputString.split(" ");
		for(String subString : subStrings ){
			carNames.add(subString);
		}
		return carNames;
	}
	public static String changeTo_(int value) {
		String positionBy_ = "";
		for (int i = 0; i < value; i++) {
			positionBy_ += "-";
		}
		return positionBy_;
	}
}
