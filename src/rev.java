
public class rev {
	
	//char[] A;
	public rev(){
	
	}
	
	public void swap(char a, char b){
		
		char temp;
		
		temp = a;
		a= b;
		b=temp;
			
	}
	
	
	
	public static void main(String[] args) {
		
		rev r = new rev();
		
		String str = "abcdefg";
		
		char[] A = str.toCharArray();
		
		for(int i =0; i<str.length(); i++){
					
		r.swap(str.charAt(i), str.charAt(str.length()-1));
		}
		
		System.out.println(r.toString());
	}

}
