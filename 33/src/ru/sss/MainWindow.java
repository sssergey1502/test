package ru.sss;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
	private TutorListModel model;
	private JList<String> list;
	private JButton remove_btn;
	private JButton addbtn;
	int l=0;
	private JButton btnAdd;
	

	@SuppressWarnings("rawtypes")
	public MainWindow()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		setResizable(false);

		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 300, 430);
		getContentPane().add(scrollPane);
		
		model = new TutorListModel();
		
		list = new JList<String>(model);
		scrollPane.setViewportView(list);
		
		remove_btn = new JButton("Remove");
		remove_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				java.util.List<String> object = list.getSelectedValuesList();
			//	model.removeElement(list.getSelectedValue());
				for(String s: object){
					model.removeElement(s);
				}
				list.updateUI();
			}
		});
		remove_btn.setBounds(391, 28, 89, 23);
		getContentPane().add(remove_btn);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("Input text");
				model.addElement(s);
				list.updateUI();
			}
		});
		btnAdd.setBounds(391, 67, 89, 23);
		getContentPane().add(btnAdd);
		
		setVisible(true);
		list.updateUI();
	}
	
	public void addElement(String s){
		model.addElement(s);
	}
	public void removeElement(int index){
		model.removeElement(index);
	}
	public void updateUI(){
		list.updateUI();
	}
}
