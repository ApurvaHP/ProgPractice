import java.util.Scanner;


public class ReverseString {
	
	private String input;
	private String output;
		
	public ReverseString(String in){
		input = in;
	}
	
	public String dorev(){
		
		int maxsize = input.length();
		StackClass sc = new StackClass(maxsize);
		
		for(int j = 0; j<input.length() ; j++){
			
			char ch = input.charAt(j);
			sc.push(ch);		
		}
		
		output = "";
		
		while(!sc.isempty()){
			char ch = sc.pop();
			output = output+ch;
		}
		
		return output;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		ReverseString rs = new ReverseString(input);
		
		rs.dorev();
		
		System.out.println("reversed : " + rs.dorev());
		
	}

	
}
