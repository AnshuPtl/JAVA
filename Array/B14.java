package Array;

import java.util.Scanner;

public class B14 {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5};
		int count = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		for(int j=1;j<i.length;j++) {
			if(num == i[j]) {
				count=1;
			}
		}
		if(count==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
