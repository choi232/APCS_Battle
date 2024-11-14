/*
 * Author: Mikael
 * 
 * Pupose: Create class from which players will be created with necessary objects of other classes such as boards to play Battleship
 * 
 */
 
 import java.util.Scanner;
 
public class Player{
	private String name;
	private Board boardShips;
	private Board boardGuesses;
	private Scanner scan = new Scanner(System.in); //instantiate scan from Scanner
	
	public Player(){
		System.out.println("Enter Player Name: ");
		name = scan.nextLine(); //set input to name attribute in Player
		Board boardShips = new Board(); //instantiate Board object
		Board boardGuesses = new Board();
	}
	
	
	public Player(String computerName){
		name = computerName;
		Board boardShips = new Board(); //instantiate Board object
		Board boardGuesses = new Board();
	}
	
	public Board getBoardShips(){
		return boardShips;
	}
	
	public Board getBoardGuesses(){
		return boardGuesses;
	}
	
	/*public boolean guess(){
		
	}
	*/
}
