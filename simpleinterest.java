package day1;

import java.util.Scanner;

public class simpleinterest {
	public static void main(String[] args) {
		int x,y;
		double z,s;
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter a intrest:");
		x=sc.nextInt();
		System.out.print("enter a period:");
		y=sc.nextInt();
		System.out.print("rate of intrest:");
		z=sc.nextInt();
		s=(x*y*z)/100;
		System.out.print(+s);

	}

}
