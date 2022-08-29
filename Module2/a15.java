package Module2;

abstract class Parents{
	public abstract void message();
}
class son extends Parents {

	@Override
	public void message() {
		System.out.println("This first subclass");
		
	}		
}
class daughter extends Parents{

	@Override
	public void message() {
		System.out.println("This second subclass");
		
	}
	
}

public class a15 {

	public static void main(String[] args) {
		son s =new son();
		s.message();
		daughter d = new daughter();
		d.message();

	}

}
