package Module2;

class shape{
	public void ThisisShape() {
		System.out.println("This is shape class");
	}
}
class rectangle extends shape{
	public void ThisisRactangle() {
		System.out.println("This is rectangle class");
		
	}
}
class cirlce extends shape{
	public void ThisisCircle() {
		System.out.println("This is cirlce class");
	}
}
class square extends rectangle{
	public void SquareisRectangle() {
		System.out.println("This is square class");
	}
}

public class a19 {

	public static void main(String[] args) {
		square s = new square();
		s.ThisisShape();
		s.ThisisRactangle();
	}

}
