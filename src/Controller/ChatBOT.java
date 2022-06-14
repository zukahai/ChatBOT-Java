package Controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.BOT;
import Model.Minimax;
import Model.Move;
import Model.TikTacToe;
import View.Main_GUI;

public class ChatBOT {
	public Main_GUI gui = new Main_GUI();
	TikTacToe tikTacToe = new TikTacToe();
	BOT bot = new BOT();
	Color colorBOT = Color.red;
	public ChatBOT() {
		tikTacToe.newGame();
		gui.setIconButton(tikTacToe.board);
		gui.send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.message.getText().length() > 0) {
					gui.appendToPane(gui.AllMessage, "T\u00F4i: " + gui.message.getText() + "\n", Color.blue);
					int index = bot.getIntents(gui.message.getText());
					if (index == 0) {
						tikTacToe.newGame();
						gui.setIconButton(tikTacToe.board);
					}
					gui.appendToPane(gui.AllMessage, "BOT: " + bot.solveMessage(gui.message.getText()) + "\n", Color.red);
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
						if (tikTacToe.isNull(x, y)) {
							tikTacToe.click(x, y);
							gui.setIconButton(tikTacToe.board);
							if (tikTacToe.value() == 10) {
								gui.appendToPane(gui.AllMessage, "BOT: " + "B\u1EA1n \u0111\u00E3 thua r\u1ED3i,\nch\u00FAc b\u1EA1n may m\u1EAFn l\u1EA7n sau nh\u00E9.\n", colorBOT);
							}
							else if (tikTacToe.bestval == 10)
								gui.appendToPane(gui.AllMessage, "BOT: " + bot.solveMessage("game win") + "\n", colorBOT);
							else
								gui.appendToPane(gui.AllMessage, "BOT: " + bot.solveMessage("game hoa") + "\n", colorBOT);
						} else {
							gui.appendToPane(gui.AllMessage, "BOT: " + "Vui l\u00F2ng \u0111\u00E1nh v\u00E0o \u00F4 c\u00F2n tr\u1ED1ng!\n", colorBOT);
						}
					}
				});
			}
		
	}
	
	public static void main(String[] args) {
		new ChatBOT();
	}
}
