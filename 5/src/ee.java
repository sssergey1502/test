import java.util.Scanner;
import java.io.File;

import javax.swing.JOptionPane;


public class ee {
		
	static String[][] m = new String[5][3];
	static Scanner scn;
	
	
	public static void main(String args[]){
		openFile();
		readFile();
		out();
	}

	private static void out() {
	
			for(int x=0;x<m.length;x++){
				for(int y=0;y<m[x].length;y++){
					System.out.print(m[x][y]+"    ");
				}
				System.out.println();
			}
			
			
		
	}

	private static void readFile() {
		while(scn.hasNext()){
			for(int x=0;x<m.length;x++){
				for(int y=0;y<m[x].length;y++){
					m[x][y] = scn.next();
				}
			}
			
		}
		
	}

	private static void openFile() {
		try{
		scn = new Scanner(new File("res//1.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "‘аил не найден");}
		
	}
}
