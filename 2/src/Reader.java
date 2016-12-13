import javax.swing.JOptionPane;

public class Reader {
	int i, k;
	String n1, n2;
	
	public void Scan(){
		
		n1 = JOptionPane.showInputDialog("ВВедите 1 число");
		n2 = JOptionPane.showInputDialog("ВВедите 2 число");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
		
	}
	public void Scan(int a, int b){
		
		JOptionPane.showMessageDialog(null, "Теперь ваше 1 число = "+a);
		JOptionPane.showMessageDialog(null, "Теперь ваше 2 число = "+b);
		
	}
	/*
	int k;
	public void Scan(){
			System.out.println("ВВедите число");
			Scanner scn = new Scanner(System.in);
			i = scn.nextInt();
			System.out.println("ВВедите число 2");
	//		Scanner scn = new Scanner(System.in);
			k = scn.nextInt();
	}
	*/
	
}
