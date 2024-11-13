/*
Author: Mikael

Purpose: to build a board for battleship

2 boards letters down the side and numbers across the top (10x10 board)
5 different ship types
Carrier has 5 pegs
2 colored set of pets
*/
import java.util.Scanner;
public class Board{
	char[][] ships = new char[10][10];
	char[][] guess = new char[10][10];
	
	//constructor
	public Board(){	
		setBoard();
	}
	
	
	/*
	function checkShip takes two int parameters (row, col) as well as board object and returns true if there is a ship at that index and false if not
	 */
	public boolean checkShip(char[][] board, int row, int col){ //chose to use 'S' to signify a ship
		if(board[row][col] == 'S'){ //checks if board has a ship ('S') there it returns true
			return true;
		}
		return false; //else return false
	}
	
	
	/*
	function printBoard returns no value and takes no parameters but prints out the current state of the board
	*/
	public void printBoard(){ //if you name the method toString it will not allow you to run it since it would be overriding toString from String library so I called it printBoard
		int letter = 65;
		System.out.println("  0 1 2 3 4 5 6 7 8 9"); //header for columns also used 0-9 instead of 0-10 otherwise there will be an uneven spacing
		//iterate through 2d array and print
		for(int r = 0; r < 10; r++, letter++){ //increment both r and letter at same time in for loop
			System.out.printf("%c ", letter);//print out side header of letters
			for(int c = 0; c < 10; c++){
				System.out.print(ships[r][c] + " ");//access 2d array and print individual value
			}
			System.out.println(); //print \n to create line break between each row
		}
		letter = 65;
		System.out.println("  0 1 2 3 4 5 6 7 8 9"); //header for columns also used 0-9 instead of 0-10 otherwise there will be an uneven spacing
		//iterate through 2d array and print
		for(int r = 0; r < 10; r++, letter++){ //increment both r and letter at same time in for loop
			System.out.printf("%c ", letter);//print out side header of letters
			for(int c = 0; c < 10; c++){
				System.out.print(guess[r][c] + " ");//access 2d array and print individual value
			}
			System.out.println(); //print \n to create line break between each row
		}
	}
	


	public void setMarker(char[][] board, char marker, int row, int col){
		board[row][col] = marker;
	}

	public void setBoard(){
		for (int row = 0; row < 10; row++){
			for (int col = 0; col < 10; col++){
				ships[row][col] = '.';
				guess[row][col] = '.';
			}
		}
		
	}
	//method to place the ships at shiprow(sr) and shipcol(sc)
	//modify the placeShip method to take in length, startx starty, direction
	//vertical true places ship vertically downwards from startpoint
	//vertical false places ship horizontally to the right from the start point
	public boolean placeShip(int len, int sRowStart, int sColStart, boolean vertical) {
		//calculate endpoint
		int sRowEnd;
		int sColEnd;
		
		if(vertical){
			sRowEnd = sRowStart - len;
			sColEnd = sColStart - len;
		}
		else{
			sRowEnd = sRowStart + len;
			sColEnd = sColStart + len;
		}
		
		
		
		if(sRowEnd <= 10 && sColEnd <= 10 && vertical){
			for(int row = sRowStart; row == (sRowEnd+1); row++){
				ships[row][sColStart] = 's';
			}
		}
		if(sRowEnd <= 10 && sColEnd <= 10 && !(vertical)){
			for(int col = sColStart; col == (sColEnd+1); col++){
				ships[sRowStart][sColStart] = 's';
			}
		}
		return true;
	}
}
