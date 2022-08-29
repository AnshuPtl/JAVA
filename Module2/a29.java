package Module2;

import java.util.ArrayList;
import java.util.List;

public class a29 {

	public static void main(String[] args) {
		  List list = new ArrayList();
		  list.add("Tony");
		  list.add("Stark");
		  list.add(0);
		  list.add("!@#");
		  list.add("12345");;
		  System.out.println(list);
	      list.remove(2);
	      System.out.println("removed list:"+list);
	}

}
