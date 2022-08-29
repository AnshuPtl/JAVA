package Module2;

import java.util.ArrayList;
import java.util.List;

public class a43 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Tony");
    	list.add("Stark");
    	list.add("Thor");
        list.add("Peter"); 
		System.out.println("Old List:"+list);
		List<String> list1=new ArrayList<>();
		list1.add("Bruce");
		list1.add("Loki");
		list1.add("Vision");
		list1.add("Jarvis");
		System.out.println("New List:"+list1);
		List<String> l=new ArrayList<>();
		l.addAll(list);
		l.addAll(list1);
		System.out.println("New Array"+l);

	}

}
