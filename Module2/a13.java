package Module2;

class triangle{
	int i,j,k;
	private int angle;
	public void angle(int i,int j,int k) {
		
		this.i=i;
		this.j=j;
		this.k=k;
		int angle=i+j+k;
		System.out.println(angle);
	}
	public void area(int i,int j,int k) {
		int angle;
		this.i=i;
		this.j=j;
		this.k=k;
		int s=(i+j+k)/2;
		int r=s*(s-i)*(s-j)*(s-k);
		int area=(int)Math.sqrt(r);
		System.out.println(area);
	}
	
}

public class a13 {

	public static void main(String[] args) {
		triangle t= new triangle();
		t.angle(3, 4, 5);
		t.area(3, 4, 5);

	}

}
