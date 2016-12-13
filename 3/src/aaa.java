import javax.swing.JFrame;


public class aaa {
	public static void main(String args[]){
		Reader r = new Reader("Калькулятор");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(250, 300);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
