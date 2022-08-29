package Module2;

import java.util.ArrayList;
import java.util.List;

public class a28 {

	public static void main(String[] args) {
		  List list1 = new ArrayList();
		  list1.add("Tony");
		  list1.add("Stark");
		  list1.add(0);
		  list1.add("12345");
		  System.out.println(list1);
	      list1.set(1, "Thor");
	      System.out.println("update list:"+list1);

	}

}
