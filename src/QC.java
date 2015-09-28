
public class QC {
	
	private int maxsize;
	private int[] qc;
	private int front ;
	private int rear ;
	private int nelems;
	private int temp;
	
	public QC( int size){
		this.maxsize = size;
		qc = new int[maxsize];
		rear =-1;
		front =0;
		nelems = 0;		
	}

	public void insert(int key){
		
		if(rear == maxsize -1)
			rear = -1;
		
			qc[rear++] = key;
		nelems++;
	}
	
	public int remove(){
		
		temp = qc[front++];
		
		if (front == maxsize)
			front = 0;
		
		nelems--;
		return temp;
		
	}
	
	public int peek(){
		
		return qc[front];
	}
	
	public boolean isempty(){
		
		return nelems == 0;	
	}
	
	public boolean isfull(){
		
		return nelems ==maxsize;
	}
	
	public int size(){
		
		return nelems;
		
	}
		
}
