package dots_and_boxes;

import javafx.util.Pair;

public class Input {
	// Members:
	Pair <Integer, Integer> firstDot, secondDot; // container to receive the Input from the user....
	String playerName;
	
	//Default constructor
	public Input() {
		// pass 
	}
	
	//Fields:
	private void insertName(String name) {
		this.playerName = name;
	}
	private void insertCoordinates(int x1, int y1, int x2, int y2) {
		this.firstDot = new Pair<Integer, Integer >(x1, y1); // get first dot...
		this.secondDot = new Pair<Integer, Integer>(x2, y2); // get second dot...		
	}
	
	private String getName() {
		return this.playerName;
	}
	
	private int getFirstX() {
		return this.firstDot.getKey();
	}

	private int getSecondX() {
		return this.secondDot.getKey();
	}
	
	private int getFirstY() {
		return this.secondDot.getKey();
	}
	
	private int getSecondY() {
		return this.secondDot.getKey();
	}
}
