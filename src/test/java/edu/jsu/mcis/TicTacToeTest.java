package edu.jsu.mcis;


import org.junit.*;
import static org.junit.Assert.*;


public class TicTacToeTest{
	@Test
	public void testPlayer1(){
		TicTacToe game = new TicTacToe();
		boolean player = true;
		assertEquals(player, game.getPlayer(2));
	}

	@Test
	public void testPlayer2(){
		TicTacToe game = new TicTacToe();
		boolean player = false;
		assertEquals(player, game.getPlayer(3));
	}
	
	@Test
	public void testDiagonalLeftXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"X","","","","X","","","","X"};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testDiagonalRightXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","X","","X","","X","",""};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalTopXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"X","X","X","","","","","",""};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalMiddleXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","","X","X","X","","",""};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalBottomXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","","","","","X","X","X"};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleLeftXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"X","","","X","","","X","",""};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleMiddleXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","X","","","X","","","X",""};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleRightXWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","X","","","X","","","X"};
		game.checkWinner(moves);
		String XWin = "X";
		assertEquals(XWin, game.checkWinner(moves));
	}

	
	@Test
	public void testDiagonalLeftOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"O","","","","O","","","","O"};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	
	@Test
	public void testDiagonalRightOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","O","","O","","O","",""};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalTopOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"O","O","O","","","","","",""};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalMiddleOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","","O","O","O","","",""};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testHorizontalBottomOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","","","","","O","O","O"};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleLeftOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"O","","","O","","","O","",""};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleMiddleOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","O","","","O","","","O",""};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}
	@Test
	public void testVerticleRightOWin(){
		TicTacToe game = new TicTacToe();
		String [] moves = {"","","O","","","O","","","O"};
		game.checkWinner(moves);
		String OWin = "O";
		assertEquals(OWin, game.checkWinner(moves));
	}

}
