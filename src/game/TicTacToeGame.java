package game;


import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class TicTacToeGame extends JFrame {
	private static JPanel panel = new JPanel();
	private static GameButton space[] = new GameButton[9];
	
	public static boolean playerTurn = true;
	public static boolean gameEnd = false;
	
	public static void main(String args[]){
		new TicTacToeGame();
	}
	
	public TicTacToeGame(){
		super("Crosses and Noughts");
		setSize(400, 400);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(3,3));
		for(int i = 0; i < 9; i++){
			space[i] = new GameButton();
			panel.add(space[i]);
		}
		add(panel);
		
		setVisible(true);
	}
	
	public static void checkWinner(){
		// Checks if X wins
		if(space[0].getIcon() == GameButton.X){
			if((space[1].getIcon() == GameButton.X && space[2].getIcon() == GameButton.X) || (space[3].getIcon() == GameButton.X && space[6].getIcon() == GameButton.X) || (space[4].getIcon() == GameButton.X && space[8].getIcon() == GameButton.X)){
				JOptionPane.showMessageDialog(panel, "X wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[2].getIcon() == GameButton.X){
			if((space[5].getIcon() == GameButton.X && space[8].getIcon() == GameButton.X) || (space[4].getIcon() == GameButton.X && space[6].getIcon() == GameButton.X)){
				JOptionPane.showMessageDialog(panel, "X wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[4].getIcon() == GameButton.X){
			if((space[1].getIcon() == GameButton.X && space[7].getIcon() == GameButton.X) || (space[3].getIcon() == GameButton.X && space[5].getIcon() == GameButton.X)){
				JOptionPane.showMessageDialog(panel, "X wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[6].getIcon() == GameButton.X && space[7].getIcon() == GameButton.X && space[8].getIcon() == GameButton.X){
			JOptionPane.showMessageDialog(panel, "X wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
			gameEnd = true;
		}
		
		
		
		//Checks if O wins
		if(space[0].getIcon() == GameButton.O){
			if((space[1].getIcon() == GameButton.O && space[2].getIcon() == GameButton.O) || (space[3].getIcon() == GameButton.O && space[6].getIcon() == GameButton.O) || (space[4].getIcon() == GameButton.O && space[8].getIcon() == GameButton.O)){
				JOptionPane.showMessageDialog(panel, "O wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[2].getIcon() == GameButton.O){
			if((space[5].getIcon() == GameButton.O && space[8].getIcon() == GameButton.O) || (space[4].getIcon() == GameButton.O && space[6].getIcon() == GameButton.O)){
				JOptionPane.showMessageDialog(panel, "O wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[4].getIcon() == GameButton.O){
			if((space[1].getIcon() == GameButton.O && space[7].getIcon() == GameButton.O) || (space[3].getIcon() == GameButton.O && space[5].getIcon() == GameButton.O)){
				JOptionPane.showMessageDialog(panel, "O wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
				gameEnd = true;
			}
		}
		if(space[6].getIcon() == GameButton.O && space[7].getIcon() == GameButton.O && space[8].getIcon() == GameButton.O){
			JOptionPane.showMessageDialog(panel, "O wins! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
			gameEnd = true;
		}
		
		int occupiedSpaces = 0;
		
		for(int q = 0; q < 9; q++){
			if(space[q].getIcon() == GameButton.X || space[q].getIcon() == GameButton.O){
				occupiedSpaces++;
			}
		}
		
		if(occupiedSpaces == 9){
			JOptionPane.showMessageDialog(panel, "Draw! Play again?", "The Game Has Ended!", JOptionPane.YES_NO_OPTION);
			gameEnd = true;
		}
		
	}
	
	public static void removeActionListener(int slot){
		space[slot].removeActionListener(space[slot]);
	}
	
}
