//Board File

//how to build the board game box
//2 boards letters down the side and numbers across the top (10x10 board)
//5 different ship types
//Carrier has 5 pegs
//2 colored set of pets

public class Board{
	
	//create 2D array to place ships on
	char[][] boardShips = {{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'}};
	
	//create 2D array to place guesses on
	char[][] boardGuess = new char[10][10];
	
	//constructor
	public Board(){	
		
	}
	
	
	/*
	Function checkShip takes two int parameters (row, col) and returns true if there is a ship at that index and false if not
	Primarily used for boardGuess to check if there is a ship at guess
	 */
	public boolean checkShip(int row, int col){ //chose to use 'S' to signify a ship
		if(board[row][col] == 'S'){ //checks if board has a ship ('S') there it returns true
			return true;
		}
		return false; //else return false
	}
	
	
	/*
	function printBoard returns no value and takes no parameters but prints out the current state of the board
	Can be used for either boardShips or boardGuess (general method)
	*/
	public void printBoard(){ //if you name the method toString it will not allow you to run it since it would be overriding toString from String library so I called it printBoard
		int letter = 65;
		System.out.println("  0 1 2 3 4 5 6 7 8 9"); //header for columns also used 0-9 instead of 0-10 otherwise there will be an uneven spacing
		//iterate through 2d array and print
		for(int r = 0; r < 10; r++, letter++){ //increment both r and letter at same time in for loop
			System.out.printf("%c ", letter);//print out side header of letters
			for(int c = 0; c < 10; c++){
				System.out.print(board[r][c] + " ");//access 2d array and print individual value
			}
			System.out.println(); //print \n to create line break between each row
		}
	}
}
