import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Label;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JScrollBar;


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
	private JLabel label_1;
	private JLabel imagelable;

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
		 mntmSaveImage.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		JFileChooser chouser = new JFileChooser();
		 		int reply = chouser.showSaveDialog(null);
		 		if(reply == JFileChooser.APPROVE_OPTION){
		 			Main.saveImage(chouser.getSelectedFile(), choice.getSelectedItem());
		 			
		 		}
		 	}
		 });
		mnFile.add(mntmSaveImage);
		
		
		mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		 mntmExit = new JMenuItem("Exit");
		 mntmExit.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		System.exit(0);
		 	}
		 });
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
		 btnGetImage.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) 
		 	{
		 		try {
		 			System.out.println(Main.getImage());
					Main.setImage(new URL(txtrEnterUrl.getText()));
					System.out.println(Main.getImage());
				} catch (MalformedURLException e) {

					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Invalid URL");
				}
		 		
		 	}
		 });

		btnGetImage.setBounds(10, 7, 108, 23);
		panel1.add(btnGetImage);
		
		btnGetFile = new JButton("Get file");
		btnGetFile.addActionListener(new ActionListener(){
			
		
			public void actionPerformed(ActionEvent e){

					JFileChooser chouser = new JFileChooser();

					int reply = chouser.showOpenDialog(null);
					Main.setImage(chouser.getSelectedFile());
					if(reply == JFileChooser.APPROVE_OPTION){
						Main.setImage(chouser.getSelectedFile());
					}
			}
		}
				);
			
		
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
		 btnView.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		if(Main.getImage()==null){return;};
		 		imagelable.setIcon(new ImageIcon(Main.getImage()));
		 		imagelable.updateUI();
		 	}
		 });
		btnView.setBounds(10, 10, 89, 23);
		panel2.add(btnView);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 58, 548, 300);
		panel2.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imagelable = new JLabel("");
		panel.add(imagelable, BorderLayout.CENTER);
		
		//label_1 = new JLabel("New label");
		//panel.add(label_1, BorderLayout.CENTER);
		
		setVisible(true);
		
//		menuBar.repaint();
//		mnFile.updateUI();
//		mnOption.updateUI();
		

	}
}
