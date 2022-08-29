package Module2;

import java.util.ArrayList;
import java.util.List;

public class a47 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Edith");
		list.add("Friday");
		list.add("Jarvis");
		System.out.println(list);
		String list1="Vision";
		list.set(0, list1);
		System.out.println("replace"+list);

	}

}
