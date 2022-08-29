package Module2;

import java.util.HashSet;
import java.util.Iterator;

public class a34 {

	public static void main(String[] args) {
	      HashSet<String> h = new HashSet<String>();    
	         h.add("Tony");
			 h.add("Stark");
			 h.add("Thor");
		     h.add("Peter");  

	      System.out.println("The hash set:"+h);
	        Iterator<String> itr=h.iterator();  
	        
	        while(itr.hasNext()){    
	           System.out.println(itr.next());    
	        }    
	}

}
