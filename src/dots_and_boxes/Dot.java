package dots_and_boxes;

import java.util.*; 
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
/**
 * @author bashar modallal
 *
 */

public class Dot {
	
	
	
	private int max_num_edge ;
	Pair <Integer, Integer> location; // x , y for the dot it self.
	List < Pair<Integer, Integer>> connected_Dots;
	List <Pair<String, Boolean>> valide_Directions; //this list will be filled-(In Board Class )-after setting the board to determine the way of connecting.
	public Dot(int r,int c,int n) {
		// Adding the dot location....
		location = new Pair<>(r, c);
		// Initializing the max number of connecting capacity.....
		this.max_num_edge=n;
	}
	

}
