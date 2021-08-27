package day1;

import java.util.Scanner;

public class swappingof2numbers {

	public static void main(String[] args) {
		int a,b;
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("First input:");
		a= sc.nextInt();
		System.out.print("second input:");
		b=sc.nextInt();
	    c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);

	}

}
