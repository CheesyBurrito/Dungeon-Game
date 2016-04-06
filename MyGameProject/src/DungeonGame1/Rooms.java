package DungeonGame1;

/**
 * Title:       Rooms.java
 * Description:
 * 
 * @author:     SWAG
 * 
 * @version:    1.0
 * 
 */

public class Rooms {
	
	    //UPDATE UML!!!!
		private String cell = "   ";
		private boolean isEnemy = false;
		private boolean canGo = true;
		private boolean isEnd = false;
		
		
		//Changed to static. UPDATE UML!!!!
		static private int heroPostionX = 1;
		static private int heroPostionY = 1;
		
		
		Rooms(boolean canGo, boolean isEnd, boolean isEnemy, String cell){
			this.canGo = canGo;
			this.isEnd = isEnd;
			this.isEnemy = isEnemy;
			this.cell = cell;
		}
		
		
		//This sets the user's current position on the map
		public void setHeroPosition(){
			cell = "\\O/";
		}
		
		
		//This method is used to sets the hero current row
		public void setHeroPositionX(int x){
			heroPostionX = x;
		}
		
		//This method is used to set the hero's current column
		public void setHeroPositionY(int y){
			heroPostionY = y;
		}
		
		//This method returns the hro's current row
		public int getHeroPositionX(){
			return heroPostionX;
		}
		
		//This method returns the hero's current column
		public int getHeroPositionY(){
			return heroPostionY;
		}
		
		//This method is used to remove the string of the last location of the hero on the map 
		public void setBlankcell(){ 
			cell = "   ";
		}
		
		//This method prints the current room as a string either it is empty has an enemy or is a bloc
		public String printCell(){
			return cell;
		}
		
		//This method returns the boolean variable canGo to know if it is possible for the hero to go in this room
		public boolean getCanGo(){
			return canGo;
		}
		
		//This method returns the boolean variable isEnemy to start the fight if there is an enemy in the hero's current room
		public boolean getIsEnemy(){
			return isEnemy;
		}
		
		//This method removes the enemies from the current room 
		public void removeEnemy(){
			isEnemy = false;
			cell = "  ";
			
		}
		
		
		//This method returns the boolean variable isEnd to know if the user has reached the end of the dungeon 
		public boolean getIsEnd(){
			return isEnd;
		}
		
		
		
		
		
}
