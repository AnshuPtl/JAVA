package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a39 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();   
    	list.add("Tony");
    	list.add("Stark");
    	list.add("Thor");
        list.add("Peter"); 
    	
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse method"+list);

	}

}
