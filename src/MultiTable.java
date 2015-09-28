import java.util.Scanner;
public class MultiTable {
	
	public static void main(String[] args){
		int c, n;
		
		System.out.println(" Enter the Number for which you want a multi table");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println("The multi table for " +n);
		
		for(c=1; c<= 10; c++){
			System.out.println(n+"*"+c+" = "+(n*c)); //plus sign after c
			
		}
		
		
	}

}
