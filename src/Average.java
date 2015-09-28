
public class Average {
	
	public static void main ( String[] args){
		System.out.println(average(52, 46, 87, 91));
	}

	public static int average(int...numbers) {
	
	int total = 0;
	for(int x: numbers)
		total+=x;
		
		return total/numbers.length;
		
		}

}
