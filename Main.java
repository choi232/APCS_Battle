/*
 * Author: Mikael
 * Main Driver
 * 
 * Purpose: Run all the different classes in this single fil;e to run Battleship
 */
public class Main{

  public static void main(String[] args){
    /*
    Player p1 = new Player();
    p1.getBoardGuesses().printBoard(); //test printBoard
    p1.getBoardShips().printBoard();
    System.out.println(p1.getBoardShips().checkShip(0,1)); //test checkShip
    */
    
    Board b = new Board();
    b.printBoard();
    b.placeShip(2, 8, 8, false);
    b.placeShip(5, 1, 0, true);
    b.printBoard();
  }

}
