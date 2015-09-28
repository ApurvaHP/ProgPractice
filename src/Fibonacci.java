import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the number for fibo series");
		 
		int number = new Scanner(System.in).nextInt();
		
				
		for(int i =1; i <= number; i++)
		{
			System.out.println(Fibo2(i) + "");
		}
		
		//Fibonacci(number);
		//Fibo2(number);
		
	}
	
	public static int Fibonacci(int number){
		
		if(number ==1 || number == 2){
			return 1;
		}
		
		return Fibonacci(number-1) + Fibonacci(number - 2);
		
	}
	
	public static int Fibo2(int number){
		
		if(number ==1 || number == 2){
			return 1;
		}
		
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for(int i = 3; i<= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			
		}
		return fibonacci;
			
		
	}

}
