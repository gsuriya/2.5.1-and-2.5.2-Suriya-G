/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
	 private String name = ""; 
	 private double points = 0;
	 
	
  /* your code here - constructor(s) */ 
	 public Player() {
		 System.out.println("Enter Player Name: ");
		 Scanner inputScanner = new Scanner (System.in);
		 String playerNameFromSysInput = inputScanner.nextLine();
		 
		 this.name = playerNameFromSysInput;
		 this.points = 0;
		 
		 System.out.println("Welcome to the game " + this.name + " !!!");
	 }
	 
	 public Player (String inputName) {
		 this.name = inputName;
		 this.points = 0;
		 
		 System.out.println("Welcome to the game " + this.name + " !!!");
	 }
	 
  /* your code here - accessor(s) */ 
	public String getName() {
		return name;
	}

	public double getPoints() {
		return points;
	}
	
	
  /* your code here - mutator(s) */ 
	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(double points) {
		this.points = points;
	}

}