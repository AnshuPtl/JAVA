package Module2;

class PrintNumber{
	public void printn(int i) {
		System.out.println(i);
	}
	public void printn(float f) {
		System.out.println(f);
	}
	public void printn(double d) {
		System.out.println(d);
	}
	public void printn(char c) {
		System.out.println(c);
	}
}

public class a7 {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		p.printn(11);
		p.printn(12.34);
		p.printn(10000.1);
		p.printn('A');

	}

}
