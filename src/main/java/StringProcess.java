import java.util.ArrayList;

public class StringProcess {
	public ArrayList<String> parseInputString(String inputString){
		ArrayList<String> carNames = new ArrayList<String>();
		String[] subStrings = inputString.split(",");
		for(String subString : subStrings ){
			carNames.add(subString);
		}
		return carNames;
	}
	public ArrayList<String> changeTo_(int value) {
		ArrayList<String> positionBy_ = new ArrayList<String>();
		for (int i = 0; i < value; i++) {
			positionBy_.add("-");
		}
		return positionBy_;
	}
}
