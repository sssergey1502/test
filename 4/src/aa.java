
public class aa {
	public static void main(String args[]){
		int[][] m ={{1,6,5},{5,7},{7,2,4}};
		// int[][] m = new int[3][3];
	
		for(int row = 0;row<m.length;row++){
			System.out.println("");
			for(int col =0 ;col<m[row].length;col++){
				System.out.print(m[row][col]+"  ");
			}
		}
		
	}

}