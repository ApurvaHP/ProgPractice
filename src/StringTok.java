import java.util.StringTokenizer;

public class StringTok {
	
	public StringTok(){
	}
	
	private static String removechar(String str, char ch){
			if(str==null)
				return null;
			else
				
			return str.replaceAll(Character.toString(ch), "");	
			
		
}
   public static void main(String[] args) {
     // String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
     // String strReverse;
//      StringBuilder sb = new StringBuilder();
//      StringTokenizer st = new StringTokenizer(str);
//   
//      while (st.hasMoreTokens()) {
//         sb.insert(0, st.nextToken());
//         if (st.hasMoreTokens()) {
//            sb.insert(0, " ");
//         }
//      }
//      strReverse = sb.toString();
//      System.out.println(strReverse);
//   }
      
//      StringBuilder sb = new StringBuilder(str);
//      System.out.println("reversed:" + sb.reverse());
//      
	  String str = "a---b-----c----d";
	  
//	  Character[] c = null;
////	  
//	  for(int i=0; i<str.length(); i++){
//		  
//		  c[i] = str.charAt(i);
//		  
//		  if( c[i] > 1)
//			  System.out.println("more than 1");
//			 
////		  if(c.compareTo(c)==0)
////			  return;
//	  }
////		  
	  
	  System.out.println(str.length());
	System.out.println(str.substring(0, 4)); 
	  System.out.println(str.toUpperCase());
			  char ch ='-';
      StringTok.removechar(str,ch);
      System.out.println(StringTok.removechar(str,ch));
      
   }
}