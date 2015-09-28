
public class RotateMatrix {
	
	private int[][] M;
	private int temp;
	
public int[][] Transpose(int[][] M, int n){
	
	for(int i =0; i<n; i++){
		for(int j=i+1; j<n; j++){
			
			temp = M[i][j];
			M[i][j]=M[j][i];
			M[j][i] = temp;
		}
	}
	
	return M;
	
}

public void interchange( int[][] M, int n){
	
	int x = 0 ;
	int y = n-1;
	
	while(x!= y) 
	{
		for(int i=0;i<n;i++)
		{
			
			temp = M[i][x];
			M[i][x] = M[i][y];
			M[i][y] = temp;
			
										
		}
		
		x++; 
		y--;
		
	}
		
	System.out.println("interchanged");			
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
          System.out.print(M[i][j]);
		}
		  System.out.println();
	}
		
}
	
	
	public static void main(String[] args) {
		
		int[][] M = {{1, 5, 3, },
					 {2, 4, 1, },
					 {6, 7, 8, },};
		RotateMatrix rm = new RotateMatrix();
		rm.interchange( (rm.Transpose(M,3)), 3);
	
	}

}
