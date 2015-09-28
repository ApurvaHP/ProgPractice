
public class Apples {
	
	public static void main(String[] args) {
		
		int firstarray[][] = { { 1, 2, 3,4} , { 5, 6 ,7 , 8} } ;
		int seccondarray[][] = { { 1, 2, 3,} , { 5, 6 ,} , {9, 10 , 11, 12} } ;
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the seccond array");
		display(seccondarray);

	}

	public static void display( int x[][])
 {
		for (int row=0; row < x.length; row++) {
			for(int column=0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "\t") ;
			}
			System.out.println();
		}
	
			
 }
	
	
 }
