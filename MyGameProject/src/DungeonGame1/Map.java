package DungeonGame1;

/**
 * Title:       Map.java
 * Description:
 * 
 * @author:     SWAG
 * 
 * @version:    1.0
 * 
 */

public class Map {

	
	    //Changed the modifier of mapArray to public. UPDATE UML!!!!
		public Rooms[][] mapArray = new Rooms[12][12];  //This creates the map as an array of rooms
		
		private int numOfEnemies;  //Initializes the integer variable of numOfEnemies 
		
		//This is the constructor Of map. it takes an amount of enemies set in the main 
		public Map(int numOfEnemies){
			
			//Sets the number of enemies in the map
			this.numOfEnemies = numOfEnemies; 
		
			//This fills the rooms with the right properties
			this.initializeMap();
		}
		
		
		//This method is called to print the map in a string format
		void printMapArray(){
			
			//This prints the map
			for (int i =0; i < mapArray.length;i++){
				for (int j = 0; j < mapArray[i].length; j++)
					System.out.print(mapArray[i][j].printCell());
				  
			    System.out.println();
			 }
			
		}
		
		
		
		//This method creates the walls(fixed), enemies(varies) and the ending(fixed)
		private void initializeMap(){
			
			//vertical left
			for(int i = 0; i < mapArray.length; i++)
				mapArray[i][0] = new Rooms(false, false, false, "[ ]");
			
		
			//vertical right
			for(int i = 0; i < mapArray.length; i++)
				mapArray[i][mapArray[i].length - 1] = new Rooms(false, false, false, "[ ]");
			
			
			//horizontal up
			for(int i = 0; i < mapArray[0].length; i++)
				mapArray[0][i] = new Rooms(false, false, false, "[ ]");
			
			
			//horizontal down
			for(int i = 0; i < mapArray[mapArray.length - 1].length; i++)
				mapArray[mapArray.length - 1][i] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #1 column
			for(int i = 1; i < mapArray.length - 2; i++)
				mapArray[i][2] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #2 row
			for(int i = 3; i < mapArray[9].length - 2; i++)
				mapArray[9][i] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #3 row
			for(int i = 4; i < mapArray[7].length; i++)
				mapArray[7][i] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #4 column
			for(int i = 2; i < mapArray.length - 4; i++)
				mapArray[i][4] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #5 column
			for(int i = 1; i < mapArray.length - 6; i++)
				mapArray[i][6] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #6 column
			for(int i = 2; i < mapArray.length - 4; i++)
				mapArray[i][8] = new Rooms(false, false, false, "[ ]");
			
			
			//wall #7 row
			for(int i = 9; i < mapArray[2].length - 2; i++)
				mapArray[2][i] = new Rooms(false, false, false, "[ ]");
			
			
			//wall#8 row
			for(int i = 10; i < mapArray[4].length - 1; i++)
				mapArray[4][i] = new Rooms(false, false, false, "[ ]");
			
			
			//Starting point
			mapArray[1][1] = new Rooms(true, false, false, "\\0/");
			
			//end point
			mapArray[6][10] = new Rooms(true, true, false, "{0}");
			
			
		
			int EnemyCount = 0;
			while(EnemyCount < numOfEnemies ){ // The number in the condition is the number of enemies that will appear on the map (cannot be more than 57)
				int a = (int)(1 + Math.random() * 10);
				int b = (int)(1 + Math.random() * 10);
				
				
				//Checks to not put any enemies at the starting point and in a bloc
			    if(mapArray[a][b] == null){
					mapArray[a][b]  = new Rooms(true, false, true, " X ");
					EnemyCount++;	
				}
			}
			
			
			for(int i = 0; i < mapArray.length; i++)
				for(int k = 0; k < mapArray[i].length; k++)
					if(mapArray[i][k] == null)
						mapArray[i][k] = new Rooms(true, false, false, "   ");
			
			
		}
		

}
