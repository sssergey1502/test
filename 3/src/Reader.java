import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17; 
	JLabel l5,l2, l3, l4;
	JTextField l1, t1, t2;
	int i, k, s=0, r, m;
	String a,b,c,d="";
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b10 = new JButton("0");
		b11 = new JButton("-");
		b12 = new JButton("+");
		b13 = new JButton("*");
		b14 = new JButton("/");
		b15 = new JButton("=");
		b16 = new JButton("C");
		b17 = new JButton("+/-");
	//	l1 = new JLabel("0");
		l2 = new JLabel("2 Number");
		l3 = new JLabel("");
		l4 = new JLabel("");
		l1 = new JTextField(20);
		t2 = new JTextField(10);
		l1.setEditable(false);
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b17);
		add(b16);
;
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
		b14.addActionListener(handler);
		b15.addActionListener(handler);
		b16.addActionListener(handler);
		b17.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
			
			if(e.getSource()==b1){
			d=d+"1";
				
				l1.setText(d);
			}
			if(e.getSource()==b2){
				d=d+"2";
					
					l1.setText(d);
				}
			if(e.getSource()==b3){
				d=d+"4";
					
					l1.setText(d);
				}
			if(e.getSource()==b4){
				d=d+"4";
				
					l1.setText(d);
				}
			if(e.getSource()==b5){
				d=d+"5";
				
					l1.setText(d);
				}
			if(e.getSource()==b6){
				d=d+"6";
				
					l1.setText(d);
				}
			if(e.getSource()==b7){
				d=d+"7";
				
					l1.setText(d);
				}
			if(e.getSource()==b8){
				d=d+"8";
			
					l1.setText(d);
				}
			if(e.getSource()==b9){
				d=d+"9";
				
					l1.setText(d);
				}
			if(e.getSource()==b10){
				d=d+"0";
				
					l1.setText(d);
				}
			// -
			if(e.getSource()==b11){
				i = Integer.parseInt(d);
				d="";
				s=1;
//					l1.setText(d);
				}
			// +
			if(e.getSource()==b12){
				i = Integer.parseInt(d);
				d="";
				s=2;
//					l1.setText(d);
				}
			// *
			if(e.getSource()==b13){
				i = Integer.parseInt(d);
				d="";
				s=3;
//					l1.setText(d);
				}
			// /
			if(e.getSource()==b14){
				i = Integer.parseInt(d);
				d="";
				s=4;
//					l1.setText(d);
				}
			// =
			if(e.getSource()==b15){
				k = Integer.parseInt(d);
						if(s==1){
							r=i-k;
						}
				if(s==2){
					r=i+k;
				}
				if(s==3){
					r=i*k;
				}
				if(s==4){
					r=i/k;
				}
				
				d=""+r;
		
					l1.setText(d);
				}
				
	/*
				i = Integer.parseInt(t1.getText());
				k = Integer.parseInt(t2.getText());
				i++;
				k++;
				a = "1 number " + i;
				b = "2 number " + k;
				l3.setText(a);
				l4.setText(b);
				*/
			
			
			if(e.getSource()==b16){
				s=0;
				i=0;
				k=0;
				d="";
				l1.setText(d);
			}
			
				if(e.getSource()==b17){
					m = Integer.parseInt(d);
					m=m*-1;
					d=""+m;
					l1.setText(d);
				}

			
			}catch (Exception ex) { JOptionPane.showMessageDialog(null, "ошибка");}
		}
		
	}
}
