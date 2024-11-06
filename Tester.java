/*
 * Author: Mikael
 * Main Driver or Tester File
 * 
 * Purpose: Run all the different classes in this single fil;e to run Battleship
 */
public class Tester{

	public static void main(String[] args){
		Board b = new Board(); //instantiate Board object
		b.printBoard(); //test printBoard
		System.out.println(b.checkShip(0,1)); //test checkShip
	}

}
