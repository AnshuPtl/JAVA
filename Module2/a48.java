package Module2;

import java.util.ArrayList;
import java.util.List;

public class a48 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Edith");
		list.add("Friday");
		list.add("Jarvis");
		   System.out.println(list);
		   
		   int i=list.size();
		   for (int j=0;j<i;j++) {
			System.out.println(list.get(j));
		   }
	}

}
