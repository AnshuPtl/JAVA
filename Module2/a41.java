package Module2;

import java.util.ArrayList;
import java.util.List;

public class a41 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tony");
    	list.add("Stark");
    	list.add("Thor");
        list.add("Peter"); 
		 System.out.println("The list of first element: " + list);
		 List<String> list1 = new ArrayList<String>();
		    list1.add("Tony");
	    	list1.add("Stark");
	    	list1.add("Thor");
	        list1.add("Peter"); 
		  System.out.println("The list of second element: " + list1);
		  boolean b=list.equals(list1);
		  System.out.println(b);
		 
	}

}
