package dots_and_boxes;

import java.util.*; 
import java.util.ArrayList;
import java.util.List;
/**
 * @author bashar modallal
 *
 */

public class Dot {
	
	
	private int x;
	private int y;
	private int max_num_edge ;
	List < Dot > l = new ArrayList < Dot >(); 

	public Dot(int r,int c,int n) {
		this.x=r;
		this.y=c;
		this.max_num_edge=n;
	}
	

}
