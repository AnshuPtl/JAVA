package Module1;

import java.util.Scanner;

public class a6 {

	public static void main(String[] args) {
		int i, j, k = 1, l;
		System.out.print("Input number of rows : ");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		for (i = 1; i <= l; i++) {
		for (j = 1; j <= i; j++)
		System.out.print(k++);
		System.out.println("");
		}
	}

}
