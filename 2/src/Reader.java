import javax.swing.JOptionPane;

public class Reader {
	int i, k;
	String n1, n2;
	
	public void Scan(){
		
		n1 = JOptionPane.showInputDialog("������� 1 �����");
		n2 = JOptionPane.showInputDialog("������� 2 �����");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
		
	}
	public void Scan(int a, int b){
		
		JOptionPane.showMessageDialog(null, "������ ���� 1 ����� = "+a);
		JOptionPane.showMessageDialog(null, "������ ���� 2 ����� = "+b);
		
	}
	/*
	int k;
	public void Scan(){
			System.out.println("������� �����");
			Scanner scn = new Scanner(System.in);
			i = scn.nextInt();
			System.out.println("������� ����� 2");
	//		Scanner scn = new Scanner(System.in);
			k = scn.nextInt();
	}
	*/
	
}
