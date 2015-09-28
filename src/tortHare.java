
public class tortHare {
	
	public static node findstart(node head){
		
		node slow = head;
		node fast = head;
		
		while(fast !=null && fast.next != null){
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				break;
		}
		
		if(fast == null || fast.next == null)
			return null;
		
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	
		
	}
	
	public static void main(String[] args) {
		 linkedlist list=new linkedlist();
	      tortHare th = new tortHare();
	       list.insert(1);
	       list.insert(3);
	       list.insert(9);
	       list.insert(4);
	       list.insert(8);
	       list.insert(2);
	       list.insert(3);
	       list.displaylist();
	       node head=list.getHead();
	       
	       System.out.println(th.findstart(head).data);
	       
	}

}
