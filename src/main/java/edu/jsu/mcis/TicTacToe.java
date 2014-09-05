package edu.jsu.mcis;
import java.util.Scanner;

public class TicTacToe{
	private String[][] board;
	private String winner = "";
	private boolean player1;
	
	public TicTacToe() {
		board = new String[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = " ";
			}
		}
	}
	
	public String display(){
		String s = "";
		s = board[0][0] + "|" + board[0][1] + "|" + board[0][2] +"\n-----\n";
		s = s + board[1][0] +"|" + board[1][1] + "|" + board[1][2] +"\n-----\n";
		s = s + board[2][0] +"|" + board[2][1] + "|" + board[2][2];
		return s;
	}
	
	public String getLocation(int i, int j){
		return board[i][j];
	}
	
	
	public void markX(int i, int j){
		board[i][j]= "X";
	}
	
	public void markO(int i, int j){
		board[i][j] = "O";
	}
	
	
	public String getWinner(){
		if(board[0][0]=="X" && board[1][1]=="X" && board[2][2]=="X")
			winner = "X";
		else if	(board[0][2]== "X" && board[1][1]=="X" && board[2][0]== "X")
			winner = "X";
		else if (board[0][0]=="X" && board[0][1]=="X" && board[0][2]=="X")
			winner = "X";
		else if (board[1][2]=="X" && board[1][1]=="X" && board[1][0]=="X")
			winner = "X";
		else if (board[2][2]=="X" && board[2][1]=="X" && board[2][0]=="X")
			winner = "X";
		else if (board[0][0]=="X" && board[1][0]=="X" && board[2][0]=="X")
			winner = "X";	
		else if (board[0][1]=="X" && board[1][1]=="X" && board[2][1]=="X")
			winner = "X";
		else if (board[0][2]=="X" && board[1][2]=="X" && board[2][2]=="X")
			winner = "X";
		else if(board[0][0]=="O" && board[1][1]=="O" && board[2][2]=="O")
		 	winner = "O";
		else if(board[0][2]== "O" && board[1][1]=="O" && board[2][0]== "O")
			winner = "O";
		else if (board[0][0]=="O" && board[0][1]=="O" && board[0][2]=="O")
			winner = "O";
		else if (board[1][2]=="O" && board[1][1]=="O" && board[1][0]=="O")
			winner = "O";
		else if (board[2][2]=="O" && board[2][1]=="O" && board[2][0]=="O")
			winner = "O";
		else if (board[0][0]=="O" && board[1][0]=="O" && board[2][0]=="O")
			winner = "O";
		else if (board[0][1]=="O" && board[1][1]=="O" && board[2][1]=="O")
			winner = "O";
		else if (board[0][2]=="O" && board[1][2]=="O" && board[2][2]=="O")
			winner = "O";
		else
			winner = "NONE";
		return winner;
	}
	
	public boolean getPlayer(int count){
		if(count % 2 == 0)
			player1=true;
		else 
			player1 = false;
		return player1;
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		
		game.display();
		
		while(game.getWinner() == "NONE"){
			int count = 0;
			System.out.println("Please type in the coordinates of your move");
			Scanner scanner = new Scanner (System.in);
			int [] move = new int [2];
			for(int i = 0; i < move.length; i ++)
				move[i] = scanner.nextInt();

			if (game.getPlayer(count)== true)	
				game.markX(move[0],move[1]);
			else
				game.markO(move[0],move[1]);
			count ++;	
			game.getWinner();
		}
    
    }
}