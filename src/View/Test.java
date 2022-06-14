package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Music;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Desktop d = Desktop.getDesktop();
		try {
		    d.browse(new URI("http://google.com"));
		} catch (Exception e2) {
		    e2.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setForeground(new Color(255, 105, 180));
		lblNewLabel.setBounds(137, 153, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ch\u00E0o");
		lblNewLabel_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1.setBounds(90, 157, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music music = new Music();
				music.sound(1);
			}
		});
		btnNewButton.setBounds(152, 32, 104, 48);
		contentPane.add(btnNewButton);
	}
	
	 
}
