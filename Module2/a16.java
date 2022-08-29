package Module2;

abstract class bank{
	public abstract void  getBalance(); 
}
class bankA extends bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited: $100 ");
		
	}
	
}
class bankb extends bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited: $150 ");
		
	}
	
}
class bankc extends bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited: $200 ");
		
	}
	
}

public class a16 {

	public static void main(String[] args) {
		 bankA A =new bankA();
	     A.getBalance();
	     bankb b= new bankb();
	     b.getBalance();
	     bankc c= new bankc();
	     c.getBalance();
	}

}
