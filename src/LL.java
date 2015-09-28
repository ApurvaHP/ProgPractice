
		
public class LL{
	
	private node head;
	
	public LL(){
		head = null;
	}
	
	public void insert(int key){
		
		if(head == null){
			node n = new node(key);
			n = head;
			return;
		}
		else{
			
			node n = new node(key);
			n.next = head;
			head = n;
			return;		
		}
		
	}
	
	public void delete(int key){
		
		if(head == null)
			return;
		
		if(head.data == key){
		head = head.next;
			return;	
		}
		
		node prev = head;
		node cur = head.next;
		
		while(cur!= null)
		{
			if(cur.data == key){
				
				prev.next = cur.next;
				return;
			}
			else
			{
				cur = cur.next;
				prev= prev.next;
				return;
			}
		}
	}
	
	public node get(int key){
		
			node cur = head;
			
			while(cur.data!= key){
				
				if(cur.next == null)
					return null;
				else
					cur = cur.next;
			}
			
		return cur;
		
	}
	
	
	
	
}