package View;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Desktop;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class Main_GUI extends JFrame {

	public JPanel contentPane;
	public JTextField message;
	public JTextPane AllMessage;
	public JTextField textField_1;
	public JButton bt[][] = new JButton[3][3];
	public JButton send;
	private JPanel SendPanel;
	public JPanel GamePanel, infoPanel;
	int count = 0;
	int indexAvata = 1;
	int NAvata = 3;
	Timer waitGame, avataSlide;
	JLabel name;
	
	String Name[] = {"", "HaiZuka", "Mỹ Linh", "^^"};
	private JButton facebook;
	private JButton youtube;
	private JButton github;

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
		setType(Type.UTILITY);
		setVisible(true);
		//538 133
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 487);
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
		appendToPane(AllMessage, "[BOT]: " + "Xin ch\u00E0o, t\u00F4i c\u00F3 th\u1EC3 gi\u00FAp g\u00EC cho b\u1EA1n.\n", Color.red);
		scrollPane.setViewportView(AllMessage);
		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		    @Override
		    protected void configureScrollBarColors() {
		        this.thumbColor = new Color(250, 128, 114);
		    }
		});
		
		GamePanel = new JPanel();
		GamePanel.setVisible(false);
		GamePanel.setBounds(535, 122, 172, 172);
		GamePanel.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				bt[i][j] = new JButton();
				bt[i][j].setActionCommand((i * 3 + j) + "");
				bt[i][j].setBorder(new LineBorder(new Color(255, 204, 204), 1));
				GamePanel.add(bt[i][j]);
			}
		contentPane.add(GamePanel);
		
		SendPanel = new JPanel();
		SendPanel.setBackground(new Color(255, 204, 204));
		SendPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		SendPanel.setBounds(34, 392, 463, 30);
		contentPane.add(SendPanel);
		SendPanel.setLayout(null);
		
		message = new JTextField();
		message.setForeground(Color.RED);
		message.setMargin(new Insets(2, 12, 2, 2));
		message.setBounds(new Rectangle(13, 0, 0, 0));
		message.setBorder(null);
		message.setBounds(2, 2, 404, 26);
		SendPanel.add(message);
		message.setBackground(new Color(255, 204, 204));
		message.setFont(new Font("NVN Daikon", Font.BOLD, 15));
		message.setColumns(10);
		
		send = new JButton();
		send.setIcon(getIcon("send", 57, 24));
		send.setBorder(null);
		send.setFont(new Font("NVN Daikon", Font.PLAIN, 9));
		send.setBackground(new Color(255, 153, 102));
		send.setBounds(406, 4, 54, 22);
		SendPanel.add(send);
		
		infoPanel = new JPanel();
		infoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		infoPanel.setBounds(525, 39, 198, 383);
		infoPanel.setBackground(new Color(255, 204, 204));
		contentPane.add(infoPanel);
		infoPanel.setLayout(null);
		
		JButton avata = new JButton("");
		avata.setBorder(null);
		avata.setBounds(10, 11, 178, 226);
		avata.setIcon(getIcon("Avata1", avata.getWidth(), avata.getHeight()));
		infoPanel.add(avata);
		
		name = new JLabel(Name[1], SwingConstants.CENTER);
		name.setFont(new Font("NVN Daikon", Font.BOLD, 20));
		name.setBounds(10, 259, 178, 26);
		infoPanel.add(name);
		
		facebook = new JButton("");
		facebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenWeb("https://www.facebook.com/chiatayde/");
			}
		});
		facebook.setBounds(24, 317, 35, 35);
		facebook.setIcon(getIcon("facebook",  facebook.getWidth(), facebook.getHeight()));
		facebook.setBorder(null);
		infoPanel.add(facebook);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 290, 178, 2);
		infoPanel.add(separator);
		
		youtube = new JButton("");
		youtube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenWeb("https://www.youtube.com/haizuka");
			}
		});
		youtube.setBounds(82, 317, 35, 35);
		youtube.setIcon(getIcon("youtube",  youtube.getWidth(), youtube.getHeight()));
		youtube.setBorder(null);
		infoPanel.add(youtube);
		
		github = new JButton("");
		github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenWeb("https://github.com/zukahai");
			}
		});
		github.setBounds(140, 317, 35, 35);
		github.setIcon(getIcon("github",  github.getWidth(), github.getHeight()));
		github.setBorder(null);
		infoPanel.add(github);
		
		setLocationRelativeTo(null);
		setResizable(false);
		
		waitGame = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (++count == 5) {
					setPanelInfo();
					count = 0;
					waitGame.stop();
				}
			}
		});
		
		avataSlide = new Timer(3000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (++indexAvata > NAvata) {
					indexAvata = 1;
				}
				avata.setIcon(getIcon("Avata" + indexAvata, avata.getWidth(), avata.getHeight()));
				name.setText(Name[indexAvata]);
			}
		});
		avataSlide.start();
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
	
	public void addMessage(JTextPane tp, String object, String message) {
		appendToPane(tp, "[", Color.gray);
		appendToPane(tp, "]", Color.gray);
	}
	
	public void OpenWeb(String link) {
		Desktop d = Desktop.getDesktop();
		try {
		    d.browse(new URI(link));
		} catch (Exception e2) {
		    e2.printStackTrace();
		}
	}
	
	public void setPanelGame() {
		GamePanel.setVisible(true);
		infoPanel.setVisible(false);
	}
	
	public void setPanelInfo() {
		GamePanel.setVisible(false);
		infoPanel.setVisible(true);
	}
	
	public void waitGame() {
		waitGame.start();
	}
}
