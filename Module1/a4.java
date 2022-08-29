package Module1;

import java.util.Scanner;

public class a4 {
	  public static void main(String[] args){       
	    int i,n=0,sum=0;
		double avg;
	    System.out.println("Input the 5 numbers : ");    
		
		for (i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			sum+=n;
		}
		
		avg=sum/5;
		System.out.println("The sum of 5 numbers is : " +sum+"\n Average is : " +avg);
	  }
}