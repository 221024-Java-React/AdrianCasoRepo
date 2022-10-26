package labs;

import java.util.Arrays;
import java.util.Scanner;


// NOT CODED FOR TIE
// IF INVALID MOVE, CURRENTPLAYER STILL CHANGES
public class Lab5 {
	
	// change player from 1 to 2 or 2 to 1
	public int changePlayer(int currentPlayer) {
		if(currentPlayer == 1) {
			return 2;
		} else {
			return 1;
		}
	}
	
	// check if selected space is a valid move
	// returns true if the selected space is blank. return false if selected space is taken
	public boolean validMove(char[][] board, int row, int col) {
		return board[row][col] == '_';
	}
	
	

	public boolean gameOver(char[][] board, int player) {
		// checks if there is a horizontal win
		for(int i = 0; i < 3; i++) {
			if(board[i][0] != '_' && (board[i][0] == board[i][1] && board[i][1] == board[i][2])) {
				System.out.println("Player " + player + " wins!");
				return true;
			} 
		}
		
		// checks if there is a vertical win
		for(int i = 0; i < 3; i++) {
			if(board[0][i] != '_' && (board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
				System.out.println("Player " + player + " wins!");
				return true;
			} 
		}
		
		// checks for diagonal (left to right) win
		if(board[0][0] != '_' && (board[0][0] == board[1][1] && board[1][1] == board[2][2])) {
			System.out.println("Player " + player + " wins!");
			return true;
		}
		
		// check for diagonal (right to left) win
		if(board[0][2] != '_' && (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
			System.out.println("Player " + player + " wins!");
			return true;
		}
		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		char[][] board = {{'_', '_', '_'},{'_', '_', '_'},{'_', '_', '_'}};
		
		int currentPlayer = 1;
		
		Lab5 game = new Lab5();
		
		Scanner scan = new Scanner(System.in);
		
		// start game
		boolean playing = true;
		 while(playing) {
			 
			//print board
			for(int row = 0; row < 3; row++) {
				for(int column = 0; column < 3; column++) {
					System.out.print(board[row][column]);
				}
				System.out.println();
			}
			
			System.out.println("Player" + currentPlayer);
			System.out.println("Select row ('0/1/2')");
			int row = scan.nextInt();
			
			System.out.println("Select column ('0/1/2')");
			int column = scan.nextInt();
			
			if(game.validMove(board, row, column)) {
				if(currentPlayer == 1) {
					board[row][column] = 'X';
				} else {
					board[row][column] = 'O';
				}
			} else {
				System.out.println("Invalid move. Please select again");
			}
			
			playing = !game.gameOver(board, currentPlayer);
			currentPlayer = game.changePlayer(currentPlayer);
			
		 }
	
		
	}
	

}
