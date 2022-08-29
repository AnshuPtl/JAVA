package Module2;

class parent{
	public void par() {
		System.out.println("This is a parent class");
	}
}

class child extends parent{
	public void chi() {
		System.out.println("This is child class");
	}
}

public class a10 {

	public static void main(String[] args) {
		parent p = new parent();
		p.par();
		child c= new child();
		c.chi();
		c.par();
	}

}
