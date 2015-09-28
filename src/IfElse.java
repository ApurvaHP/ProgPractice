import java.util.Scanner;

public class IfElse {
	
	public static void main (String[] args){
		
		int passing_number = 40;
		
		int marks_obtained = 0 ;
		
		System.out.println("enter marks scored:");
		
		Scanner input = new Scanner(System.in);
		
		try {
		    marks_obtained = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
		    System.out.println("its not a valid input");
		    return ;
		}
		
		
		
		//marks_obtained = input.nextInt();
		
				if(marks_obtained>=passing_number){
			System.out.println("the student has passed");
		}
			
			else{
							System.out.println("the student has failed");
			}
		}
		
		
	}


