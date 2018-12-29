/**
 * 
 */
package dots_and_boxes;
import javafx.util.Pair;


import java.util.*; 

/**
 * @author Bashar Modallal
 *
 */
public class Game {


	public Game() {
		
	}
	 
	
	public static int minimax(Board b, int depth , String player) {
		
		//stop condition 
		if(b.isfinal()) {
			
		}
		// move to all  point 
		for(int i=0; i<b.width;i++)
			for(int j=0;j<b.hight;j++) {
				
				if(j+1<b.hight && ! b.dots[i][j].is_connected(i,j+1 )) {
					b.add_edge(i, j, i, j+1);
					//calculate scores to decide turn who after this move
					b.calc_score("pc");
					//recursion
					
					//backtracking 
					b.delete_edge(i, j, i, j+1 );
				}
				if(j-1 > 0  && ! b.dots[i][j].is_connected(i,j-1 )) {
					
					
				}
				if(i+1<b.width &&! b.dots[i][j].is_connected(i+1,j )) {
					
					
				}
				if(i-1 > 0  && ! b.dots[i][j].is_connected(i-1,j )) {
					
					
				}
				
				
				
				
				
				
			}
		
		
		
		
		
		return 0;
	}
	public static void main(String[] args) {
		List<Pair< Integer, Integer>> s = new ArrayList<Pair<Integer, Integer>>();
		s.add( new  Pair<>(2,3));
		s.add(new Pair<>(4,3));
		s.add(new Pair<>(5,6));
		s.remove(1);
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i).getKey());
		
		
	}

}


































//List < Pair<Integer, Integer>> connected_Dots =new ArrayList();

//Pair<Integer, String> pai = new Pair<>(1, "One");
//Integer key = pai.getKey();
//String value = pai.getValue();
//System.out.println(key +"  "+ value);

//connected_Dots.add(new Pair<>(1,2)); 
//connected_Dots.add(new Pair<>(2,1)); 
//connected_Dots.add(new Pair<>(3,4));  
//connected_Dots.add(new Pair<>(5,6));
//
//if(find(5,6,connected_Dots)) {
//	System.out.println("found");
//}
//else {
//	System.out.println("not");
//
//}
//int []arr=new int [6];
//for(int i=0;i<6;i++) {
//arr[i]=i;
//}
//for(int i=0;i<2;i++) {
//System.out.print(arr[i]+" ");	
//}
//
//for(int i=0;i<6;i++) {
//if(true && i>3 && arr[7]==12 ) {
//	 System.out.println("done");
//}
//}


//public static boolean find( int x,int y, List<Pair<Integer, Integer>> connected_Dots) {
//Iterator<Pair<Integer, Integer>> iterator = connected_Dots.iterator();
//while (iterator.hasNext()) {
//	Pair<Integer, Integer> p = iterator.next();
//    if (p.getKey()== x &&p.getValue()== y) {
//        return true ;
//    }
//}
//return false;
//}
