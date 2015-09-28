
public class StackClass {
	
	private int maxsize;
	private char[] StackArray;
	private int top;
	
	
	public StackClass(int size){
		
		maxsize = size;
	    StackArray = new char[maxsize];
		top=-1;
		
	}
	
	public void push(char key){
	
		//StackArray[++top] = key;
		
		top++;
		StackArray[top] = key;
	}

	public char pop(){
					
		return StackArray[top--];
		
	}
	
	public char peek(){
		
		System.out.println("element on top" +StackArray[top]);
		return StackArray[top];
		
	}
	
	public boolean isempty(){
		
		return (top==-1);
		
//			if(top ==-1)
//			return true;
	}
	
	public void display(){
		
		for(top=0; top < maxsize; top++){
			
			System.out.println("stack elements are" +StackArray[top]);
		}
	}
	
	public boolean isfull(){
		
		return (top == maxsize-1);
	}
}
