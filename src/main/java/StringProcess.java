import java.util.ArrayList;

public class StringProcess {
	public ArrayList<String> parseInputString(String inputString){
		ArrayList<String> carNames = new ArrayList<String>();
		String[] subString = inputString.split(",");
		for(int i=0; i<subString.length; i++){
			carNames.add(subString[i]);
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
