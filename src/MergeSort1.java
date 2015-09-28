
public class MergeSort1 {

	private int nelems;
	public MergeSort1(){
		
		int[] A = new int[nelems];
		Recmergesort( A, 0, nelems-1);
	}
	
	public void Recmergesort( int[] A, int lowerbound, int upperbound){
		
		if(lowerbound == upperbound)
			return;
		
		else {
			
			int mid = (lowerbound + upperbound)/2;
			
			Recmergesort(A, lowerbound, mid);
			
			Recmergesort(A, mid+1, upperbound);
			
			//merge(A, lowerbound, mid+1, upperbound);
			
		}
	}
	
	public void merge(){
		
	}
}
