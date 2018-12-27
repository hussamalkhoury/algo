/**
 * 
 */
package dots_and_boxes;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * @author bashar modallal
 *
 */
public class Edge {
	
	private int x;
	private int y;
	List < Dot > l = new ArrayList < Dot >(); 

	
	public Edge(int r,int c ,Dot D) {
	  this.x=r;
	  this.y=c;
	  this.l.add(D);

   }
}