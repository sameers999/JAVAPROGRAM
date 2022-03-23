package practice.day2;

import java.util.Scanner;

public class WhileLoop_NaturalNumbers {
	private static int i;
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a numer");
			
		int num =s.nextInt();
		
		s.close();
		//using while loop
		
		while (i<=num) {
			

			sum= sum+i;
			i++;
		
		}
		System.out.println(sum);
	}
}
