/**
 * 
 */
package dots_and_boxes;
import javafx.util.Pair;


import java.util.*; 

/**
 * @author bashar mod
 *
 */
public class Game {

	/**
	 * 
	 */
	 List < Pair<Integer, Integer>> connected_Dots;

	public Game() {
		
	}
	public static boolean find( int x,int y, List<Pair<Integer, Integer>> connected_Dots) {
			    Iterator<Pair<Integer, Integer>> iterator = connected_Dots.iterator();
			    while (iterator.hasNext()) {
			    	Pair<Integer, Integer> p = iterator.next();
			        if (p.getKey()== x &&p.getValue()== y) {
			            return true ;
			        }
			    }
			    return false;
  			}
	 
	public static void main(String[] args) {
//		 List < Pair<Integer, Integer>> connected_Dots =new ArrayList();

//		Pair<Integer, String> pai = new Pair<>(1, "One");
//		Integer key = pai.getKey();
//		String value = pai.getValue();
//		System.out.println(key +"  "+ value);
		
//		connected_Dots.add(new Pair<>(1,2)); 
//		connected_Dots.add(new Pair<>(2,1)); 
//		connected_Dots.add(new Pair<>(3,4));  
//		connected_Dots.add(new Pair<>(5,6));
//		
//		if(find(5,6,connected_Dots)) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("not");
//
//		}
//		int []arr=new int [6];
//		for(int i=0;i<6;i++) {
//		arr[i]=i;
//		}
//		for(int i=0;i<2;i++) {
//		System.out.print(arr[i]+" ");	
//		}
//		
//		for(int i=0;i<6;i++) {
//		 if(true && i>3 && arr[7]==12 ) {
//			 System.out.println("done");
//		 }
//		}
			
	String s="ss";
	if(s =="sss")
	System.out.println("asd");
	}

}
