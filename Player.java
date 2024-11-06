/*
 * Author: Mikael
 * 
 * Pupose: Create class from which players will be created with ncessary objects of other classes such as boards to play Battleship
 * 
 */
public class Player{
	private String name;
	private Board board;
	public Player(){
		Scanner scan = new Scanner(System.in); //instantiate scan from Scanner
		System.out.println("Enter Player Name: ");
		name = scanner.nextLine(); //set input to name attribute in Player
		board = new Board(); //create a new board object for each Player object
	}
	
	public boolean guess(){
	
	}
}
