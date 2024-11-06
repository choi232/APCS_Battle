//Board File

//Board File

//how to build the board game box

//2 boards letters down the side and numbers across the top (10x10 board)

//5 different ship types
//Carrier has 5 pegs

//2 colored set of pets

//git functionality test

public class Board{
	
	//char[][] board = new char[10][10];
	
	char[][] board = {{'0','S','0','0','S','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'},{'0','0','0','0','0','0','0','0','0','0'}};
	
	/*
	for(int r = 0; r < 10; r++){
		for(int c = 0; c < 10; c++){
			board[r][c] = '0';
		}
	}
	*/
	
	//constructor
	public Board(){	
	}
	
	
	/*
	 
	 */
	public boolean checkShip(int row, int col){
		if(board[row][col] == 'S'){
			return true;
		}
		return false;
	}
	
	
	/*
	 
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
