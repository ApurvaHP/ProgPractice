
public class ArrayClass {
	
	private int nelems;
	private int[] A;
	private int index = 0;
	
	public ArrayClass(int max){
		 this.nelems = max;
		
		 A = new int[max];
	}
		
	public void search(int key){
		int j;
		for(j=0; j<A.length; j++){	
			
			if (A[j] == key)
			{
				System.out.println(" Item found at position :" +j);	
				return;
			}
		}	
		
		System.out.println("Item not found");
	}
	
	public boolean delete( int key){
		
		int j;
		for ( j=0; j<nelems; j++)
			if(key == A[j])		
				break;
			
			if(j==nelems)
			{ // can’t find it
				System.out.println("key not found");
				return false;
			}
			else // found it
			{
				for(int k=j; k<index-1; k++)
				{ // move higher ones down
					A[k] = A[k+1];
				}
				index--; // decrement size

				System.out.println("key has been deleted");
				return true;
			}
			
}
				
			

	public void insert(int key) // put element into array
	{
		if( index<nelems){
		A[index] = key;
		index++;
		}
		else
			System.out.println(" Array  is full");

	
	}
	
	public void selectionsort(){
		
		int min, out, in ;
		
		for(out=0; out<nelems-1; out++){
			min=out;
		for(in=out+1; in<nelems; in++)
			if(A[in] < A[min])
				min=in;
			swap(min,out);
		}
	}
	
	public void InsertionSort(){
		int out, in, temp;
		for(out=1; out<nelems; out++){
			temp = A[out];
			in=out;
			while(in>0 && A[in-1] >= temp)
			{
				 A[in] = A[in-1] ;
				 --in;
			}
			A[in] = temp;
		}
	}
	
	public void bubblesort(){
		int out, in;
		
		for(out=nelems-1; out>0; out--){
			
			for(in=0; in<out;in++){
				if(A[in]>A[in+1])
					swap(in, in+1);
			}
		}
	}
	
	public void bubblesort(int z){
		
	}
	
	public void shellSort()
	{
	int inner, outer;
	int temp;
	int h = 1; // find initial value of h
	while(h <= nelems/3)
	h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
	while(h>0) // decreasing h, until h=1
	{
	// h-sort the file
	for(outer=h; outer<nelems; outer++)
	{
	temp =A[outer];
	inner = outer;
	// one subpass (eg 0, 4, 8)
	while(inner > h-1 && A[inner-h] >= temp)
	{
	A[inner] = A[inner-h];
	inner -= h;
	}
	A[inner] = (int) temp;
	} // end for
	h = (h-1) / 3; // decrease h
	} // end while(h>0)
	} // end shellSort()
	
	
		public void display() // displays array contents
	{
		for(int j=0; j<nelems; j++) // for each element,
		System.out.println("Array elements:" + A[j]);
		
	}
	
	public void swap(int a, int b){
		
		int temp;
		
		temp = A[a];
		A[a]= A[b];
		A[b]=temp;
			
	}
	

	
	public int find(int key){
		
		int lowerbound = 0;
		int upperbound = nelems-1;
		int curIn;
		
		while(true){
			curIn = (lowerbound+upperbound)/2;
			
			if(A[curIn] == key)
				return curIn;
			
			else if(lowerbound > upperbound)
				return nelems;
			
			else {
				if(A[curIn] < key)
					lowerbound = curIn+1;
				else
					upperbound = curIn-1;
			}
			
		}

	}
}
