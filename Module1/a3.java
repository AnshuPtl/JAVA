package Module1;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year;
        year = sc.nextInt();
		System.out.println(year);
		
        boolean i = (year % 4) == 0;
        boolean j = (year % 100) != 0;
        boolean k = ((year % 100 == 0) && (year % 400 == 0));

        if (i && (j || k))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

	}

}
