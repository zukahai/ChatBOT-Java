package Controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Minimax;
import Model.Move;
import Model.TikTacToe;
import View.GUI;

public class ChatBOT {
	public GUI gui = new GUI();
	TikTacToe tikTacToe = new TikTacToe();
	public ChatBOT() {
		gui.setIconButton(tikTacToe.board);
		gui.send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.message.getText().length() > 0) {
					gui.appendToPane(gui.AllMessage, "T\u00F4i: " + gui.message.getText() + "\n", Color.blue);
					gui.message.setText("");
				}
			}
		});
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				gui.bt[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						int value = Integer.parseInt(e.getActionCommand());
						int x = value / 3;
						int y = value % 3;
						tikTacToe.click(x, y);
						gui.setIconButton(tikTacToe.board);
						if (tikTacToe.bestval == 10)
							gui.appendToPane(gui.AllMessage, "BOT: " + "S\u1EAFp thua r\u1ED3i \u0111\u00F3 nha, hehe ^^\n", Color.RED);
						else
							gui.appendToPane(gui.AllMessage, "BOT: " + "N\u01B0\u1EDBc \u0111i hay \u0111\u1EA5y!\n", Color.RED);
					}
				});
			}
		
	}
	
	public static void main(String[] args) {
		new ChatBOT();
	}
}
