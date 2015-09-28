
public class partitionLL {
	
	public node partition( node n , int k ){
		
		node before = null;
		node beforeend = null;
		node after = null;
		node afterend = null;
		
		while( n != null){
			
			node next = n.next;
			n.next = null;
			
			if(n.data < k){
				if(before == null){
					before = n;
					beforeend = before;
				}
				else 
					beforeend.next = n;
					beforeend = n;
			}
			
			else 
			{
				if (after == null){
					after = n;
					afterend = after;
				}
				else 
				{
					afterend.next = n;
					afterend = n;
				}
			}
					
			n = next;
		}
			
		if ( before == null){
			return after;
		}
		beforeend.next = after;
		return before;
	}
	
	
	public static void main(String[] args){
		 linkedlist list=new linkedlist();
	      partitionLL pl = new partitionLL();
	       list.insert(0);
	       list.insert(3);
	       list.insert(9);
	       list.insert(4);
	       list.insert(8);
	       list.insert(2);
	       list.insert(1);
	       list.displaylist();
	       node head=list.getHead();
	       
	      System.out.println(pl.partition(head, 4).data); 
	      list.displaylist();
	       
	       
	}

}
