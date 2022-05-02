package fighters;

import java.lang.Math;
import framework.BattleField;
import framework.Random131;

/* This is the class that creates a soldier to fight in a battlefield, and
 *  tells the soldier what to do and where to move to.*/

public class BasicSoldier {

	// Sets the health of the soldier to 25
	public final static int INITIAL_HEALTH = 25; 
	
	// Sets the amount of protection a soldier will have to 25	
	public final static int ARMOR = 25;
	
	// Sets the strength of a soldier to 25
	public final static int STRENGTH = 25;
	
	// Sets the skill a soldier will have to 25
	public final static int SKILL = 25; 

	// Sets the direction up to the number 0
	public final static int UP = 0; 
	
	// Sets the direction right to the number 1
	public final static int RIGHT = 1; 
	
	// Sets the direction down to the number 2
	public final static int DOWN = 2; 
	
	// Sets the direction left to the number 3
	public final static int LEFT = 3; 
	
	// Sets the direction up and right to the number 4
	public final static int UP_AND_RIGHT = 4; 
	
	// Sets the direction down and right to the number 5
	public final static int DOWN_AND_RIGHT = 5; 
	
	// Sets the direction down and left to the number 6
	public final static int DOWN_AND_LEFT = 6; 
	
	// Sets the direction up and left to the number 7
	public final static int UP_AND_LEFT = 7; 
	
	// Sets a neutral direction to the number -1
	public final static int NEUTRAL = -1; 

	public final BattleField grid; // creates a grid for the soldiers
	public int row, col; // the location for a soldier
	public int health; // the health a soldier has at a point in time
	public final int team; // what team a soldier is in

	/* This method will create a soldier with its own grid, team, location, and
	 * the health amount set at the beginning of the class. Sets each soldier
	 * to the same team. */
	
	public BasicSoldier(BattleField grid, int team, int row, int col) {

		this.grid = grid; // sets the grid for the soldier
		this.team = team; // sets the team for the soldier
		this.row = row; // sets the horizontal location for the soldier
		this.col = col; // sets the vertical location for the soldier
		this.health = INITIAL_HEALTH; // sets the health for the soldier

	}

	/* This method checks the location that is above, below, to the left and 
	 * right of the soldier for its contents, and returns if the square above,
	 *  below, to the right and left are empty or not.*/
	
	public boolean canMove() {

		//gets the contents of the location above the soldier
		int up = grid.get(row, col + 1);
		
		// gets the contents of the location below the soldier
		int down = grid.get(row, col - 1); 
		
		// gets the contents of the location left of the soldier
		int left = grid.get(row - 1, col); 
		
		// gets the contents of the location right of the soldier
		int right = grid.get(row + 1, col); 

		return (up == BattleField.EMPTY || down == BattleField.EMPTY || 
				left == BattleField.EMPTY || right == BattleField.EMPTY);

	}

	/* This method will tell you if a given soldier is on your team or not. */
	
	public int enemyTeam() {

		int enemyTeam = 0; // Declares a variable to return for the enemy team
		
		/* This if statement checks the soldier's team, and declares the 
		 * opposing team as the enemy team.*/
		
		if (team == BattleField.RED_TEAM) {

			enemyTeam = BattleField.BLUE_TEAM; // sets the enemy team to blue

		} else {

			enemyTeam = BattleField.RED_TEAM; // sets the enemy team to red	

		}

		return enemyTeam;

	}

	/* This method checks if the soldier can attack*/
	
	public boolean canAttack() {

		// lets the method know which team is the enemy team
		int enemyTeam = enemyTeam(); 

		// gets the contents of the location above the soldier
		int up = grid.get(row, col + 1); 
		
		// gets the contents of the location below the soldier
		int down = grid.get(row, col - 1); 
		
		// gets the contents of the location left of the soldier
		int left = grid.get(row - 1, col);
		
		// gets the contents of the location right of the soldier
		int right = grid.get(row + 1, col); 

		return (up == enemyTeam || down == enemyTeam || left == enemyTeam 
				|| right == enemyTeam);

	}

	/* This method tells the soldier how many enemies are remaining. */
	
	public int numberOfEnemiesRemaining() {

		// starts the count at 0 for the number of enemy soldiers
		int totalnumEnemies = 0; 

		// lets the method know which team is the enemy team
		int enemyTeam = enemyTeam(); 
		
		/*This two for loops check every location in the grid, and the if 
		 * statement checks if the location in question has an enemy soldier 
		 * standing in its square, and if it does the local variable 
		 * totalnumEnemies adds 1 to itself. */

		for (int height = 0; height < grid.getRows(); height++) {

			for (int width = 0; width < grid.getCols(); width++) {

				if (grid.get(height, width) == enemyTeam) {

					totalnumEnemies++; // increase the number of enemies by 1

				}

			}

		}

		return totalnumEnemies;

	}

	/* This method returns the distance or the number of moves it will take 
	 * the soldier to reach the given location through the row and column given
	 * to the method as parameters. */
	
	public int getDistance(int destinationRow, int destinationCol) {

		// takes the abs value of the amount of horizontal distance traveled
		int horizontalTravel = Math.abs(destinationRow - row);
		
		// takes the absolute value of the amount of vertical distance traveled
		int verticalTravel = Math.abs(destinationCol - col); 
		
		return horizontalTravel + verticalTravel;

	}

	/* This method returns the direction the soldier has to travel in order to
	 * reach the given location through the row and column given to the
	 * method as parameters. */
	
	public int getDirection(int destinationRow, int destinationCol) {

		// gets the amount of horizontal travel the soldier must do
		int horizontalTravel = destinationRow - row; 
		
		// gets the amount of vertical travel the soldier must do
		int verticalTravel = destinationCol - col;
		
		/* The following if statements check what direction the soldier must 
		 * travel in to get to the specified location. */
		
		if (verticalTravel == 0 && horizontalTravel > 0) { // going down

			return DOWN;

		} else if (verticalTravel == 0 && horizontalTravel < 0) { // going up

			return UP;

		} else if (horizontalTravel == 0 && verticalTravel < 0) { // going left

			return LEFT;

		} else if (horizontalTravel == 0 && verticalTravel > 0) { // going right

			return RIGHT;

		} else if (horizontalTravel < 0 && verticalTravel > 0) { 

			// going up and right
			return UP_AND_RIGHT;

		} else if (horizontalTravel > 0 && verticalTravel > 0) { 
			
			// going down and right
			return DOWN_AND_RIGHT;

		} else if (horizontalTravel > 0 && verticalTravel < 0) { 

			// going down and left
			return DOWN_AND_LEFT;

		} else if (horizontalTravel < 0 && verticalTravel < 0) { 

			// going up and left
			return UP_AND_LEFT;

		} else { // no direction b/c the location is where the soldier is at rn

			return NEUTRAL;

		}

	}

	/* This method returns the direction the soldier must travel in to get 
	 * to his closest team mate. */
	
	public int getDirectionOfNearestFriend() {

		// max distance a friend can be
		int distanceFromMe = grid.getCols() + grid.getRows() + 1; 
		
		// if there is no friend left
		int directionOfNearestFriend = NEUTRAL; 

		/*This two for loops check every location in the grid, and the if 
		 * statement checks if the location in question has an team mate
		 * standing in its square, and  if the distance from the soldier to the
		 * closest team mate is not 0. If the statement is true it will set the 
		 * current distance and direction as the new direction and update it 
		 * if it finds a closer team mate. */
		
		for (int row = 0; row < grid.getRows(); row++) {

			for (int col = 0; col < grid.getCols(); col++) {

				if (grid.get(row, col) == team && getDistance(row, col) != 0) {

					if (getDistance(row, col) <= distanceFromMe) {

						// sets the new distance to the most closest one found
						distanceFromMe = getDistance(row, col);

						// sets the new direction to the closest one found
						directionOfNearestFriend = getDirection(row, col);

					}

				}

			}

		}

		return directionOfNearestFriend;

	}

	/* This method checks how many team mates can reach the soldier in the 
	 * given amount of moves, or radius that is passed through the parameter. */
	
	public int countNearbyFriends(int radius) {

		// sets the team mates to -1 to account for himself
		int teammamatesNearMe = -1; 
		
		/*This two for loops check every location in the grid, and the if 
		 * statement checks if the location in question has an team mate
		 * standing in its square, and  if the distance from the soldier to the
		 * team mate can be reached in the given amount of moves. If the 
		 * statement is true it will increase the team mates around him by 1 */
		
		for (int row = 0; row < grid.getCols(); row++) {

			for (int col = 0; col < grid.getRows(); col++) {


				if (grid.get(row, col) == team && 
						getDistance(row, col) <= radius) {

					teammamatesNearMe++; // if found raises the team mate by 1

				}

			}

		}

		return teammamatesNearMe;

	}
	
	/* This method returns the direction the soldier must travel in to get 
	 * to his closest enemy. */
	
	public int getDirectionOfNearestEnemy(int radius) {

		int distanceFromMe = grid.getCols() + grid.getRows() + 1; // max dist
		
		// if there are no enemies within the distance given
		int directionOfNearestEnemy = NEUTRAL; 
		
		// lets the method know which team is the enemy team
		int enemyTeam = enemyTeam(); 

		/*This two for loops check every location in the grid, and the if 
		 * statement checks if the location in question has an enemy standing 
		 * in its square, and  if the distance from the soldier to the closest 
		 * enemy can be reached within the number of moves specified. If the 
		 * statement is true it will set the current distance and direction 
		 * as the new direction and update it if it finds a closer enemy. */
		
		for (int row = 0; row < grid.getRows(); row++) {

			for (int col = 0; col < grid.getCols(); col++) {

				if (grid.get(row, col) == enemyTeam &&
						getDistance(row, col) <= radius) {
					
					if (getDistance(row, col) <= distanceFromMe) {

						//sets the direction of the closest found enemy
						directionOfNearestEnemy = getDirection(row, col);
					
						//sets the distance of the closest found enemy
						distanceFromMe = getDistance(row, col);
					
					}
					
				}

			}

		}

		return directionOfNearestEnemy;
	}
	
	/* This method performs the turn of a soldier */
	
	public void performMyTurn() {
		
		/*  The if statement first chooses to attack, if possible on his turn
		 * by getting the location of the squares around him, and if possible 
		 * attacking an enemy. If that is not possible then he will move up if 
		 * that location is empty, if not then down, if available, if not then 
		 * he will go left, if not then he will go right, and if even that is
		 * not possible he will do nothing. */
		
		if (canAttack() == true) {

			// lets the method know which team is the enemy team
			int enemyTeam = enemyTeam(); 

			if (grid.get(row, col + 1) == enemyTeam) { // attack up

				grid.attack(row, col + 1);

			} else if (grid.get(row, col - 1) == enemyTeam) { // attack down

				grid.attack(row, col - 1);

			} else if (grid.get(row - 1, col) == enemyTeam) { // attack left

				grid.attack(row - 1, col);

			} else if (grid.get(row + 1, col) == enemyTeam) { // attack right

				grid.attack(row + 1, col);

			}

		} else if (canMove() == true) {

			if (grid.get(row, col + 1) == BattleField.EMPTY) { // go up
				
				this.col += 1;
				
			} else if (grid.get(row, col - 1) == BattleField.EMPTY) { // go down
				
				this.col -= 1;
				
			} else if (grid.get(row - 1, col) == BattleField.EMPTY) { // go left
				
				this.row -= 1;
				
			} else if (grid.get(row + 1, col) == BattleField.EMPTY) {
				
				// go right
				this.row += 1;
				
			}
			
		}
		
	}

}