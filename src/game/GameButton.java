package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameButton extends JButton implements ActionListener {
	
	static ImageIcon X;
	static ImageIcon O;
	int bStatus = 0;
	/*
	 0 -> Blank
	 1 -> X occupied
	 2 -> O occupied
	 */
	
	public GameButton(){
		X = new ImageIcon(this.getClass().getResource("TTTX.png"));
		O = new ImageIcon(this.getClass().getResource("TTTO.png"));
		this.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent event) {
		
		int carrier = bStatus;
		
		if(TicTacToeGame.playerTurn == true && bStatus == 0){
			bStatus = 1;
		}else if(TicTacToeGame.playerTurn == false && bStatus == 0){
			bStatus = 2;
		}
		
		switch(bStatus){
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);
			break;
		case 2:
			setIcon(O);
			break;
		}
		if(carrier != bStatus){
			TicTacToeGame.playerTurn = !TicTacToeGame.playerTurn;
		}
		
		TicTacToeGame.checkWinner();
		
		if(TicTacToeGame.gameEnd == true){
			for(int c = 0; c < 9; c++){
				TicTacToeGame.removeActionListener(c);
			}
		}
	}
}
