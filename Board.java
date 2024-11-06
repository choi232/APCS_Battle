//Board File

//Board File

//how to build the board game box

//2 boards letters down the side and numbers across the top (10x10 board)

//5 different ship types
//Carrier has 5 pegs

//2 colored set of pets

//git functionality test

public class Board{
	
	char[][] board = new char[10][10];
	char[][] board = new char[10][10];
	
	//constructor
	public Board(){
	}
	
	
	/*
	 
	 */
	public boolean checkShip(int row, int col){
		if(board[row][col] == 's'){
			return false;
		}
	}
	
	
	/*
	 
	*/
	public void toString(){
		for(int r = 0; r < 10; r++){
			for(int c = 0; c < 10; c++){
			
			}
		}
	}
}
