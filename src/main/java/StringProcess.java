import java.util.*;

public class StringProcess {
	public List<String> parseInputString(String inputString){
		List<String> carNames = new ArrayList<String>();
		String[] subStrings = inputString.split(",");
		for(String subString : subStrings ){
			carNames.add(subString);
		}
		return carNames;
	}
	public List<String> changeTo_(int value) {
		List<String> positionBy_ = new ArrayList<String>();
		for (int i = 0; i < value; i++) {
			positionBy_.add("-");
		}
		return positionBy_;
	}
}
