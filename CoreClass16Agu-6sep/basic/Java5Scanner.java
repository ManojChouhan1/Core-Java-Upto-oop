package COM.COMPANY.BASIC;

import java.util.Scanner;

public class Java5Scanner {

	public static void main(String[] args) {
		
		System.out.println("Tacking input from the user");
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter no. 1a-->");	
		int a = sc.nextInt();
		System.out.print("Enter no. 2b-->");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.print("The sum of this no. -->");
		System.out.println(sum);
		
		
		System.out.print("Enter no. 1c-->");
		float  c = sc.nextFloat();
		
		System.out.print("Enter no. 2-->");
		float d = sc.nextFloat();
		float sum1 = c+d;
		System.out.print("The sum1 of this no. -->");

		System.out.println(sum1);
		
		
		
		boolean b1 = sc.hasNextInt();   
		System.out.println(b1);
		
		String str = sc.next();
		String str1 = sc.nextLine();
		System.out.println(str);
		System.out.println(str1);
	}
}
