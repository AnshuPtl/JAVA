package Module2;

public class a21 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
			System.out.println(a[3]);
		} catch (ArithmeticException e) {
			System.out.println("Cannot devisible by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of index");
		}
	}
}
