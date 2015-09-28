
import java.util.*;

public class deletedups {
	
	
	
	public void deleteDups(node n){
		  HashSet<Integer> set = new HashSet<Integer>();
		 node previous = null;
		  while(n!=null){
		      if(set.contains(n.data)){
		          previous.next = n.next;  
		      } else {
		          set.add(n.data);
		          previous = n;
		      }
		      n = n.next;
		  }
		}
	
	public static int nthtolast(node n, int k){
		
		if(n == null){
			return 0;
		}
		
		int i = nthtolast(n.next, k) +1;
		if(i==k) {
			System.out.println(n.data);
		}
		
		return i;
	}
	
	
	public static node nthToLast( node head, int k){
		
		node p1 = head;
		node p2 = head;
		
		for(int i =0; i<k-1; i++){
			
			if(p2 == null) return null;
			p2 = p2.next;
		}
		
		if(p2 == null) return null;
		
		while(p2.next!=null){
			p2 = p2.next;
			p1 = p1.next;
		}
		
		return p1;
	}
      
   
   public static void main (String args[]){
	   linkedlist list=new linkedlist();
       deletedups dp = new deletedups();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insert(4);
       list.insert(5);
       list.insert(6);
       list.insert(7);
//      list.displaylist();
//       System.out.println();
       node head=list.getHead();
//       dp.deleteDups( head);
//       list.displaylist();
       
      //System.out.println(dp.nthtolast(head, 3)); 
      
      System.out.println(dp.nthToLast(head, 3).data);
      
      
   }
}