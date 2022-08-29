package Module2;

import java.util.ArrayList;
import java.util.List;

public class a40 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Tony");
    	list.add("Stark");
    	list.add("Thor");
        list.add("Peter"); 
		System.out.println(list);
		List<String> list1=list.subList(0, 2);
		System.out.println("the element"+list1);
	}

}
