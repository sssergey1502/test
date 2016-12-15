import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class MainWinsow extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSaveImage;
	private JMenu mnOption;
	private JMenuItem mntmExit;
	private JPanel panel1;
	private JPanel panel2;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrl;
	private JButton btnGetImage;
	private JButton btnGetFile;
	private Choice choice;
	private Label label;
	private JButton btnView;

	public MainWinsow(int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(640, 480);
		getContentPane().setLayout(null);
		
		 menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 377, 28);
		getContentPane().add(menuBar);
		
		 mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		 mntmSaveImage = new JMenuItem("Save Image");
		mnFile.add(mntmSaveImage);
		
		
		mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		 mntmExit = new JMenuItem("Exit");
		mnOption.add(mntmExit);
		
		panel1 = new JPanel(null);
		 panel2 = new JPanel(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 45, 604, 397);
		getContentPane().add(tabbedPane);
		
		setResizable(true);
		tabbedPane.addTab("Tab 1", panel1);
		panel1.setLayout(null);
		
		 txtrEnterUrl = new JTextArea();
		txtrEnterUrl.setText("Enter URL");
		txtrEnterUrl.setBounds(10, 53, 579, 305);
		panel1.add(txtrEnterUrl);
		
		 btnGetImage = new JButton("Get image");

		btnGetImage.setBounds(10, 7, 108, 23);
		panel1.add(btnGetImage);
		
		btnGetFile = new JButton("Get file");
		btnGetFile.setBounds(150, 7, 108, 23);
		panel1.add(btnGetFile);
		tabbedPane.addTab("Tab 2", panel2);
		panel2.setLayout(null);
		
		 choice = new Choice();
		choice.setBounds(444, 10, 128, 31);
		panel2.add(choice);
		
		choice.add("png");
		choice.add("jpg");
		
		label = new Label("Format");
		label.setBounds(360, 10, 62, 22);
		panel2.add(label);
		
		 btnView = new JButton("View");
		btnView.setBounds(10, 10, 89, 23);
		panel2.add(btnView);
		
		setVisible(true);
		
//		menuBar.repaint();
//		mnFile.updateUI();
//		mnOption.updateUI();
		

	}
}
