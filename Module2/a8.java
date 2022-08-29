package Module2;

class xyz{
	public void printn(int i, char c) {
		System.out.println("interger: "+i +" character: "+c);
	}
	public void printn(char c, int i) {
		System.out.println("character: "+c+" interger: "+i);
	}
}

public class a8 {

	public static void main(String[] args) {
		xyz x = new xyz();
		x.printn(0, 'T');;
		x.printn('S', 1);

	}

}
