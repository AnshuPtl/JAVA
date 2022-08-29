package Module2;

class Complex{
	private final int real;
	private final int  imaginary;
	public Complex(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
		
	}
	public Complex sum(Complex other) {
		int r=this.real+other.real;
		int i=this.imaginary+other.imaginary;
		return new Complex(r, i);
	}
	public Complex differnce(Complex other) {
		int r=this.real-other.real;
		int i=this.imaginary-other.imaginary;
		return new Complex(r, i);
	}
	public int getreal() {
		return real;
	}
	public int getimaginary() {
		return real;
	}
	@Override
	public String toString() {
		
		return real+"+"+imaginary;
	}
	
}

public class a14 {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 20);
		Complex c2= new Complex(30, 40);
		Complex sum=c1.sum(c2);
		Complex difference=c1.differnce(c2);
		System.out.println("first: "+c1);
		System.out.println("second: "+c2);
		System.out.println("sum: "+sum);
		System.out.println("difference: "+difference);

	}

}
