package edu.jsu.mcis;

private class TicTacToeKeywords{

	public void startNewGame(){
		TicTacToe game = new ticTacToe();
	}
	
	
	public void markLocation(){
		return game.actionEvent();
	}

	
	public String getWinner(){
		return game.checkWinner();
	}
	
}