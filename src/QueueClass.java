
public class QueueClass {

	private int[] QA;
	private int maxsize;
	private int front;
	private int rear;
	private int nelems;
	private int temp;
	
		public QueueClass(int s){
		maxsize = s;
		QA = new int[maxsize];
		front=0;
		rear =-1;
		nelems=0;
		
		}
	
		public void insert(int value){
		
			if(rear == maxsize-1)
			rear = -1;
			
			QA[++rear] = value;
			nelems++;
	}
		
		public int remove(){
			
			temp = QA[front++];
			if(front == maxsize)
				front = 0;
			nelems--;
			return temp;
			
		}
		
		public int peek(){
			
			return QA[front];
		}
		
		public boolean isempty(){
			
			return nelems==0;
		}
	
		public boolean isfull(){
			
			return nelems == maxsize;
		}
		
		public int size(){
			
			return nelems;
		}
		
		
		public static void main(String[] args) {
			
			QueueClass qc = new QueueClass(5);
			 
			qc.insert(55);
			qc.insert(22);
			qc.insert(10);
			qc.insert(12);
			
			System.out.println("front" + qc.peek() );
						
			qc.remove();
			qc.remove();
			
			qc.insert(15);
			qc.insert(89);
			
			System.out.println("front" + qc.peek() );
			
			while( !qc.isempty() ){
				int n = qc.remove();
				
				System.out.println("" +n);
			}
			
			
		}
}



