package Module2;

import java.util.HashSet;

public class a44 {

	public static void main(String[] args) {
	    HashSet<String> list = new HashSet<String>();
	    list.add("Edith");
		list.add("Friday");
		list.add("Vision");
		list.add("Jarvis");
    	System.out.println("AI:"+list);
        String arr[] = new String[list.size()];
        list.toArray(arr);
        for(String s:arr){
          System.out.println(s);
        }

	}

}
