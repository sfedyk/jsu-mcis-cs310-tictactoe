package edu.jsu.mcis;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class TicTacToe extends JFrame implements ActionListener{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JLabel game;
	private JLabel winner;
	private boolean player1;
	private int count = 0;

	
	public TicTacToe() {
		
		setLayout(new BorderLayout());
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		JPanel panel = new JPanel ();
		panel.setLayout(new GridLayout(3, 3));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		game = new JLabel("TicTacToe Game");
		winner = new JLabel("");
		
		add(game, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(winner, BorderLayout.SOUTH);

     }
	
	public boolean getPlayer(int gameCount){
		if(gameCount % 2 == 0)
			player1 = true;
		else
			player1 = false;
		return player1;
	}
	
	public String checkWinner(String [] a){
		String gameWinner = "";
		if(a[0] == "X" && a[4] == "X" && a[8] == "X"){
			gameWinner = "X";
		}
		else if(a[2] == "X" && a[4] == "X" && a[6] == "X"){
			gameWinner = "X";
		}
		else if(a[0] == "X" && a[1] == "X" && a[2] == "X"){
			gameWinner = "X";
		}
		else if(a[3] == "X" && a[4] == "X" && a[5] == "X"){
			gameWinner = "X";
		}
		else if(a[6] == "X" && a[7] == "X" && a[8] == "X"){
			gameWinner = "X";
		}
		else if(a[0] == "X" && a[3] == "X" && a[6] == "X"){
			gameWinner = "X";
		}
		else if(a[1] == "X" && a[4] == "X" && a[7] == "X"){
			gameWinner = "X";
		}
		else if(a[2] == "X" && a[5] == "X" && a[8] == "X"){
			gameWinner = "X";
		}
		
		else if(a[0] == "O" && a[4] == "O" && a[8] == "O"){
			gameWinner = "O";
		}
		else if(a[2] == "O" && a[4] == "O" && a[6] == "O"){
			gameWinner = "O";
		}
		else if(a[0] == "O" && a[1] == "O" && a[2] == "O"){
			gameWinner = "O";
		}
		else if(a[3] == "O" && a[4] == "O" && a[5] == "O"){
			gameWinner = "O";
		}
		else if(a[6] == "O" && a[7] == "O" && a[8] == "O"){
			gameWinner = "O";
		}
		else if(a[0] == "O" && a[3] == "O" && a[6] == "O"){
			gameWinner = "O";
		}
		else if(a[1] == "O" && a[4] == "O" && a[7] == "O"){
			gameWinner = "O";
		}
		else if(a[2] == "O" && a[5] == "O" && a[8] == "O"){
			gameWinner = "O";
		}
		
		return gameWinner;
	}
	
	public void actionPerformed(ActionEvent event){
		TicTacToe game = new TicTacToe();
		String [] moves = new String[9];
		
		if (event.getSource() == button1){
			if(game.getPlayer(count) == true){
				button1.setText("x");
				moves[0] = "X";
				count ++;
			}
			else
			{
				button1.setText("0");
				moves[0] = "O";
				count ++;
			}
				
		}

		else if (event.getSource() == button2){
			if(game.getPlayer(count) == true){
				button2.setText("x");
				moves[1] = "X";
				count ++;
			}
			else
			{
				button2.setText("0");
				moves[1] = "O";
				count ++;
			}
		
		}
		else if (event.getSource() == button3){
			if(game.getPlayer(count) == true){
				button3.setText("x");
				moves[2] = "X";
				count ++;
			}
			else
			{
				button3.setText("0");
				moves[2] = "O";
				count ++;
			}
			
		}
		else if (event.getSource() == button4){
			if(game.getPlayer(count) == true){
				button4.setText("x");
				moves[3] = "X";
				count ++;
			}
			else
			{
				button4.setText("0");
				moves[3] = "O";
				count ++;
			}
		
		}
		else if (event.getSource() == button5){
			if(game.getPlayer(count) == true){
				button5.setText("x");
				moves[4] = "X";
				count ++;
			}
			else
			{
				button5.setText("0");
				moves[4] = "O";
				count ++;
			}
		
		}
		else if (event.getSource() == button6){
			if(game.getPlayer(count) == true){
				button6.setText("x");
				moves[5] = "X";
				count ++;
			}
			else
			{
				button6.setText("0");
				moves[5] = "O";
				count ++;
			}
						
		}
		else if (event.getSource() == button7){
			if(game.getPlayer(count) == true){
				button7.setText("x");
				moves[6] = "X";
				count ++;
			}
			else
			{
				button7.setText("0");
				moves[6] = "O";
				count ++;
			}
						
		}
		else if (event.getSource() == button8){
			if(game.getPlayer(count) == true){
				button8.setText("x");
				moves[7] = "X";
				count ++;
			}
			else
			{
				button8.setText("0");
				moves[7] = "O";
				count ++;
			}
						
		}
		else if (event.getSource() == button9){
			if(game.getPlayer(count) == true){
				button9.setText("x");
				moves[8] = "X";
				count ++;
			}
			else
			{
				button9.setText("0");
				moves[8] = "O";
				count ++;
			}
						
		}		
		
		
		if(game.checkWinner(moves) == "X"){
				winner.setText("X WINS");
			}
		else if(game.checkWinner(moves) == "O"){
				winner.setText("O WINS");
			}
		
	}
	
	
	public static void main (String [] args){
		TicTacToe game = new TicTacToe();//
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		game.pack();//
		game.setVisible(true);//
	}
	
	
	
}
