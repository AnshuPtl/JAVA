package Module2;

class area{
	int area;
	public void rectangle(int b, int l) {
		
		area=b*l;
		System.out.println(area);
		
	}
	public void square(int l) {
		area=l*l;
		System.out.println(area);
	}
}

public class a9 {

	public static void main(String[] args) {
		area a = new area();
		a.rectangle(65, 75);
		a.square(80);

	}

}
