package Module2;

import java.util.ArrayList;
import java.util.List;

public class a49 {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		    list.add("Tony");
	    	list.add("Stark");
	    	list.add("Thor");
	        list.add("Peter"); 
		 System.out.println("The list of first element: " + list);
		  List<String> list1 = new ArrayList<String>();
		    list1.add("Edith");
			list1.add("Friday");
			list1.add("Jarvis");
			list1.add("Ultron");
		  System.out.println("The list of second element: " + list1);
		  list.retainAll(list1);
		  System.out.println("retain"+list);

	}

}
