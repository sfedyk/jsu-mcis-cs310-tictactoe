package edu.jsu.mcis;

private class TicTacToeKeywords{

	public void startNewGame(){
		TicTacToe game = new ticTacToe();
	}
	
	
	public String markLocation(int row, int col){
		return game.markLocation(row, col);
	}
	
	
	public String getLocation(int row, int col){
		return game.getLocation(row, col);
	}
	
	
	public String getWinner(){
		return game.getwinner();
	}
	
}