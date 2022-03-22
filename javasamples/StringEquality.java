package javasamples;

import java.util.Scanner;

public class StringEquality {
	public static void main(String args[]) {
		String str1, str2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first String");
		str1 = scan.nextLine();
		
		System.out.println("Enter second String");
		str2 = scan.nextLine();
		scan.close();
		//Comparing two input String
		if (str1.equals(str2))
			System.out.print("Equal Strings");
		else
			System.out.print("UnEqual Strings");
	}
}
