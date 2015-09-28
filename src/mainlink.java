
public class mainlink {
	
	public static void main(String[] args) {
		
		linkedlist ll = new linkedlist();
		
		ll.insert(22);
		ll.insert(32);
		ll.insert(44);
		ll.insert(11);
		
		//ll.displaylist();
		
		ll.remove(32);
		
		//ll.displaylist();
		
		ll.get(11);
		
		ll.displaylist();
	}

}
