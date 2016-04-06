package DungeonGame1;


/**
 * Title:       EnemyCharacter.java
 * Description:
 * 
 * @author:     SWAG
 * 
 * @version:    1.0
 * 
 */

public class EnemyCharacter {

	int health;  //Health of the enemy
	int attack;  //Attack of the enemy
	String name;  //Name of the enemy
	
	
	//The constructor of EnemyCharacter which takes a string for the name, an integer for the amount of health and an integer for the attack
	public EnemyCharacter(String name, int health, int attack){
		this.health = health;
		this.attack = attack;
		this.name = name;
		
	}
	
	//This method returns the value for attack 
    public int getAttack(){
		return attack;
	}
    
    //This method returns the amount of hp left for the enemy
    public int getHealth(){
    	return health;
    }
    
    //This method removes the amount of damage taken by the userHeros during combat
    public void setHealth(int damage){
    	health -= damage;
    }
    
    //This method returns the string name of the enemy
    public String getName(){
    	return name;
    }
	

}
