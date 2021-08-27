package day1;

import java.util.Scanner;

public class fechingtheground {

	public static void main(String[] args) {
		int x,y;
		int len,bre;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter lenght value:");
		x=sc.nextInt();
		System.out.print("enter breadth value:");
		y=sc.nextInt();
	    len=2*x+2*y;
		bre=x*y;
		System.out.println(len);
		System.out.println(bre);
	}

}
