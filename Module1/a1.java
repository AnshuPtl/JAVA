package Module1;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of i : ");
		i = sc.nextInt();
		System.out.println(i);
		System.out.println("enter value of j : ");
		j = sc.nextInt();
		System.out.println(j);
		System.out.println("enter value of k : ");
		k = sc.nextInt();
		System.out.println(k);
		
		if (i > j && i > k)
		      System.out.println("i number is the largest.");
		    else if (j > i && j > k)
		      System.out.println("j number is the largest.");
		    else if (k > i && k > j)
		      System.out.println("k number is the largest.");
		    else
		      System.out.println("The numbers are Same.");
	}
}
