package Module2;

import java.util.ArrayList;

public class a51 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(3);
        a.add("ABC");
        a.add("XYZ");
        System.out.println(a);
       
        a.ensureCapacity(6);
        a.add("DEF");
        a.add("UVW");
        System.out.println("array list: " + a);

	}

}
