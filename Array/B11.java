package Array;

import java.util.Scanner;

public class B11 {
	public static void main(String[] args) {
		int i [] = new int [3];
		Scanner sc = new Scanner(System.in);
		for (int j=0;j<=2;j++) {
			System.out.println("Enter element at index "+j+": ");
			i[j] = sc.nextInt();
		}
		for(int j=0;j<=2;j++) {
			System.out.println(i[j]);
		}
		int temp;
		for(int j=0;j<=2;j++) {
			for(int k=j+1;k<=2;k++) {
				if(i[j]>i[k]) {
					temp=i[j];
					i[j]=i[k];
					i[k]=temp;
				}
				
			}
		}
		System.out.println("--------------------------------------------------\n");
		for(int j=0;j<=2;j++) {
			System.out.println(i[j]);
		}
		System.out.println("----------------------------------------------------------------------------------------\n");
		String l[] = new String[5];
		Scanner sc1 = new Scanner(System.in);
		for (int s=0;s<=2;s++) {
			System.out.println("Enter element at index "+s+": ");
			l[s] = sc.nextLine();
		}
		for(int s=0;s<=2;s++) {
			System.out.println(l[s]);
		}
		String tmp;
		for(int s=0;s<=2;s++) {
			for(int k=s+1;k<=2;k++) {
				if(l[s].compareTo(l[k])>0) {
					tmp=l[s];
					l[s]=l[k];
					l[k]=tmp;
			}
			
		}
	}
	System.out.println("--------------------------------------------------\n");
	for(int s=0;s<=2;s++) {
		System.out.println(l[s]);
	}
}
}
