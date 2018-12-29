package dots_and_boxes;

import java.util.*;

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

	
	
	
	public int getmax_con() {return this.max_num_edge;}
	
	
	
	
	
	
	public  boolean is_connected( int x,int y) {
	    Iterator<Pair<Integer, Integer>> iterator = this.connected_Dots.iterator();
	    while (iterator.hasNext()) {
	    	Pair<Integer, Integer> p = iterator.next();
	        if (p.getKey()== x &&p.getValue()== y) {
	            return true ;
	        }
	    }
	    return false;
	}
	
	
	
	
	
	
	public  boolean is_valid(String dir) {
		 boolean res= false;
		 Iterator<Pair<String, Boolean>> iterator = this.valide_Directions.iterator();
		    while (iterator.hasNext()) {
		    	Pair<String, Boolean> p = iterator.next();
		        if (p.getKey() == dir) {
		             res= p.getValue() ;
		        }
		    }
		    return res;
	}
	
}
