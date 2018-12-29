package dots_and_boxes;

import java.util.Iterator;
import java.util.List;

import javafx.util.Pair;

public class Board {
	
	//Members.......
	private int width;
	private int hight;
	private Dot[][] dots;
	public int score_pc =0;
	public int score_player=0;
	
	// Constructor....
	public Board(int hight,int width) {
		//here we put ++width because 
//		for example we have grid 2 * 2
//      it means we have 4 boxes 
		/*
		*---*---*
		|   |   |
		*---*---*
		|   |   |
		*---*---*
		
	to form 4 boxes we need to 9 point '*' 
	and this function parameters is 2,2
	then points will be 3*3 
	
	
		*/
		
		this.width = ++width;
		this.hight= ++hight;
	
		
		
		// Initializing Board Dims.....
		 //this.width = width;
		 //this.hight = hight;
		// Initializing the Boards dots....
		
		dots = new Dot[hight][width];
		// here initialize max number of edge to each point 
		for(int i=0;i < this.width;i++)
			for(int j=0;j < this.hight;j++)
			{
				int coun=0;
				//top connection check
				if(i-1 >= 0 )
					coun++;
				//down connection check
				if(i+1 <= this.width )
					coun++;
				//right connection check
				if(j+1 <= this.hight )
					coun++;
				//left connection check
				if(j-1 >= 0 )
					coun++;
				
				this.dots[i][j]=new Dot(i,j,coun);
	
			}
		
		
		
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<hight; j++) {
				// manipulating corners states....
				if(i == 0 && j == 0) // top left dot
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",false)); // can't..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",false));  // can't...
					dots[i][j].valide_Directions.add(new Pair<>("Down",true)); // can....
				}
				if(i == hight - 1 && j == 0) // Bottom left dot
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",false)); // can't..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",true));  // can...
					dots[i][j].valide_Directions.add(new Pair<>("Down",false)); // can't....
				}
				if(i == 0 && j == width - 1) // top right dot
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",true)); // can..
					dots[i][j].valide_Directions.add(new Pair<>("Right",false)); // can't...
					dots[i][j].valide_Directions.add(new Pair<>("Up",false));  // can't...
					dots[i][j].valide_Directions.add(new Pair<>("Down",true)); // can....
				}
				if(i == hight - 1 && j == width - 1) // bottom right dot
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",true)); // can..
					dots[i][j].valide_Directions.add(new Pair<>("Right",false)); // can't...
					dots[i][j].valide_Directions.add(new Pair<>("Up",true));  // can...
					dots[i][j].valide_Directions.add(new Pair<>("Down",false)); // can't....
				}
				// manipulating sides states.....
				if(j == 0 && (i != 0 || i != hight - 1)) // left side
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",false)); // can't..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",true));  // can...
					dots[i][j].valide_Directions.add(new Pair<>("Down",true)); // can....
				}
				if(j == width - 1 && (i != 0 ||i != hight - 1)) // right side
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",false)); // can't..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",true));  // can...
					dots[i][j].valide_Directions.add(new Pair<>("Down",true)); // can....
				}
				if(i == 0 && (j != 0 || j != width -1)) // up side
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",true)); // can..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",false));  // can't...
					dots[i][j].valide_Directions.add(new Pair<>("Down",true)); // can....
				}
				if(i == hight - 1 && (j != 0 || j != width -1)) // down side
				{
					dots[i][j].valide_Directions.add(new Pair<>("Left",true)); // can..
					dots[i][j].valide_Directions.add(new Pair<>("Right",true)); // can...
					dots[i][j].valide_Directions.add(new Pair<>("Up",true));  // can...
					dots[i][j].valide_Directions.add(new Pair<>("Down",false)); // can't....
				}
			}
		}
		
	}
	
	//Fields........


	public boolean isfinal (Board b) {
		
		for (int i=0;i < this.width; i++)
			for(int j=0;  j < this.hight; j++) {
				
				if(this.dots[i][j].getmax_con()!= this.dots[i][j].connected_Dots.size())
				{
					return false;
				}
			}
	            		
		return true;
	}



	
	
	
	
	public void calc_score(Board b,String player) {
//		player = "human" is human player
//		player ="pc" is PC player
		boolean visited [][] =new boolean [b.hight][b.width];
		for(int i=0;i<b.width;i++)
			for(int j=0;j<b.hight;j++)
				visited[i][j]=false;		
		
		// for each point we are going like circle
		
		for(int i=0;i<b.width;i++)
			for(int j=0;j<b.hight;j++)
			{	
				if(j+1 < this.hight && !visited[i][j+1]&&  dots[i][j].is_connected(i, j+1)   ) //check right
					if(j+1<this.hight && i+1<this.width &&!visited[i+1][j+1] && dots[i][j+1].is_connected(i+1, j+1)  )//then check down 
						if( !visited[i+1][j] && dots[i+1][j+1].is_connected(i+1, j) )//then check left 
							if(!visited[i][j] && dots[i][j].is_connected(i, j+1) ) 
							{					
							   visited[i][j]=true;
							   if(player=="human") this.score_player++;
							   else if(player=="pc") this.score_pc++;
							   
							}
				
				if(i-1 > 0 && !visited[i-1][j]&&  dots[i][j].is_connected(i-1, j)   ) //check UP
					if(j+1 < this.hight  &&!visited[i-1][j+1] && dots[i-1][j].is_connected(i-1, j+1)  )//then check Right 
						if( !visited[i][j+1] && dots[i-1][j+1].is_connected(i, j+1) )//then check Down 
							if(!visited[i][j] && dots[i][j+1].is_connected(i, j) )   //then check Left
							{					
							   visited[i][j]=true;
							   if(player=="human") this.score_player++;
							   else if(player=="pc") this.score_pc++;
							   
							}

				if(j-1 > 0 && !visited[i][j-1]&&  dots[i][j].is_connected(i, j-1)   ) //check Left
					if(i-1 > 0  &&!visited[i-1][j-1] && dots[i][j-1].is_connected(i-1, j-1)  )//then check Up
						if( !visited[i-1][j] && dots[i-1][j-1].is_connected(i-1, j) )//then check Right
							if(!visited[i][j] && dots[i][j+1].is_connected(i, j) )   //then check Down
							{					
							   visited[i][j]=true;
							   if(player=="human") this.score_player++;
							   else if(player=="pc") this.score_pc++;
							   
							}
			
				if(i+1 < this.width && !visited[i+1][j]&&  dots[i][j].is_connected(i+1, j)   ) //check Down
					if(j-1 > 0  &&!visited[i+1][j-1] && dots[i+1][j].is_connected(i+1, j-1)  )//then check Left
						if( !visited[i][j-1] && dots[i+1][j-1].is_connected(i, j-1) )//then check Up
							if(!visited[i][j] && dots[i][j-1].is_connected(i, j) )   //then check Right
							{					
							   visited[i][j]=true;
							   if(player=="human") this.score_player++;
							   else if(player=="pc") this.score_pc++;
							   
							}
			
						}
		
	}//end function calc_score
	
	
	
	
	
	public void add_edge(int x,int y ,int x_end, int y_end) {
		this.dots[x][y].connected_Dots.add( new Pair<>(x_end,y_end) );
	}
	
	
}



