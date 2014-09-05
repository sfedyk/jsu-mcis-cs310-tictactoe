package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest{
	@Test
	public void testDisplayEmptyBoard(){
		String emptyBoard = " | | \n-----\n | | \n-----\n | | ";
		TicTacToe game = new TicTacToe();
		String board = game.display();
		assertEquals(emptyBoard, board);
	}

	@Test
	public void testMarkLocationUpperLeft(){
		String markedBoard = "X| | \n-----\n | | \n-----\n | | ";
		TicTacToe game = new TicTacToe();
		game.markX(0,0);
		assertEquals(markedBoard, game.display());
	}
	
	@Test
	public void testMarkLocationTopMiddle(){
		String markedBoard = " |O| \n-----\n | | \n-----\n | | ";
		TicTacToe game = new TicTacToe();
		game.markO(0,1);
		assertEquals(markedBoard, game.display());
	}
	
	@Test
	public void testgetLocation(){
		TicTacToe game = new TicTacToe();
		game.markX(0,0);
		String locationMark = "X";
		assertEquals(locationMark, game.getLocation(0,0));
	}
	
	@Test
	public void testDiagonalLeftXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,0);
		game.markX(1,1);
		game.markX(2,2);
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test
	public void testDiagonalRightXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,2);
		game.markX(1,1);
		game.markX(2,0);
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test
	public void testDiagonalLeftOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,0);
		game.markO(1,1);
		game.markO(2,2);
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test
	public void testDiagonalRightOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,2);
		game.markO(1,1);
		game.markO(2,0);
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test
	public void testHorizontalTopXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,0);
		game.markX(0,1);
		game.markX(0,2);		
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	@Test
	public void testHorizontalMiddleXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(1,0);
		game.markX(1,1);
		game.markX(1,2);		
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test
	public void testHorizontalBottomXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(2,0);
		game.markX(2,1);
		game.markX(2,2);
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test
	public void testHorizontalTopOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,0);
		game.markO(0,1);
		game.markO(0,2);
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test
	public void testHorizontalMiddleOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(1,0);
		game.markO(1,1);
		game.markO(1,2);
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	@Test
	public void testHorizontalBottomOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(2,0);
		game.markO(2,1);
		game.markO(2,2);
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test 
	public void testVerticalLeftXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,0);
		game.markX(1,0);
		game.markX(2,0);		
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
		
	@Test 
	public void testVerticalMiddleXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,1);
		game.markX(1,1);
		game.markX(2,1);		
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test 
	public void testVerticalRightXWin(){
		TicTacToe game = new TicTacToe();
		game.markX(0,2);
		game.markX(1,2);
		game.markX(2,2);		
		String XWin = "X";
		assertEquals(XWin, game.getWinner());
	}
	
	@Test 
	public void testVerticalLeftOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,0);
		game.markO(1,0);
		game.markO(2,0);		
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test 
	public void testVerticalMiddleOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,1);
		game.markO(1,1);
		game.markO(2,1);		
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
	@Test 
	public void testVerticalRightOWin(){
		TicTacToe game = new TicTacToe();
		game.markO(0,2);
		game.markO(1,2);
		game.markO(2,2);		
		String OWin = "O";
		assertEquals(OWin, game.getWinner());
	}
	
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
}
