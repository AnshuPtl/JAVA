package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a42 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Tony");
    	list.add("Stark");
    	list.add("Thor");
        list.add("Peter"); 
		System.out.println(list);
		Collections.swap(list, 4, 1);
		System.out.println("Swap list"+list);
	}

}
