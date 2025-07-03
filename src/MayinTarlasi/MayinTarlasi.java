package MayinTarlasi;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MayinTarlasi {
	JFrame frame;
	Btn[][] board = new Btn[10][10];
	public MayinTarlasi() {
		 frame = new JFrame("Mayın Tarlası");
		 frame.setSize(800, 800);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setLayout(new GridLayout(10,10));
		 
		 for(int row=0;row<board.length;row++) {
			 for(int col=0;col<board[0].length;col++) {
				 Btn b = new Btn(row,col);
				 frame.add(b);
				 board[row][col]=b;
				}
			 }
		 generateMine();
		 print();
		 frame.setVisible(true);
	}
	
	public void generateMine() {
		int i=0;
		while(i<10) {
			int randRow=(int) (Math.random() * board.length);
			int randCol=(int) (Math.random()*board[0].length);
			
			while(board[randRow][randCol].isMine()) {  
				 randRow=(int) (Math.random() * board.length);
				 randCol=(int) (Math.random()*board[0].length);
			}
			board [randRow][randCol].setMine(true); 
			i++;
				}}
	
	public void print() {
		
		for(int row=0;row<board.length;row++) {
			 for(int col=0;col<board[0].length;col++) {
				  
				 if(board[row][col].isMine()) {
					 board[row][col].setIcon(new ImageIcon("src/mine.png"));
				 }
				 
				 
			 
			 }}
		
		
	}
	
	
	
	
	
	
	

}
