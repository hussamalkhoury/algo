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
	List < Pair<Integer, Integer>> connected_Dots = new ArrayList < Pair<Integer, Integer>>(); 
	List <Pair<String, Boolean>> valide_Directions = new ArrayList<Pair<String, Boolean>>(); //this list will be filled after setting the board to determine the way of connecting.
	public Dot(int r,int c,int n) {
		connected_Dots.add(new Pair<>(r, c));
		this.max_num_edge=n;
	}
	

}
