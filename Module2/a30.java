package Module2;

import java.util.ArrayList;
import java.util.List;

public class a30 {
	public static void main(String[] args) {
		  List list = new ArrayList();
		  list.add("Tony");
		  list.add("Stark");
		  list.add(0);
		  list.add("12345");
		  System.out.println(list);
	      if(list.contains("Stark")) {
	    	  System.out.println("found element");
	      }
	      else {
	    	  System.out.println("not found element");
	      }
	}
}
