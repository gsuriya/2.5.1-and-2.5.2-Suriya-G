/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

	private Player player1;
	private Player player2;
	private Board game;
	private Boolean solved;

	
  /* your code here - constructor(s) */ 

	// Constructor
	public PhraseSolver() {
		this.player1 = new Player();
		this.player2 = new Player();
		this.game = new Board();
		solved = false; 
	}
	
  /* your code here - accessor(s) */
  
	// player1 getter
	public Player getPlayer1() {
		return player1;
	}

	// player2 getter
	public Player getPlayer2() {
		return player2;
	}

	// game getter
	public Board getGame() {
		return game;
	}

	// is the phrase solved or not
	public Boolean getSolved() {
		return solved;
	}

	
  /* your code here - mutator(s)  */

	// player1 setter
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	// player2 setter
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	// game setter
	public void setGame(Board game) {
		this.game = game;
	}

	// set whether the phrase is solved or not
	public void setSolved(Boolean solved) {
		this.solved = solved;
	}
	

  /*  Class methods */
  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }


  
}