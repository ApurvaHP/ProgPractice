
public class mergesort {

	private int[] C;

	
	public mergesort(){
		
	}
	
	public void merge(int[] A, int Asize, int[] B , int Bsize, int[] C ) {
		int Ahex = 0,  Bhex=0,  Chex = 0;
	
		
		while( Ahex< Asize && Bhex < Bsize) {
			
			if(A[Ahex] < B[Bhex])
				C[Chex++] = A[Ahex++];
			else
				C[Chex++] = B[Bhex++];
		}
		
		
		while( Ahex< Asize)
			C[Chex++] = A[Ahex++];
		
		while( Bhex< Bsize)
			C[Chex++] = B[Bhex++];
		
	}
	
	public void display(int[] C){
		
		for(int Chex=0; Chex<C.length; Chex++)
			System.out.println("elements:" + C[Chex]);
	}
	
 public static void main(String[] args) {
	 
		 int[] A = {3, 5, 10, 13};
		 int[] B = {2, 12, 15, 30, 46, 66};
		 int[] C = new int[10];	
		 
		 mergesort m = new mergesort();
		 m.merge(A, 4, B, 6, C);
		 m.display(C);
		
	
}

}
