package practice.day2;

import java.util.Scanner;

	public class Whileloop_Reverse {
	//private static int ;
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a numer");
			
		int num =s.nextInt();
		
		s.close();
		
		int	revers=0;
		
		while(num!=0) {
			
		int	sameer= num%10;
		
	   revers=revers *10 +sameer;
	   num=num/10;
	   
//		reverse the number
		}
		System.out.println(num);
		
		System.out.println(revers);
		
		
		
		
	}
}
