package practice.day2;

import java.util.Scanner;

public class ForLoop_NaturalNumbers {
	//private static int i;
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a numer");
			
		int num =s.nextInt();
		
		s.close();
		for(int i=1;i<=num;i++) {
		
			 sum = sum+i;
		}
		
		System.out.println(sum);
	}
}
