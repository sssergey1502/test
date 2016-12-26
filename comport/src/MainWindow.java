

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.io.OutputStream;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class MainWindow extends JFrame {
	private JTextField textField;
	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(800,600);
		getContentPane().setLayout(null);
		

		

		
		JButton btnLedOn = new JButton("Led 1 ON");
		btnLedOn.setBounds(593, 32, 89, 23);
		getContentPane().add(btnLedOn);
		
		JButton btnLedOff = new JButton("Led 1 OFF");
		btnLedOff.setBounds(695, 32, 89, 23);
		getContentPane().add(btnLedOff);
		
		JButton btnLedOff_1 = new JButton("Led 2 OFF");
		btnLedOff_1.setBounds(695, 66, 89, 23);
		getContentPane().add(btnLedOff_1);
		
		JButton btnLedOn_1 = new JButton("Led 3 ON");
		btnLedOn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLedOn_1.setBounds(593, 100, 89, 23);
		getContentPane().add(btnLedOn_1);
		
		JButton btnLedOn_2 = new JButton("Led 2 ON");
		btnLedOn_2.setBounds(593, 66, 89, 23);
		getContentPane().add(btnLedOn_2);
		
		JButton btnLedOn_3 = new JButton("Led 4 ON");
		btnLedOn_3.setBounds(593, 134, 89, 23);
		getContentPane().add(btnLedOn_3);
		
		JButton btnLedOn_4 = new JButton("Led 5 ON");
		btnLedOn_4.setBounds(593, 168, 89, 23);
		getContentPane().add(btnLedOn_4);
		
		JButton btnLedOn_5 = new JButton("Led 6 ON");
		btnLedOn_5.setBounds(593, 202, 89, 23);
		getContentPane().add(btnLedOn_5);
		
		JButton btnLedOn_6 = new JButton("Led 7 ON");
		btnLedOn_6.setBounds(593, 236, 89, 23);
		getContentPane().add(btnLedOn_6);
		
		JButton btnLedOn_7 = new JButton("Led 8 ON");
		btnLedOn_7.setBounds(593, 270, 89, 23);
		getContentPane().add(btnLedOn_7);
		
		JButton btnLedOff_2 = new JButton("Led 3 OFF");
		btnLedOff_2.setBounds(695, 100, 89, 23);
		getContentPane().add(btnLedOff_2);
		
		JButton btnLedOff_3 = new JButton("Led 4 OFF");
		btnLedOff_3.setBounds(695, 134, 89, 23);
		getContentPane().add(btnLedOff_3);
		
		JButton btnLedOff_4 = new JButton("Led 5 OFF");
		btnLedOff_4.setBounds(695, 168, 89, 23);
		getContentPane().add(btnLedOff_4);
		
		JButton btnLedOff_5 = new JButton("Led 6 OFF");
		btnLedOff_5.setBounds(695, 202, 89, 23);
		getContentPane().add(btnLedOff_5);
		
		JButton btnLedOff_6 = new JButton("Led 7 OFF");
		btnLedOff_6.setBounds(695, 236, 89, 23);
		getContentPane().add(btnLedOff_6);
		
		JButton btnLedOff_7 = new JButton("Led 8 OFF");
		btnLedOff_7.setBounds(695, 270, 89, 23);
		getContentPane().add(btnLedOff_7);
		
		JButton btnAllOn = new JButton("All ON");
		btnAllOn.setBounds(593, 304, 89, 23);
		getContentPane().add(btnAllOn);
		
		JButton btnAllOff = new JButton("All OFF");
		btnAllOff.setBounds(695, 304, 89, 23);
		getContentPane().add(btnAllOff);
		
		Choice choice = new Choice();
		choice.setBounds(10, 377, 200, 50);
		getContentPane().add(choice);
		
		choice.add("COM1");
		choice.add("COM2");
		choice.add("COM3");
		choice.add("COM4");
		choice.add("COM5");
		choice.add("COM6");
		choice.add("COM7");
		choice.add("COM8");
		choice.add("COM9");
		choice.add("COM10");
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
	        {
	            (new RxTx()).connect(choice.getSelectedItem());
	        }
	        catch ( Exception e )
	        {
	                System.out.println("No connect");
	            e.printStackTrace();
	        }
				
			}
		});
		btnConnect.setBounds(228, 377, 89, 23);
		getContentPane().add(btnConnect);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 561, 294);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("Terminal");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 551, 21);
		getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpenMp = new JMenuItem("Open mp3");
		mnFile.add(mntmOpenMp);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		


	
		setVisible(true);
			}
	}

	