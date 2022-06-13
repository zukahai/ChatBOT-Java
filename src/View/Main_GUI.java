package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.print.attribute.AttributeSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.text.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Main_GUI extends JFrame {

	public JPanel contentPane;
	public JTextField message;
	public JTextPane AllMessage;
	public JTextField textField_1;
	public JButton bt[][] = new JButton[3][3];
	public JButton send;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_GUI frame = new Main_GUI();
					frame.appendToPane(frame.AllMessage, "ssss \n", Color.CYAN);
					frame.appendToPane(frame.AllMessage, "ssss \n", Color.CYAN);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_GUI() {
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 484);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane.setBounds(34, 39, 463, 336);
		contentPane.add(scrollPane);
		
		AllMessage = new JTextPane();
		AllMessage.setBackground(new Color(255, 204, 204));
		SimpleAttributeSet aSet = new SimpleAttributeSet();
		StyleConstants.setLineSpacing(aSet, 1);
		AllMessage.setParagraphAttributes(aSet, false);
		AllMessage.setMargin(new Insets(15, 13, 15, 13));
		AllMessage.setAlignmentX(1.5f);
		AllMessage.setAlignmentY(3.0f);
		AllMessage.setFont(new Font("NVN Daikon", Font.PLAIN, 15));
		AllMessage.setEditable(false);
		appendToPane(AllMessage, "BOT: " + "Xin ch\u00E0o, t\u00F4i c\u00F3 th\u1EC3 gi\u00FAp g\u00EC cho b\u1EA1n.\n", Color.red);
		scrollPane.setViewportView(AllMessage);
//		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
//		    @Override
//		    protected void configureScrollBarColors() {
//		        this.thumbColor = new Color(255, 105, 180);
//		    }
//		});
		
		JPanel panel = new JPanel();
		panel.setBounds(517, 133, 172, 172);
		panel.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				bt[i][j] = new JButton();
				bt[i][j].setActionCommand((i * 3 + j) + "");
				bt[i][j].setBorder(new LineBorder(new Color(255, 204, 204), 1));
				panel.add(bt[i][j]);
			}
		contentPane.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(34, 392, 463, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		message = new JTextField();
		message.setBounds(2, 2, 404, 26);
		panel_1.add(message);
		message.setBackground(new Color(255, 204, 204));
		message.setFont(new Font("NVN Daikon", Font.PLAIN, 12));
		message.setColumns(10);
		
		send = new JButton();
		send.setIcon(getIcon("send", 57, 24));
		send.setBorder(null);
		send.setFont(new Font("NVN Daikon", Font.PLAIN, 9));
		send.setBackground(new Color(255, 153, 102));
		send.setBounds(406, 4, 54, 22);
		panel_1.add(send);
		
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	public void setIconButton(char board[][]) {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				bt[i][j].setIcon(getIcon(board[i][j] + "", 57, 57));
	}
	
	public Icon getIcon(String index, int w, int h) {
		Image image = new ImageIcon(getClass().getResource("/Images/" + index + ".png")).getImage();
		Icon ic = new ImageIcon(image.getScaledInstance(w, h, image.SCALE_SMOOTH));
		return ic;
	}
	
	public void appendToPane(JTextPane tp, String msg, Color c) {
		AllMessage.setEditable(true);
		StyleContext sc = StyleContext.getDefaultStyleContext();
		javax.swing.text.AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);
		
		aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
		aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
		
		int len = tp.getDocument().getLength();
		tp.setCaretPosition(len);
		tp.setCharacterAttributes(aset, false);
		tp.replaceSelection(msg);
		AllMessage.setEditable(false);
	}
}
