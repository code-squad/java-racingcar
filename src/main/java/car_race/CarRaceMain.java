package car_race;

import java.util.List;

public class CarRaceMain {

	public static void main(String[] args) {
		CarRace race = new CarRace();
		List<Integer> userInput = race.generateInput();

		//for each car:
		for(int car = 0; car < userInput.get(0); car++) {
			System.out.println("");
			
			//for each move:
			for(int move = 0; move < userInput.get(1); move++) {
				
				//generate random number
				int randNum = race.generateRandNum();
				
				//print result
				if(randNum > 4) {System.out.print("-");}	
			}
			
		}


	}

}
