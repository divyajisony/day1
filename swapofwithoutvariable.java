package day1;

import java.util.Scanner;

public class swapofwithoutvariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("First input:");
		a= sc.nextInt();
		System.out.print("second input:");
		b=sc.nextInt();
	    a=a+b;
	    b=a-b;
	    a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
