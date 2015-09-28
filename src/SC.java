
public class SC {

	private int maxsize;
	private char[] stackA;
	private int top = -1;
	
	public SC(int size){
		
		this.maxsize = size;
		stackA = new char[maxsize];
		
		}
	
	public void push(char key){
		
		top++;
		stackA[top] = key;
	}
	
	public char pop(){
		
		return stackA[top--];
	}
	
	public void peek(){
		
		System.out.println(stackA[top]);
	}
	
	public boolean isempty(){
		return (top == -1);
	}
	
	public void display(){
		
		for(top = 0 ; top < maxsize ; top--){
			
			System.out.println(stackA[top]);
		}
	}
	
	public boolean isfull(){
		
		return (top ==maxsize -1);
	}
}
