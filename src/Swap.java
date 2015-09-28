import java.util.Scanner;
public class Swap {
	
	public static void main(String[] args){
		int x, y, temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the two numbers x and y");
		x= in.nextInt();
		y= in.nextInt();
		System.out.println("Number before swapping x: "+x+"and y:"+y);
		
		
		temp = x;
		x = y;
		y= temp;
		
		System.out.println("the value of x:"+x+"and y:"+y);
		
	}

}
