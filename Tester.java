/*
 * Author: Mikael
 * Main Driver or Tester File
 * 
 * Purpose: Run all the different classes in this single fil;e to run Battleship
 */
public class Tester{

	public static void main(String[] args){
		Player p1 = new Player();
		p1.getBoardGuesses().printBoard(); //test printBoard
		p1.getBoardShips().printBoard();
		System.out.println(p1.getBoardShips().checkShip(0,1)); //test checkShip
	}

}
