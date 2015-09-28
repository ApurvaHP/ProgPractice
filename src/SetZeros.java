
public class SetZeros {
	
	public void setzero(int[][] M) {
		
		boolean[] row = new boolean[M.length];
		boolean[] column = new boolean[M[0].length];
				
		for (int i =0; i< M.length; i++){
			for(int j =0; j<M[0].length; j++){
				
				if(M[i][j] == 0){
					
			row[i] = true;
			column[j] = true;
			}
		}
	}
	
	for(int i=0; i<row.length ; i++){
		if(row[i]) nullifyRow(M, i);
	}
	
	for(int j =0; j<column.length; j++){
		if(column[j]) nullifyColumn(M,j);
	}
	
	System.out.println("setting zeros");
	for(int i=0;i<M.length; i++){
		for(int j =0; j<M[0].length; j++){
			System.out.print(M[i][j]);
		}
	}
}
	public void nullifyRow(int[][]M, int row){
		for(int j=0; j<M[0].length; j++)
			M[row][j] = 0;
		
	}
	
	public void nullifyColumn(int[][]M, int col){
		for(int i=0; i<M.length; i++)
			M[i][col] = 0;
		
	}
	
	public static void main(String[] args) {
		int[][] M = {{4, 5, 6}, {3,0,1}, {7,8,9} };
		
		SetZeros sz = new SetZeros();
		sz.setzero(M);
	}
	
}
