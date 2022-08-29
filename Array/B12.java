package Array;

import java.util.Scanner;

public class B12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i[] = new int[5];
		int add=0;
		for(int j=0;j<=1;j++) {
			System.out.print("Enter element at index "+j+" : ");
			i[j]=sc.nextInt();
		}
		for(int j=0;j<=1;j++) {
			System.out.println(i[j]);
		}
		System.out.println("--------------------------------");
		for(int j=0;j<=1;j++) {
			add=add+i[j];
		}
		System.out.println("Addition of elements : "+add+"");
		

	}

}
