package Module2;

import java.util.Scanner;

public class a25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Total Amount:");
		int balance=sc.nextInt();
		
		System.out.print("Enter the Amount to withdraw: ");
		int withdraw = sc.nextInt();
		if(withdraw<balance) {
			balance=balance-withdraw;
			System.out.print("Total Balance: "+balance);}	
		else {
			throw new ArithmeticException("Sorry, Insuffcient Balance. Youe need more 500 RS.");
			}

	}

}
