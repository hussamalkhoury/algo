package dots_and_boxes;

import java.util.*; 
import java.util.ArrayList;
import java.util.List;
/**
 * @author bashar modallal
 *
 */

public class Dot {
	
	
	Pair <Integer, Integer> location;
	private int max_num_edge ;
	List < Dot > l = new ArrayList < Dot >(); 

	public Dot(int r,int c,int n) {
		location = new Pair<r, c>;
		this.max_num_edge=n;
	}
	

}
