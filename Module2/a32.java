package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a32 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		 list.add("Tony");
		 list.add("Stark");
		 list.add("Thor");
	     list.add("Peter");
		 System.out.println("The list of first element: " + list);
		  List<String> list1 = new ArrayList<String>();
		  list1.add("Strange");
		  list1.add("Bruce");
		  list1.add("ABC");
		  list1.add("AMD");
		  System.out.println("The list of second element: " + list1);
		  List<String> list2 = new ArrayList<String>();
		  list2.add("A");
		  list2.add("B");
		  list2.add("C");
		  list2.add("D");
		  System.out.println("The list of second element: " + list2);
		  Collections.copy(list, list1);
		  Collections.copy(list2, list1);
		  System.out.println("After copy:");
		  System.out.println("The list of first element: " + list);
		  System.out.println("The list of second element: " + list1);
		  System.out.println("The list of second element: " + list2);

	}

}
