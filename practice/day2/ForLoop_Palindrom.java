package practice.day2;

import java.util.Scanner;

public class ForLoop_Palindrom {
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum =0;

		int temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a numer");

		int num =s.nextInt();

		s.close();

		//		reverse the number

		int	revers=0;
		
		temp=num;
		while(num!=0) {

			int	sameer= num%10;

			revers=revers *10 +sameer;
			num=num/10;


		}

		if (temp==revers){

			System.out.println("it is a polindrem");
		}
		else {
			System.out.println("is not a polindrem");
		}

		//		System.out.println(num);

		System.out.println(revers);




	}



}
