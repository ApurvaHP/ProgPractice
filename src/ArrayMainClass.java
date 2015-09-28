 
public class ArrayMainClass {
	
	public static void main(String[] args) {
		
		ArrayClass ac = new ArrayClass(6);
		ArrayClass ac1 = new ArrayClass(5);
		
		
		
		
		ac1.insert(20);
		ac1.insert(30);
		
		
		ac.insert(77); // insert 10 items
		ac.insert(99);
		ac.insert(44);
		ac.insert(55);
		ac.insert(22);
		ac.insert(88);
		//ac.insert(11);
		//ac.insert(00);
		//ac.insert(66);
		//ac.insert(33);
		
		//ac.selectionsort();
		ac.bubblesort();
		//ac.InsertionSort();
		//ac.shellSort();
		ac.display();
		
		//ac.search(22);
		//ac.delete(11);
		//System.out.println("Binary Serached the element is at :" +ac.find(11));
		
		
	}


}
